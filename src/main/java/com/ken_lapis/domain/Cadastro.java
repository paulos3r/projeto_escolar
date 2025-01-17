package com.ken_lapis.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cadastros")
public class Cadastro {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nome;
  private String cpf;
}
