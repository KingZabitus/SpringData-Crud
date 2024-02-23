CREATE DATABASE crudAPI;

USE crudAPI;

CREATE TABLE empregado (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    genero VARCHAR(255),
    departamento VARCHAR(255),
    aniversario DATE
)