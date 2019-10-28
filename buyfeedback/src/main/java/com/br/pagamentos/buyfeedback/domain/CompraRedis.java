package com.br.pagamentos.buyfeedback.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.math.BigDecimal;

@RedisHash("compra")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraRedis {

    @Id
    private String id;
    private String mensagem;
    private Integer codigoPassagem;
    private Integer nroCartao;
    private BigDecimal valorPassagem;
    private boolean pagamentoOK;
}


