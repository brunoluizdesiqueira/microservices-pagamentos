package com.br.pagamentos.buyprocess.service.bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoRetorno {
    private String mensagem;
    private boolean pagamentoOK;

}