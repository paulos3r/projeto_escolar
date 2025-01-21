package com.ken_lapis.dto;

import com.ken_lapis.domain.Cadastro;

public record CadastroDTO(String nome,
                          String cpf) {

  public CadastroDTO(Cadastro cadastro){
    this(cadastro.getNome(), cadastro.getCpf());
  }

}
