package com.ken_lapis.dto;

import com.ken_lapis.domain.Aluno;
import com.ken_lapis.domain.Curso;
import com.ken_lapis.domain.Status;

public record MatriculaDTO(Status status,
                           Aluno aluno,
                           Curso curso) {
}
