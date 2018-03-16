package com.rodrigo.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
