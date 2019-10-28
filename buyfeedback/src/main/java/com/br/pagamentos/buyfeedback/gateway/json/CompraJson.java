package com.br.pagamentos.buyfeedback.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown=true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraJson {

    private Integer codigoPassagem;

    private Integer nroCartao;

    private Integer codigoSegurancaCartao;

    private BigDecimal valorPassagem;

}