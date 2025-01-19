CREATE TABLE cadastros(
  id SERIAL,
  nome VARCHAR(100) NOT NULL,
  cpf VARCHAR(11) NOT NULL,

  PRIMARY KEY (id)
);

INSERT INTO cadastros (nome, cpf) VALUES
('João da Silva', '12345678901'),
('Maria Fernandes', '23456789012'),
('Pedro Almeida', '34567890123'),
('Ana Souza', '98765432109'),
('Carlos Oliveira', '56789012345'),
('Bruna Santos', '67890123456'),
('Felipe Pereira', '78901234567'),
('Amanda Gomes', '89012345678'),
('Ricardo Costa', '90123456789'),
('Juliana Rodrigues', '01234567890'),
('Rafael Silva', '12345678901'),
('Larissa Pereira', '23456789012'),
('Gustavo Santos', '34567890123'),
('Camila Oliveira', '45678901234'),
('Daniel Almeida', '56789012345'),
('Fernanda Gomes', '67890123456'),
('Gabriel Costa', '78901234567');