CREATE TABLE cursos(
  id SERIAL,
  nome VARCHAR(30),
  data DATE,

  PRIMARY KEY (id)
);

INSERT INTO cursos (nome, data)
VALUES
    ('Introdução à Programação', '2023-11-01'),
    ('Banco de Dados', '2024-01-10');