package com.br.pagamentos.bank.gateway.repository;

import com.br.pagamentos.bank.domain.Pagamento;
import org.springframework.data.repository.CrudRepository;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {
}
