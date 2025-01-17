-- A=ATIVO I=INATIVO C=CONCLUIDO E=EXCLUIDO
CREATE TYPE mood AS ENUM ('A','I','C','E');

CREATE TABLE alunos(
  id SERIAL,
  status mood,
  cadastro_id BIGINT,

  PRIMARY KEY (id),
  CONSTRAINT fk_cadastro_alunos_id FOREIGN KEY (cadastro_id) REFERENCES cadastros(id)
);