--DROP TABLE users IF EXISTS;

CREATE TABLE USUARIO (
  id int PRIMARY KEY auto_increment,
  username VARCHAR(50),
  pass  VARCHAR(50),
  tipo_user int,
  cedula VARCHAR(50),
  nombre VARCHAR(50),
  direccion VARCHAR(50),
  telefono VARCHAR(50)
);