create table categoria(
	id integer PRIMARY KEY,
	nombre VARCHAR(255),
	descripcion VARCHAR(255)
);

CREATE TABLE usuario(
	id integer PRIMARY KEY,
	nombre VARCHAR(255),
	apellido_p VARCHAR(255),
	apellido_m VARCHAR(255),
	descripcion VARCHAR(255)
);

INSERT into usuario (id, nombre, apellido_p, apellido_m, descripcion) VALUES(1,'mire','garcia','perez','estudinate')
INSERT into usuario (id, nombre, apellido_p, apellido_m, descripcion) VALUES(2,'monica','miguel','','efermera')

SELECT * FROM usuario;