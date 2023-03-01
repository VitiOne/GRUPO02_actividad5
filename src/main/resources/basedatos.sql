
use tienda_actividad3;
create table usuarios
(
	id int(10) not null primary key,
	nombre varchar(20) not null,
	apellidos varchar(45) not null,
	fecha_nacimiento date,
	enabled INT NOT NULL DEFAULT 1,
	email varchar(45) not null unique,
	password varchar(45) not null
);



INSERT INTO usuarios  VALUES (1, 'Roberto', 'Marchero', '1992-04-14',1, 'roberto@merchero.com','roberto123');
INSERT INTO usuarios  VALUES (2, 'Jaime', 'Jaimero', '1959-10-10',1, 'jaime@jaimero.com','jaime123');
INSERT INTO usuarios VALUES (3, 'Rosa', 'Rosario', '1985-08-25',1, 'rosa@rosario.com','rosa123');

create table roles
(
	id int auto_increment primary key,
	nombre varchar(20)
);

INSERT INTO roles VALUES (1,'ROLE_CLIENTE');
INSERT INTO roles VALUES (2,'ROLE_ADMON');



create table direcciones
(
	id int primary key,
	cp varchar(5),
	localidad varchar(20),
	calle varchar(20),
	numero int(10)
);

INSERT INTO direcciones VALUES (1, '25024', 'Guadalajara', 'Santoto', '2554');
INSERT INTO direcciones VALUES (2, '14256', 'Ciudad Real', 'Jeronima', '1245');
INSERT INTO direcciones VALUES (3, '08015', 'Barcelona', 'Toribio', '875');

create table tarjetas
(
	id int primary key,
	numero_tarjeta varchar(20),
	nombre_titular varchar(20),
	fecha_caducidad date,
	cvv int(3)
);

INSERT INTO tarjetas VALUES
(1, '011255492', 'Roberto Marchero', '2025-11-11', '741'),
(2, '1161648461', 'Rosa Rosario', '2026-10-17', '369'),
(3, '5616163313', 'Jaime Jaimero', '2024-12-30', '258');

create table productos
(
id int primary key,
nombre_producto varchar(100) unique not null,
descripcion varchar(30),
precio dec(9,2),
stock int
);
INSERT INTO productos VALUES (1, 'Goku fuego', 'juguete goku plastico', '34', '50');
INSERT INTO productos VALUES (2, 'Vegueta luz ', 'lampara vegueta ', '87', '14');
INSERT INTO productos VALUES (3, 'Gohan super saiyan ', 'Chaqueta de Gohan ', '78','42');

create table pedidos
(
	id INTEGER NOT NULL auto_increment PRIMARY KEY,
	fecha_compra datetime not null
);


insert into pedidos values(1,'2023-02-09 14:45:58'), (2,'2023-01-11 19:45:17'),(3,'2023-01-30 20:22:12'),(4,'2023-02-20 04:27:18');


create table usuarios_con_direcciones
(
	id_usuarios int ,
	id_direcciones int,
	foreign key(id_usuarios) references usuarios(id),
	foreign key(id_direcciones) references direcciones(id),
	PRIMARY KEY (id_usuarios, id_direcciones)
);


INSERT INTO usuarios_con_direcciones VALUES (1, 1),(2, 2),(3, 3),(1, 3);

select * from usuarios_con_direcciones ;

create table usuarios_con_tarjetas
(
	id_usuarios int,
	id_tarjetas int,
	foreign key(id_usuarios) references usuarios(id),
	foreign key(id_tarjetas) references tarjetas(id),
		PRIMARY KEY (id_usuarios, id_tarjetas)
);


INSERT INTO usuarios_con_tarjetas VALUES (1, 1),(2, 2),(3, 3),(1, 3);

create table usuarios_con_roles
(
	id_usuarios int(11),
	id_roles int(11),
	foreign key(id_usuarios) references usuarios(id),
	foreign key(id_roles) references roles(id),
	PRIMARY KEY(id_usuarios, id_roles)
);

INSERT INTO usuarios_con_roles  VALUES (1, 1), (2, 2),(3, 1);



create user 'utienda_2023' identified by 'utienda';
grant all privileges on tienda_actividad3.* to  'utienda_2023';
