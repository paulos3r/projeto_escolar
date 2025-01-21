package com.ken_lapis.service;

import com.ken_lapis.domain.Cadastro;
import com.ken_lapis.dto.CadastroDTO;
import com.ken_lapis.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {

  @Autowired
  private CadastroRepository repository;

  public List<CadastroDTO> listar(){
    return repository.findAll().stream().map(CadastroDTO::new).toList();

  }

  public void cadastrar(CadastroDTO dto) {

    if (dto.nome().isEmpty()){
      throw new RuntimeException("nome nao existe");
    }
    if (dto.cpf().isEmpty()){
      throw new RuntimeException("cpf nao existe");
    }
    Cadastro cadastro = new Cadastro(dto);

    repository.save(cadastro);
  }
}