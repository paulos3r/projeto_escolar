package com.ken_lapis.service;

import com.ken_lapis.domain.Cadastro;
import com.ken_lapis.dto.CadastroDTO;
import com.ken_lapis.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

  @Autowired
  private CadastroRepository repository;

  public CadastroDTO obterCadastro(){
    //busca pelo repository
    Cadastro cadastro = repository.obterTodosCadastros();
    cadastro.toString();
    //retorno dto
    return null; // new CadastroDTO(cadastro.nome, cadastro.cpf);

  }
}