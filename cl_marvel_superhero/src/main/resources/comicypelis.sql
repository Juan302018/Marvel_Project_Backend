--
-- PostgreSQL database dump
--

-- Dumped from database version 10.15
-- Dumped by pg_dump version 10.15

-- Started on 2021-02-12 04:21:28

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

--
-- TOC entry 2831 (class 0 OID 16426)
-- Dependencies: 203
-- Data for Name: super_heroe; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe) VALUES (1, 'Iron Man');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe) VALUES (2, 'Spider Man');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe) VALUES (3, 'Capitan America');


--
-- TOC entry 2825 (class 0 OID 16396)
-- Dependencies: 197
-- Data for Name: caracteristica; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2827 (class 0 OID 16404)
-- Dependencies: 199
-- Data for Name: comic; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (1, 'Tony Stark es secuestrado en un desierto del medio oriente para hacer armas y mientras las hace desarrolla una armadura llamada Iron Man-Mark v1 la cual mejora en su empresa llamada Stark Industries', 'Iron Man', '1');
INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (2, 'Peter Parker es mordido por una araña geneticamente modificada y desarrolla super-poderes aracnidos como caminar por las paredes y sentido aracnido', 'Spider Man', '1');
INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (3, NULL, 'dr. strange', NULL);
INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (4, NULL, 'deadpoll', NULL);
INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (5, 'un cientifico recibe es su laboratorio una poderosa emision de rayos gama en un experimento y eso le da la capacidad de volverse una bestia cuando se enoja', 'hulk', '1');


--
-- TOC entry 2829 (class 0 OID 16415)
-- Dependencies: 201
-- Data for Name: pelicula; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pelicula (id_pelicula, argumento_pelicula, es_secuela, nombre_pelicula) VALUES (1, 'Peter Parker es mordido por una araña geneticamente modificada y desarrolla super-poderes aracnidos como caminar por las paredes, sentido aracnido y la capacidad de hacer tela-arañas, con ella sera capza de combatir al su enemigo que estremece a todo nueva york el cual se hace llamar el duende verde', false, 'Spider Man');
INSERT INTO public.pelicula (id_pelicula, argumento_pelicula, es_secuela, nombre_pelicula) VALUES (2, 'Peter Parker esta en una encrucigada al tener que dominar la doble vida que tiene como spider man y como un universitario y fotografo independiente las cuales no cobinan nada bien puesto que su identidad como superheroe lo esta arruinando todo lo demas, en su intento por hacer un buen informe para la universidad harry osbourne le consigue una entrevista con un cientifico el cual se convertira en su proximo enemigo: el dr. otto octavious a quien al fallarle un experimento de fision nueclear y perderlo todo y ademas ser controlado por sus brazos con IA se convierte en uno de los enemigos mas perversos de la saga', true, 'Spider Man 2');
INSERT INTO public.pelicula (id_pelicula, argumento_pelicula, es_secuela, nombre_pelicula) VALUES (3, 'Los vengadores se unen despues de que un enemigo galactico conocido como Thanos amenazara con borrar a la mitad del universo despues de reunir las gemas del infinito con las cuales podra hacerlo solo con chasquear los dedos con el guantelete del infinito', true, 'Avengers: Infinity War');
INSERT INTO public.pelicula (id_pelicula, argumento_pelicula, es_secuela, nombre_pelicula) VALUES (4, 'dr. strange era uno de los mejores cirujanos de su hospital hasta que un accidente lo dejo con sus manos sin terminaciones nerviosas despues de un retiro espiritual se convierte en el hechicero amo del tiempo y del espacio', false, 'dr. strange');


--
-- TOC entry 2837 (class 0 OID 0)
-- Dependencies: 196
-- Name: caracteristica_id_caracteristica_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.caracteristica_id_caracteristica_seq', 1, false);


--
-- TOC entry 2838 (class 0 OID 0)
-- Dependencies: 198
-- Name: comic_id_comic_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comic_id_comic_seq', 5, true);


--
-- TOC entry 2839 (class 0 OID 0)
-- Dependencies: 200
-- Name: pelicula_id_pelicula_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pelicula_id_pelicula_seq', 4, true);


--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 202
-- Name: super_heroe_id_super_heroe_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.super_heroe_id_super_heroe_seq', 1, false);


-- Completed on 2021-02-12 04:21:28

--
-- PostgreSQL database dump complete
--

