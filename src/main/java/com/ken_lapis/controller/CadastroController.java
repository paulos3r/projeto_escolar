package com.ken_lapis.controller;

import com.ken_lapis.dto.CadastroDTO;
import com.ken_lapis.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadastroController {

  @Autowired
  private CadastroService service;

  @GetMapping("/cadastro")
  public List<CadastroDTO> obterCadastro(){
    return service.listar();
  }
}
