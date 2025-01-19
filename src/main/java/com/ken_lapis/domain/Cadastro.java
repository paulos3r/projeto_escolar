package com.ken_lapis.domain;

import com.ken_lapis.dto.CadastroDTO;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "cadastros")
@Getter
public class Cadastro {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String nome;
  private String cpf;

  public Cadastro() {
  }

  public Cadastro(long id, String nome, String cpf) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
  }

  public Cadastro(CadastroDTO cadastro) {
    this.cpf = cadastro.cpf();
    this.nome = cadastro.nome();
  }

  @Override
  public String toString() {
    return "Cadastro{" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            ", cpf='" + cpf + '\'' +
            '}';
  }
}
