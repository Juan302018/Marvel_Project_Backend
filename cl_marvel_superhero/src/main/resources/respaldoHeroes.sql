--
-- PostgreSQL database dump
--

-- Dumped from database version 10.11
-- Dumped by pg_dump version 12.0

-- Started on 2021-02-12 04:32:46

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
-- TOC entry 2827 (class 0 OID 82280)
-- Dependencies: 199
-- Data for Name: super_heroe; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (1, 'Iron Man', 'iron man');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (2, 'Thor', 'thor');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (3, 'Hulk', 'hulk');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (4, 'Vision', 'vision');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (5, 'Black widow', 'black widow');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (6, 'War Machine', 'war machine');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (7, 'Falcon', 'falcon');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (8, 'Black Panter', 'black panter');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (9, 'Ant man', 'ant man');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (10, 'Spider man', 'spider man');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (11, 'Winter soldier', 'winter soldier');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (12, 'Capitán América', 'capitan america');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (13, 'Wanda Maximoff', 'wanda maximoff');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (14, 'Doctor Strange', 'doctor strange');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (15, 'Capitan Marvel', 'capitan marvel');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (16, 'Wolverine', 'wolverine');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (17, 'La Mole', 'la mole');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (18, 'La Antorcha Humana', 'la antorcha humana');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (19, 'La Mujer Invisible', 'la mujer invisible');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (20, 'El Hombre Elastico', 'el hombre elastico');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (21, 'Ciclope', 'ciclope');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (22, 'Tormenta', 'tormenta');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (23, 'Jean Grey', 'jean grey');
INSERT INTO public.super_heroe (id_super_heroe, nombre_super_heroe, super_heroe) VALUES (24, 'Profesor X', 'profesor x');


--
-- TOC entry 2825 (class 0 OID 82272)
-- Dependencies: 197
-- Data for Name: caracteristica; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (2, 'Tony Stark/ Iron Man (El Hombre de Hierro', 'Intelecto nivel genio, Experto científico e ingeniero, Vuelo supersónico y armamento de alta tecnología', 'Humano', 'Activo', 'Masculino', 1);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (3, 'Hijo de Odin, Dios del Trueno', 'Fuerza sobrehumana, velocidad, durabilidad, manipulacion electrica', 'Asgardiano', 'Activo', 'Masculino', 2);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (4, 'El Hombre Increíble, El Gigante Verde', 'Intelecto nivel genio, Super fuerza, velocidad, resistencia, salto y regeneracion', 'Mutante', 'Activo', 'Masculino', 3);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (5, 'Victor Shade', 'Habilidades fisicas sobrehumanas, Inteligencia superior, Vuelo, Control de densidad, Proyeccion de energia solar y Tecnopatia.', 'Synthezoide', 'Activo', 'Masculino', 4);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (6, 'Natasha Romanoff', 'Experta en tactica, combatiente cuerpo a cuerpo y agente secreta, Envejecimiento lento y sistema inmunologico super mejorado.', 'Humano', 'Activo', 'Femenino', 5);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (7, 'Maquina de Guerra, Iron Patriot', 'Fuerza, velocidad, resistencia mejoradas por la armadura, Vuelo y Sistema de armas de alto nivel.', 'Humano', 'Activo', 'Masculino', 6);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (8, 'Sam, Falcon', 'Conexion telepática con su halcon Redwing, que le permite ver a traves de sus ojos, Vastos estilos de vuelos y Alas planeadoras.', 'Humano', 'Activo', 'Masculino', 7);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (9, 'T''Challa, Pantera Negra, Rey de Wakanda', 'Fuerza sobrehumana, velocidad, reflejos, agilidad, resistencia, durabilidad, sentidos y traje y equipo de vibranium.', 'Humano', 'Activo', 'Masculino', 8);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (10, 'Hombre Hormiga, Scott', 'Capacidad de reducir estatura e ingresar a universos subatomicos, Cambiar de estatura hasta 100 pies gigantescos y transferir tamaño a otros objetos.', 'Humano', 'Activo', 'Masculino', 9);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (11, 'Hombre Arana, Su Amigo y Vecino Hombre Arana', 'Fuerza sobrehumana, velocidad, agilidad, reflejos / reacciones, coordinacion, equilibrio,sentido aracnido y se aferra a las superficies solidas.', 'Mutante', 'Activo', 'Masculino', 10);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (12, 'Bucky, Soldado del Invierno', 'Acrobata habilidoso, experto luchador, explorador, asesino, fuerza sobrehumana potenciada, por un brazo bionico.', 'Androide', 'Activo', 'Masculino', 11);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (13, 'Cap, Steve Rogers, Steve', 'Sentidos, agilidad, velocidad, fuerza sobrehumana, gran habilidad con armas de fuego, con el martillo mjolnir y con su escudo de vibranium.', 'Mutante', 'Activo', 'Masculino', 12);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (14, 'Wanda, Wanda Maximoff', 'Psiquica, telepatia, teletransportacion, manipulación de la energia, desintegracion, distorsion de la realidad, magia del caos, telequinesis y vuelo.', 'Mutante', 'Activo', 'Femenino', 13);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (15, 'Hechicero Supremo, Maestro de las Artes Misticas', 'Reputado medico en neurocirugia, esperanza de vida prolongada por Ankh, dueño del Ojo de Agamotto, control de la magia y las artes misticas.', 'Hechicero', 'Activo', 'Masculino', 14);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (16, 'Carol Danvers, Danvers', 'Fuerza sobrehumana, velocidad, resistencia, Vuelo, absorcion y proyección de energia.', 'Humana-Kree', 'Activo', 'Femenino', 15);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (17, 'Logan, Jimmy', 'Es capaz de recuperarse de cualquier daño fisico, resistencia a poderes psiquicos, garras retractiles de Adamantium, furia berserker.', 'Mutante', 'Activo', 'Masculino', 16);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (18, 'La Mole', 'Fuerza fisica muy aumentada, organismo mutado similar a una roca, resistencia fisica, experto en luchas y combates.', 'Mutante', 'Activo', 'Masculino', 17);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (19, 'La Antorcha', 'Poderes estan basados en el fuego, envolver su cuerpo en llamas, volar, piroquinesis.', 'Mutante', 'Activo', 'Masculino', 18);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (20, 'Sue, Mujer invisible', 'Invisibilidad, manipulacion de las ondas luminosas, vuelo y manipulacion de la energia campos de fuerza.', 'Mutante', 'Activo', 'Femenino', 19);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (21, 'Mr. Reed, Mr. Fantastico, Hombre Elastico, Elastico', 'Intelecto, elasticidad, resistencia sobrehumana a la mayoría de los ataques fisicos y a la electricidad, inmunidad virtual a los poderes psiquicos.', 'Mutante', 'Activo', 'Masculino', 20);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (22, 'Scott, Ciclope', 'Rayos opticos de energía solar, artista marcial y posee inmunidad a los poderes de algunos mutantes.', 'Mutante', 'Activo', 'Masculino', 21);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (23, 'Storm', 'Manipulacion del tiempo, clima y Vuelo.', 'Mutante', 'Activo', 'Femenino', 22);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (24, 'Jean, Fenix', 'Telepatia, telequinesis, pyroquinesis y vuelo.', 'Mutante', 'Activo', 'Femenino', 23);
INSERT INTO public.caracteristica (id_caracteristica, alias, especialidad_poder, especie_raza, estado, sexo, id_super_heroe) VALUES (25, 'Charles, Profesor, Profesor X', 'Telepatia y proyeccion astral.', 'Mutante', 'Activo', 'Masculino', 24);


--
-- TOC entry 2829 (class 0 OID 90463)
-- Dependencies: 201
-- Data for Name: comic; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.comic (id_comic, argumento_comic, nombre_comic, tomo_comic) VALUES (1, NULL, 'Capitan Amirica y el Soldado del Invierno', NULL);


--
-- TOC entry 2831 (class 0 OID 90474)
-- Dependencies: 203
-- Data for Name: pelicula; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2837 (class 0 OID 0)
-- Dependencies: 196
-- Name: caracteristica_id_caracteristica_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.caracteristica_id_caracteristica_seq', 25, true);


--
-- TOC entry 2838 (class 0 OID 0)
-- Dependencies: 200
-- Name: comic_id_comic_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comic_id_comic_seq', 1, true);


--
-- TOC entry 2839 (class 0 OID 0)
-- Dependencies: 202
-- Name: pelicula_id_pelicula_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pelicula_id_pelicula_seq', 1, false);


--
-- TOC entry 2840 (class 0 OID 0)
-- Dependencies: 198
-- Name: super_heroe_id_super_heroe_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.super_heroe_id_super_heroe_seq', 25, true);


-- Completed on 2021-02-12 04:32:46

--
-- PostgreSQL database dump complete
--

