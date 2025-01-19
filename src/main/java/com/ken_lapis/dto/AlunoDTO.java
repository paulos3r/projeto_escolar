package com.ken_lapis.dto;

import com.ken_lapis.domain.Cadastro;
import com.ken_lapis.domain.Status;

public record AlunoDTO(Status status,
                       Cadastro cadastro) {
}
