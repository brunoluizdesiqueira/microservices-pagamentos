package com.br.pagamentos.bank.service.pagamento;

import com.br.pagamentos.bank.domain.Pagamento;
import com.br.pagamentos.bank.exceptions.PagamentoException;
import com.br.pagamentos.bank.gateway.json.PagamentoJson;
import com.br.pagamentos.bank.gateway.repository.PagamentoRepository;
import com.br.pagamentos.bank.service.cartao.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PagamentoService{

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private CartaoService cartaoService;

    @Transactional
    public void pagamento(PagamentoJson pagamentoJson){

        if( !cartaoService.isValido(pagamentoJson.getCodigoSegurancaCartao(), pagamentoJson.getNroCartao()) ){
            throw new PagamentoException("Cartão inválido.");
        }

        if( !cartaoService.isSaldoSuficiente(pagamentoJson.getCodigoSegurancaCartao(), pagamentoJson.getNroCartao(), pagamentoJson.getValorCompra()) ){
            throw new PagamentoException("Cartão não possui saldo suficiente.");
        }

        Pagamento pagamento = new Pagamento();
        pagamento.setValorCompra(pagamentoJson.getValorCompra());
        pagamento.setCartao(cartaoService.getCartao(pagamentoJson.getCodigoSegurancaCartao(), pagamentoJson.getNroCartao()));

        pagamentoRepository.save(pagamento);

        cartaoService.atualizarSaldo(pagamentoJson.getCodigoSegurancaCartao(), pagamentoJson.getNroCartao(), pagamentoJson.getValorCompra());
    }

}
