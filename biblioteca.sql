-- Postgres SQL.

-- Database Library system.

CREATE TABLE endereco (
    id_endereco integer PRIMARY KEY,
    nm_estado character varying(20) NOT NULL,
    nm_cidade character varying(30) NOT NULL,
    nm_logradouro character varying(10)
);

CREATE TABLE editora (
    id_editora integer PRIMARY KEY,
    nm_editora character varying(30) NOT NULL,
    id_endereco integer NOT NULL REFERENCES endereco (id_endereco)
);

CREATE TABLE livro (
    id_livro integer PRIMARY KEY,
    nm_titulo character varying(60) NOT NULL,
    nm_genero character varying(20),
    nu_edicao character varying(2),
    id_editora integer NOT NULL REFERENCES editora (id_editora)
);

CREATE TABLE autor (
    id_autor integer PRIMARY KEY,
    nm_autor character varying(60) NOT NULL,
    nm_citacao character varying(30)
);

CREATE TABLE livro_autor (
    id_livro integer NOT NULL REFERENCES livro (id_livro),
    id_autor integer NOT NULL REFERENCES autor (id_autor),
    PRIMARY KEY (id_livro, id_autor)
);

CREATE TABLE exemplar (
    id_exemplar integer NOT NULL,
    id_livro integer NOT NULL REFERENCES livro (id_livro),
    nu_quantidade integer default 0,
    PRIMARY KEY (id_exemplar, id_livro)
);

CREATE TABLE usuario (
    id_usuario integer PRIMARY KEY,
    nm_usuario character varying(60) NOT NULL,
    nm_status character varying(20) NOT NULL default 'Ativo',
    nu_idade integer
);

CREATE TABLE telefone (
    id_usuario integer NOT NULL REFERENCES usuario (id_usuario),
    nu_telefone character varying(9) NOT NULL,
    PRIMARY KEY (id_usuario, nu_telefone)
);

CREATE TABLE aluguel (
    id_usuario integer NOT NULL REFERENCES usuario (id_usuario),
    id_exemplar integer NOT NULL REFERENCES exemplar (id_exemplar),
    id_livro integer NOT NULL REFERENCES exemplar (id_livro),
    dt_aluguel date NOT NULL,
    dt_entrega date NOT NULL,
    PRIMARY KEY (id_usuario, id_exemplar, id_livro)
);