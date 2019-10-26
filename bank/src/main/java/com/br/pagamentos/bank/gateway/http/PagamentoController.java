package com.br.pagamentos.bank.gateway.http;

import com.br.pagamentos.bank.gateway.json.PagamentoJson;
import com.br.pagamentos.bank.gateway.json.RetornoJson;
import com.br.pagamentos.bank.service.pagamento.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @PostMapping(path = "/pagamento")
    public ResponseEntity<RetornoJson> pagamento(
            @Valid @NotNull @RequestBody PagamentoJson pagamentoJson) {

        pagamentoService.pagamento(pagamentoJson);

        RetornoJson retorno = new RetornoJson();
        retorno.setMensagem("Pagamento registrado com sucesso");

        return new ResponseEntity<>(retorno, HttpStatus.OK);
    }
}
