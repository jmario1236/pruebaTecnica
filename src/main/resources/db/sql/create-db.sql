--DROP TABLE RESERVA IF EXISTS;
--DROP TABLE PELICULA IF EXISTS;
--DROP TABLE USUARIO IF EXISTS;

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

CREATE TABLE PELICULA (
  id int PRIMARY KEY auto_increment,
  titulo VARCHAR(50),
  descripcion  VARCHAR(50),
  actores VARCHAR(50),
  director VARCHAR(50),
  cantidad int,
);

CREATE TABLE RESERVA (
  id int PRIMARY KEY auto_increment,
  fechaReservaPelicula VARCHAR(50),
  fechaRetornoPelicula  VARCHAR(50),
  user_id int not null,
  pelicula_id int not null,
);

ALTER TABLE RESERVA
    ADD FOREIGN KEY (user_id) 
    REFERENCES USUARIO(id);
    
ALTER TABLE RESERVA
    ADD FOREIGN KEY (pelicula_id) 
    REFERENCES PELICULA(id);