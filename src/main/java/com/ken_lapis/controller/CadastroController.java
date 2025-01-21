package com.ken_lapis.controller;

import com.ken_lapis.domain.Cadastro;
import com.ken_lapis.dto.CadastroDTO;
import com.ken_lapis.service.CadastroService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

  @Autowired
  private CadastroService service;

  @GetMapping()
  public ResponseEntity<List<CadastroDTO>> listar(){
    List<CadastroDTO> cadastro = service.listar();
    return ResponseEntity.ok(cadastro);
  }

  @PostMapping
  @Transactional
  public ResponseEntity cadastrar(@RequestBody CadastroDTO dto){
    try {
      service.cadastrar(dto);
    }catch (Exception ex){
      return ResponseEntity.badRequest().body(ex.getMessage());
    }
    return ResponseEntity.ok().body(dto);
  }
}
