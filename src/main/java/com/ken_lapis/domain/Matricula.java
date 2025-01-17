package com.ken_lapis.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "matriculas")
public class Matricula {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Enumerated(EnumType.STRING)
  private Status status; // cursando, concluido, cancelado
  @ManyToOne
  private Aluno aluno;
  @ManyToOne
  private Curso curso;
}
