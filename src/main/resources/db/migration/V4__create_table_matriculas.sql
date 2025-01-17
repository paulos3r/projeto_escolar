CREATE TABLE matriculas(
  id SERIAL,
  status mood,
  aluno_id BIGINT,
  curso_id BIGINT,

  PRIMARY KEY (id),
  CONSTRAINT fk_matricula_alunos FOREIGN KEY (aluno_id) REFERENCES alunos(id),
  CONSTRAINT fk_matricula_cursos FOREIGN KEY (curso_id) REFERENCES cursos(id)
  )