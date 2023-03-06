CREATE SCHEMA IF NOT EXISTS tienda;
use tienda;


create table roles
(
	id int primary key,
	nombre varchar(20)
);


INSERT INTO roles VALUES
	(1,'ROLE_ADMON'),
	(2,'ROLE_CLIENTE');

create table usuario
(
	id int(10) not null primary key,
	nombre varchar(20) not null,
	apellidos varchar(45) not null,
	fecha_nacimiento date,
	email varchar(45) not null unique,
	password varchar(45) not null,
	id_rol int(2) not null,
	foreign key(id_rol) references roles(id)
);


INSERT INTO usuario VALUES
	(1, 'administrador', 'administrador', '1992-04-14','admin@admin.com','admin1234',1),
	(2, 'Jaime', 'Jaimero', '1959-10-10', 'jaime@jaimero.com','jaime123',2),
	(3, 'Rosa', 'Rosario', '1985-08-25', 'rosa@rosario.com','rosa123',2);

-- ha dicho el profe que hay que añadir esta columna para que no de problemas luego con el security
-- alter table usuarios add column enabled int;  

create table direccion
(
	id int primary key,
	cp varchar(5) not null,
	localidad varchar(20) not null,
	calle varchar(20) not null,
	numero int(10) not null,
	piso varchar(20),
	letra varchar(10)
);

INSERT INTO direccion VALUES
	(1, '25024', 'Guadalajara', 'Santoto', '2554','1','A'),
	(2, '14256', 'Ciudad Real', 'Jeronima', '1245','2','B'),
	(3, '08015', 'Barcelona', 'Toribio', '875','3','C');

create table tarjeta
(
	id int primary key,
	numero_tarjeta varchar(20),
	nombre_titular varchar(20),
	fecha_caducidad date,
	cvv int(3)
);

INSERT INTO tarjeta VALUES
(1, '0112554921', 'Roberto Marchero', '2023-01-01', '741'),
(2, '1161648461', 'Rosa Rosario', '2023-01-01', '369'),
(3, '5616163313', 'Jaime Jaimero', '2023-01-01', '258');

create table producto
(
	id int primary key,
	nombre_producto varchar(100) unique not null,
	descripcion varchar(30),
	precio dec(9,2),
	stock int
);


INSERT INTO producto VALUES
	(1, 'Goku fuego', 'juguete goku plastico', 25.5, 10),
	(2, 'Vegueta luz ', 'lampara vegueta ', 45.5, 5),
	(3, 'Gohan super saiyan ', 'Chaqueta de Gohan ', 25.5 ,3);



create table pedido
(
	id INTEGER NOT NULL auto_increment PRIMARY KEY,
	id_usuario int not null,
	fecha_compra datetime not null,
	id_direccion int not null,
	id_tarjeta int not null,
	total dec(9,2),
	foreign key(id_usuario) references usuario(id),
	foreign key(id_direccion) references direccion(id),
	foreign key(id_tarjeta) references tarjeta(id)
);


insert into pedido values(1,1,'2023-01-01 00:00:00',1,1,51.0);


create table pedido_producto
(
	id_pedido int NOT NULL,
	id_producto int NOT NULL,
	cantidad int not null,
	precio dec(9,2),
	foreign key(id_pedido) references pedido(id),
	foreign key(id_producto) references producto(id),
	PRIMARY KEY (id_pedido, id_producto)
);


insert into pedido_producto values
	(1,1,1,25.5),
	(1,2,3,45.5),
	(1,3,4,25.5);



create table usuario_direccion
(
	id_usuario int ,
	id_direccion int,
	foreign key(id_usuario) references usuario(id),
	foreign key(id_direccion) references direccion(id),
	PRIMARY KEY (id_usuario, id_direccion)
);


INSERT INTO usuario_direccion VALUES (1, 1),(2, 2),(3, 3),(1, 3);


create table usuario_tarjeta
(
	id_usuario int,
	id_tarjeta int,
	foreign key(id_usuario) references usuario(id),
	foreign key(id_tarjeta) references tarjeta(id),
	PRIMARY KEY (id_usuario, id_tarjeta)
);

INSERT INTO usuario_tarjeta VALUES (1, 1),(2, 2),(3, 3),(1, 3);

create user 'tienda' identified by 'tienda';
grant all privileges on tienda.* to  'tienda';
