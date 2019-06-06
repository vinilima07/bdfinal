/*
created		7/6/2009
modified		12/6/2009
project		
model			
company		
author		
version		
database		postgresql 8.1 
*/


/* create domains */



/* create tables */


create table "departamento"
(
	"id_depto" serial not null unique,
	"nm_depto" varchar(60) not null,
	"sg_depto" varchar(10),
 primary key ("id_depto")
) without oids;


create table "professor"
(
	"id_professor" serial not null unique,
	"nm_pessoa" varchar(60) not null,
	"nu_cpf" varchar(11),
	"nm_formacao" varchar(60),
	"id_depto" integer not null,
 primary key ("id_professor")
) without oids;


create table "curso"
(
	"id_curso" serial not null unique,
	"nm_curso" varchar(60) not null,
 primary key ("id_curso")
) without oids;


create table "disciplina"
(
	"id_disciplina" serial not null unique,
	"id_curso" integer not null,
	"id_curso_prerequisito" integer,
	"id_disciplina_prerequisito" integer,
	"nm_disciplina" varchar(60) not null,
	"nu_cargahoraria" integer not null,
	"nu_creditos" integer not null,
	"nu_periodo" integer,
 primary key ("id_disciplina","id_curso")
) without oids;


create table "docencia"
(
	"id_professor" integer not null,
	"id_curso" integer not null,
	"id_disciplina" integer not null,
	"dt_inicio" date,
	"dt_fim" date,
 primary key ("id_professor","id_curso","id_disciplina")
) without oids;


create table "aluno"
(
	"id_aluno" serial not null unique,
	"nm_pessoa" varchar(60) not null,
	"nu_cpf" varchar(11) not null,
	"nu_matricula" varchar(8),
	"nu_anoingresso" integer,
	"id_curso" integer not null,
 primary key ("id_aluno")
) without oids;



/* create foreign keys */

alter table "professor" add  foreign key ("id_depto") references "departamento" ("id_depto") on update restrict on delete restrict;

alter table "docencia" add  foreign key ("id_professor") references "professor" ("id_professor") on update restrict on delete restrict;

alter table "disciplina" add  foreign key ("id_curso") references "curso" ("id_curso") on update restrict on delete restrict;

alter table "aluno" add  foreign key ("id_curso") references "curso" ("id_curso") on update restrict on delete restrict;

alter table "disciplina" add  foreign key ("id_disciplina_prerequisito","id_curso_prerequisito") references "disciplina" ("id_disciplina","id_curso") on update restrict on delete restrict;

alter table "docencia" add  foreign key ("id_disciplina","id_curso") references "disciplina" ("id_disciplina","id_curso") on update restrict on delete restrict;





