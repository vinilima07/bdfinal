--
-- PostgreSQL database dump
--

-- Dumped from database version 10.8 (Ubuntu 10.8-1.pgdg18.04+1)
-- Dumped by pg_dump version 11.3 (Ubuntu 11.3-1.pgdg18.04+1)

-- Started on 2019-06-05 21:56:18 -03

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 206 (class 1259 OID 19017)
-- Name: aluno; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.aluno (
    id_aluno integer NOT NULL,
    nm_pessoa character varying(60) NOT NULL,
    nu_cpf character varying(11) NOT NULL,
    nu_matricula character varying(8),
    nu_anoingresso integer,
    id_curso integer NOT NULL
);


ALTER TABLE public.aluno OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 19015)
-- Name: aluno_id_aluno_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.aluno_id_aluno_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.aluno_id_aluno_seq OWNER TO postgres;

--
-- TOC entry 2978 (class 0 OID 0)
-- Dependencies: 205
-- Name: aluno_id_aluno_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.aluno_id_aluno_seq OWNED BY public.aluno.id_aluno;


--
-- TOC entry 201 (class 1259 OID 18994)
-- Name: curso; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.curso (
    id_curso integer NOT NULL,
    nm_curso character varying(60) NOT NULL
);


ALTER TABLE public.curso OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 18992)
-- Name: curso_id_curso_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.curso_id_curso_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.curso_id_curso_seq OWNER TO postgres;

--
-- TOC entry 2979 (class 0 OID 0)
-- Dependencies: 200
-- Name: curso_id_curso_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.curso_id_curso_seq OWNED BY public.curso.id_curso;


--
-- TOC entry 197 (class 1259 OID 18978)
-- Name: departamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.departamento (
    id_depto integer NOT NULL,
    nm_depto character varying(60) NOT NULL,
    sg_depto character varying(10)
);


ALTER TABLE public.departamento OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 18976)
-- Name: departamento_id_depto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.departamento_id_depto_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.departamento_id_depto_seq OWNER TO postgres;

--
-- TOC entry 2980 (class 0 OID 0)
-- Dependencies: 196
-- Name: departamento_id_depto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.departamento_id_depto_seq OWNED BY public.departamento.id_depto;


--
-- TOC entry 203 (class 1259 OID 19002)
-- Name: disciplina; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.disciplina (
    id_disciplina integer NOT NULL,
    id_curso integer NOT NULL,
    id_curso_prerequisito integer,
    id_disciplina_prerequisito integer,
    nm_disciplina character varying(60) NOT NULL,
    nu_cargahoraria integer NOT NULL,
    nu_creditos integer NOT NULL,
    nu_periodo integer
);


ALTER TABLE public.disciplina OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 19000)
-- Name: disciplina_id_disciplina_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.disciplina_id_disciplina_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.disciplina_id_disciplina_seq OWNER TO postgres;

--
-- TOC entry 2981 (class 0 OID 0)
-- Dependencies: 202
-- Name: disciplina_id_disciplina_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.disciplina_id_disciplina_seq OWNED BY public.disciplina.id_disciplina;


--
-- TOC entry 204 (class 1259 OID 19010)
-- Name: docencia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.docencia (
    id_professor integer NOT NULL,
    id_curso integer NOT NULL,
    id_disciplina integer NOT NULL,
    dt_inicio date,
    dt_fim date
);


ALTER TABLE public.docencia OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 18986)
-- Name: professor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.professor (
    id_professor integer NOT NULL,
    nm_pessoa character varying(60) NOT NULL,
    nu_cpf character varying(11),
    nm_formacao character varying(60),
    id_depto integer NOT NULL
);


ALTER TABLE public.professor OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 18984)
-- Name: professor_id_professor_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.professor_id_professor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.professor_id_professor_seq OWNER TO postgres;

--
-- TOC entry 2982 (class 0 OID 0)
-- Dependencies: 198
-- Name: professor_id_professor_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.professor_id_professor_seq OWNED BY public.professor.id_professor;


--
-- TOC entry 2820 (class 2604 OID 19020)
-- Name: aluno id_aluno; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aluno ALTER COLUMN id_aluno SET DEFAULT nextval('public.aluno_id_aluno_seq'::regclass);


--
-- TOC entry 2818 (class 2604 OID 18997)
-- Name: curso id_curso; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso ALTER COLUMN id_curso SET DEFAULT nextval('public.curso_id_curso_seq'::regclass);


--
-- TOC entry 2816 (class 2604 OID 18981)
-- Name: departamento id_depto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.departamento ALTER COLUMN id_depto SET DEFAULT nextval('public.departamento_id_depto_seq'::regclass);


--
-- TOC entry 2819 (class 2604 OID 19005)
-- Name: disciplina id_disciplina; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplina ALTER COLUMN id_disciplina SET DEFAULT nextval('public.disciplina_id_disciplina_seq'::regclass);


--
-- TOC entry 2817 (class 2604 OID 18989)
-- Name: professor id_professor; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.professor ALTER COLUMN id_professor SET DEFAULT nextval('public.professor_id_professor_seq'::regclass);


--
-- TOC entry 2972 (class 0 OID 19017)
-- Dependencies: 206
-- Data for Name: aluno; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.aluno (id_aluno, nm_pessoa, nu_cpf, nu_matricula, nu_anoingresso, id_curso) FROM stdin;
\.


--
-- TOC entry 2967 (class 0 OID 18994)
-- Dependencies: 201
-- Data for Name: curso; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.curso (id_curso, nm_curso) FROM stdin;
\.


--
-- TOC entry 2963 (class 0 OID 18978)
-- Dependencies: 197
-- Data for Name: departamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.departamento (id_depto, nm_depto, sg_depto) FROM stdin;
1	Departamento de Computação	DECOM
2	Departamento de Engenharia Civil	DECIVIL
3	Departamento de Engenharia Eletrica	DEE
4		
5	Departamento de Engenharia Mecânica	DEEM
\.


--
-- TOC entry 2969 (class 0 OID 19002)
-- Dependencies: 203
-- Data for Name: disciplina; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.disciplina (id_disciplina, id_curso, id_curso_prerequisito, id_disciplina_prerequisito, nm_disciplina, nu_cargahoraria, nu_creditos, nu_periodo) FROM stdin;
\.


--
-- TOC entry 2970 (class 0 OID 19010)
-- Dependencies: 204
-- Data for Name: docencia; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.docencia (id_professor, id_curso, id_disciplina, dt_inicio, dt_fim) FROM stdin;
\.


--
-- TOC entry 2965 (class 0 OID 18986)
-- Dependencies: 199
-- Data for Name: professor; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.professor (id_professor, nm_pessoa, nu_cpf, nm_formacao, id_depto) FROM stdin;
\.


--
-- TOC entry 2983 (class 0 OID 0)
-- Dependencies: 205
-- Name: aluno_id_aluno_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.aluno_id_aluno_seq', 1, false);


--
-- TOC entry 2984 (class 0 OID 0)
-- Dependencies: 200
-- Name: curso_id_curso_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.curso_id_curso_seq', 1, false);


--
-- TOC entry 2985 (class 0 OID 0)
-- Dependencies: 196
-- Name: departamento_id_depto_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.departamento_id_depto_seq', 5, true);


--
-- TOC entry 2986 (class 0 OID 0)
-- Dependencies: 202
-- Name: disciplina_id_disciplina_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.disciplina_id_disciplina_seq', 1, false);


--
-- TOC entry 2987 (class 0 OID 0)
-- Dependencies: 198
-- Name: professor_id_professor_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.professor_id_professor_seq', 1, false);


--
-- TOC entry 2834 (class 2606 OID 19022)
-- Name: aluno aluno_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aluno
    ADD CONSTRAINT aluno_pkey PRIMARY KEY (id_aluno);


--
-- TOC entry 2826 (class 2606 OID 18999)
-- Name: curso curso_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.curso
    ADD CONSTRAINT curso_pkey PRIMARY KEY (id_curso);


--
-- TOC entry 2822 (class 2606 OID 18983)
-- Name: departamento departamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.departamento
    ADD CONSTRAINT departamento_pkey PRIMARY KEY (id_depto);


--
-- TOC entry 2828 (class 2606 OID 19009)
-- Name: disciplina disciplina_id_disciplina_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplina
    ADD CONSTRAINT disciplina_id_disciplina_key UNIQUE (id_disciplina);


--
-- TOC entry 2830 (class 2606 OID 19007)
-- Name: disciplina disciplina_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplina
    ADD CONSTRAINT disciplina_pkey PRIMARY KEY (id_disciplina, id_curso);


--
-- TOC entry 2832 (class 2606 OID 19014)
-- Name: docencia docencia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.docencia
    ADD CONSTRAINT docencia_pkey PRIMARY KEY (id_professor, id_curso, id_disciplina);


--
-- TOC entry 2824 (class 2606 OID 18991)
-- Name: professor professor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.professor
    ADD CONSTRAINT professor_pkey PRIMARY KEY (id_professor);


--
-- TOC entry 2840 (class 2606 OID 19038)
-- Name: aluno aluno_id_curso_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.aluno
    ADD CONSTRAINT aluno_id_curso_fkey FOREIGN KEY (id_curso) REFERENCES public.curso(id_curso) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 2836 (class 2606 OID 19033)
-- Name: disciplina disciplina_id_curso_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplina
    ADD CONSTRAINT disciplina_id_curso_fkey FOREIGN KEY (id_curso) REFERENCES public.curso(id_curso) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 2837 (class 2606 OID 19043)
-- Name: disciplina disciplina_id_disciplina_prerequisito_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.disciplina
    ADD CONSTRAINT disciplina_id_disciplina_prerequisito_fkey FOREIGN KEY (id_disciplina_prerequisito, id_curso_prerequisito) REFERENCES public.disciplina(id_disciplina, id_curso) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 2839 (class 2606 OID 19048)
-- Name: docencia docencia_id_disciplina_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.docencia
    ADD CONSTRAINT docencia_id_disciplina_fkey FOREIGN KEY (id_disciplina, id_curso) REFERENCES public.disciplina(id_disciplina, id_curso) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 2838 (class 2606 OID 19028)
-- Name: docencia docencia_id_professor_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.docencia
    ADD CONSTRAINT docencia_id_professor_fkey FOREIGN KEY (id_professor) REFERENCES public.professor(id_professor) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- TOC entry 2835 (class 2606 OID 19023)
-- Name: professor professor_id_depto_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.professor
    ADD CONSTRAINT professor_id_depto_fkey FOREIGN KEY (id_depto) REFERENCES public.departamento(id_depto) ON UPDATE RESTRICT ON DELETE RESTRICT;


-- Completed on 2019-06-05 21:56:18 -03

--
-- PostgreSQL database dump complete
--

