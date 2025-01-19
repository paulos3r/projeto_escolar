CREATE TABLE matriculas(
  id SERIAL,
  status mood,
  aluno_id BIGINT,
  curso_id BIGINT,

  PRIMARY KEY (id),
  CONSTRAINT fk_matricula_alunos FOREIGN KEY (aluno_id) REFERENCES alunos(id),
  CONSTRAINT fk_matricula_cursos FOREIGN KEY (curso_id) REFERENCES cursos(id)
  );

  INSERT INTO matriculas (status, aluno_id, curso_id) VALUES
  ('A',1, 1),
  ('A',2, 2),
  ('A',3, 1),
  ('A',4, 1),
  ('A',5, 2),
  ('A',6, 2),
  ('A',7, 2),
  ('A',8, 2),
  ('A',9, 2),
  ('A',10, 2),
  ('A',11, 2),
  ('A',12, 1),
  ('A',13, 1),
  ('A',14, 1);