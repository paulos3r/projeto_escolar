-- A=ATIVO I=INATIVO C=CONCLUIDO E=EXCLUIDO
CREATE TYPE mood AS ENUM ('A','I','C','E');

CREATE TABLE alunos(
  id SERIAL,
  status mood,
  cadastro_id BIGINT,

  PRIMARY KEY (id),
  CONSTRAINT fk_cadastro_alunos_id FOREIGN KEY (cadastro_id) REFERENCES cadastros(id)
);

INSERT INTO alunos (status, cadastro_id) VALUES
('A', 1),
('I', 2),
('A', 3),
('A', 4),
('I', 5),
('A', 6),
('I', 7),
('A', 8),
('A', 9),
('I', 10),
('A', 11),
('I', 12),
('A', 13),
('A', 14),
('I', 15),
('A', 16),
('I', 17);