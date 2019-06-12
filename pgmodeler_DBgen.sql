-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.1-beta
-- PostgreSQL version: 10.0
-- Project Site: pgmodeler.com.br
-- Model Author: ---


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: new_database | type: DATABASE --
-- -- DROP DATABASE IF EXISTS new_database;
-- CREATE DATABASE new_database
-- ;
-- -- ddl-end --
-- 

-- object: public.livro | type: TABLE --
-- DROP TABLE IF EXISTS public.livro CASCADE;
CREATE TABLE public.livro(
	id_livro serial NOT NULL,
	nu_edicao smallint,
	nm_title varchar,
	nm_genero varchar,
	id_editora integer,
	CONSTRAINT livro_pk PRIMARY KEY (id_livro)

);
-- ddl-end --
ALTER TABLE public.livro OWNER TO postgres;
-- ddl-end --

-- object: public.autor | type: TABLE --
-- DROP TABLE IF EXISTS public.autor CASCADE;
CREATE TABLE public.autor(
	id_autor serial NOT NULL,
	nm_autor varchar,
	nm_citacao varchar,
	CONSTRAINT autor_pk PRIMARY KEY (id_autor)

);
-- ddl-end --
ALTER TABLE public.autor OWNER TO postgres;
-- ddl-end --

-- object: public.editora | type: TABLE --
-- DROP TABLE IF EXISTS public.editora CASCADE;
CREATE TABLE public.editora(
	id_editora serial NOT NULL,
	nm_editora varchar,
	logradouro varchar,
	estado varchar,
	cidade varchar,
	CONSTRAINT editora_pk PRIMARY KEY (id_editora)

);
-- ddl-end --
ALTER TABLE public.editora OWNER TO postgres;
-- ddl-end --

-- object: public.usuario | type: TABLE --
-- DROP TABLE IF EXISTS public.usuario CASCADE;
CREATE TABLE public.usuario(
	id_usuario serial NOT NULL,
	telefone varchar,
	nu_idade smallint,
	status boolean,
	nm_usuario varchar,
	CONSTRAINT usuario_pk PRIMARY KEY (id_usuario)

);
-- ddl-end --
ALTER TABLE public.usuario OWNER TO postgres;
-- ddl-end --

-- object: public.exemplar | type: TABLE --
-- DROP TABLE IF EXISTS public.exemplar CASCADE;
CREATE TABLE public.exemplar(
	id_exemplar serial NOT NULL,
	nu_quantidade integer,
	id_livro integer NOT NULL,
	CONSTRAINT exemplar_pk PRIMARY KEY (id_exemplar,id_livro)

);
-- ddl-end --
ALTER TABLE public.exemplar OWNER TO postgres;
-- ddl-end --

-- object: public.autoria | type: TABLE --
-- DROP TABLE IF EXISTS public.autoria CASCADE;
CREATE TABLE public.autoria(
	id_autor integer NOT NULL,
	id_livro integer NOT NULL,
	CONSTRAINT autoria_pk PRIMARY KEY (id_autor,id_livro)

);
-- ddl-end --

-- object: autor_fk | type: CONSTRAINT --
-- ALTER TABLE public.autoria DROP CONSTRAINT IF EXISTS autor_fk CASCADE;
ALTER TABLE public.autoria ADD CONSTRAINT autor_fk FOREIGN KEY (id_autor)
REFERENCES public.autor (id_autor) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: livro_fk | type: CONSTRAINT --
-- ALTER TABLE public.autoria DROP CONSTRAINT IF EXISTS livro_fk CASCADE;
ALTER TABLE public.autoria ADD CONSTRAINT livro_fk FOREIGN KEY (id_livro)
REFERENCES public.livro (id_livro) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: editora_fk | type: CONSTRAINT --
-- ALTER TABLE public.livro DROP CONSTRAINT IF EXISTS editora_fk CASCADE;
ALTER TABLE public.livro ADD CONSTRAINT editora_fk FOREIGN KEY (id_editora)
REFERENCES public.editora (id_editora) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: livro_fk | type: CONSTRAINT --
-- ALTER TABLE public.exemplar DROP CONSTRAINT IF EXISTS livro_fk CASCADE;
ALTER TABLE public.exemplar ADD CONSTRAINT livro_fk FOREIGN KEY (id_livro)
REFERENCES public.livro (id_livro) MATCH FULL
ON DELETE CASCADE ON UPDATE CASCADE;
-- ddl-end --

-- object: public.aluguel | type: TABLE --
-- DROP TABLE IF EXISTS public.aluguel CASCADE;
CREATE TABLE public.aluguel(
	id_usuario integer NOT NULL,
	id_exemplar integer NOT NULL,
	id_livro integer NOT NULL,
	dt_aluguel date NOT NULL DEFAULT CURRENT_TIMESTAMP,
	dt_entrega date,
	CONSTRAINT aluguel_pk PRIMARY KEY (id_usuario,id_exemplar,id_livro,dt_aluguel)

);
-- ddl-end --

-- object: usuario_fk | type: CONSTRAINT --
-- ALTER TABLE public.aluguel DROP CONSTRAINT IF EXISTS usuario_fk CASCADE;
ALTER TABLE public.aluguel ADD CONSTRAINT usuario_fk FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id_usuario) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: exemplar_fk | type: CONSTRAINT --
-- ALTER TABLE public.aluguel DROP CONSTRAINT IF EXISTS exemplar_fk CASCADE;
ALTER TABLE public.aluguel ADD CONSTRAINT exemplar_fk FOREIGN KEY (id_exemplar,id_livro)
REFERENCES public.exemplar (id_exemplar,id_livro) MATCH FULL
ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --


