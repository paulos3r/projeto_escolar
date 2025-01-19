package com.ken_lapis.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Enumerated(EnumType.STRING)
  private Status status;
  @OneToOne
  private Cadastro cadastro;
}