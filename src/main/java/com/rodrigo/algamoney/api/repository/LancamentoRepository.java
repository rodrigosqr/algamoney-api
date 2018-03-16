package com.rodrigo.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.algamoney.api.model.Lancamento;
import com.rodrigo.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
