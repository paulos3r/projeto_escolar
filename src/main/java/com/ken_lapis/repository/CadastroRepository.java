package com.ken_lapis.repository;

import com.ken_lapis.domain.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
  @Query(nativeQuery = true, value = "SELECT * FROM cadastros")
  List<Cadastro> obterTodosCadastros();
}
