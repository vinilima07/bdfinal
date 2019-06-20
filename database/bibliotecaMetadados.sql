--autores
INSERT INTO public.autor(
	nm_autor, nm_citacao)
	VALUES ('Newton Mendes', 'MENDES');

INSERT INTO public.autor(
	nm_autor, nm_citacao)
	VALUES ('Isaac Newton', 'NEWTON');

INSERT INTO public.autor(
	nm_autor, nm_citacao)
		VALUES ('Josiel Neto', 'NETO');

INSERT INTO public.autor(
	nm_autor, nm_citacao)
	VALUES ('Ferreira Campos', 'CAMPOS');
	
INSERT INTO public.autor(
	nm_autor)
	VALUES ('Carlos Magno');

	
INSERT INTO public.autor(
	nm_autor)
	VALUES ('Augusto Magno');

	
INSERT INTO public.autor(
	nm_autor)
	VALUES ('Alcides Pereira');
	
	
INSERT INTO public.autor(
	nm_autor)
	VALUES ('Rafael Aguiar');

	
INSERT INTO public.autor(
	nm_autor)
	VALUES ('Marcelo Lopes');
	
--78787878787877878787787878
--editoras
INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Modus Poneis', 'rua Carvalho Medalhao', 'Minas Gerais', 'Cascavel');

INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Angra', 'rua olipio de melo 61', 'Minas Gerais', 'Belo Horizonte');
	
INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Marcone', 'rua Muller Linda 31', 'São Paulo', 'Campinas');

INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Esmeril', 'rua Pelical 32', 'São Paulo', 'São Paulo');

INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Agrid Comspell', 'av Amsterdan 89', 'São Paulo', 'São Paulo');
	
INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Elcabron', 'av Muchacho 666', 'Acre', 'Fim do Mundo');
	
INSERT INTO public.editora(
	nm_editora, logradouro, estado, cidade)
	VALUES ('Pterossauros', 'rua Aquirroubado 32', 'Manaus', 'Another World');

--98989898988989898989898989
--usuarios
INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('12345679045', '3191534567', '1993-06-23', 'Morpheu de Lima');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('02058315618', '3181235567', '1997-03-03', 'Rafael ddar Pena');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('11058315618', '3181234567', '1999-05-05', 'Darius Dariumn');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('26058315618', '3193234568', '1991-06-05', 'Franchiesco Skol');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('37058310618', '3192234566', '1992-06-13', 'Bruno Bhrama');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('73058317618', '3191234564', '1993-06-13', 'Levandovisk da Silva');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('09058345618', '3192134562', '1995-05-13', 'Meunick Name');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('04059316618', '3191222567', '2001-07-17', 'Brasilei Rofudido');
	
INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('43000931018', '3191233367', '2001-02-15', 'Batinac Araesai Correndo');

INSERT INTO public.usuario(
	cpf, telefone, dt_nascimento, nm_usuario)
	VALUES ('11059316618', '3191222567', '2000-03-13', 'Matric Ulanocefet Erreprova');
	
--9090990909090909
--livros
--Autor gen : (1 + random()*8)::int
--Editora gen : (1 + random()*6)::int
INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (1, 'A Volta dos que não Foram', 'Romance', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (2, 'Eutaco Ofodasse', 'Romance', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (2, 'Unkilo de Ciencia', 'Sci-Fi', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (3, 'Eu leio Tu lê Nós lemos', 'Literatura', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (5, 'Eu Quero Uma Bela', 'Romance', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (5, 'Medea Mao Evamo Pralua', 'Sci Fi', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (1, 'Maria Madalena', 'Horror', (1 + random()*6)::int);

INSERT INTO public.livro(
	nu_edicao, nm_titulo, nm_genero, id_editora)
	VALUES (1, 'Netuno Esquizofrenico', 'Terror Cosmico', (1 + random()*6)::int);

--60606060606606060606060606060
--AUTORIAS
INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (1, 1);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (2, 2);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (2, 3);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (5, 4);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (4, 5);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (2, 6);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (3, 7);

INSERT INTO public.autoria(
	id_autor, id_livro)
	VALUES (8, 8);

--4545454544545454
--EXEMPLAR
INSERT INTO public.exemplar(
	id_livro)
	VALUES (5);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (5);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (3);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (3);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (2);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (1);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (1);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (1);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (2);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (2);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (3);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (7);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (7);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (6);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (6);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (3);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (2);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (2);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (4);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (5);

INSERT INTO public.exemplar(
	id_livro)
	VALUES (6);
