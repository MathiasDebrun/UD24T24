
DROP table IF EXISTS Empleado;

create table Empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo enum ('Programador', 'Secretario', 'Psicologo', 'Medico'),
	salario float default 1500,
	primary key (id)
	
);

insert into Empleado (nombre, trabajo,salario)values('Jose','Programador',1500);
insert into Empleado (nombre, trabajo,salario)values('Pepe','Psicologo',1000);
insert into Empleado (nombre, trabajo,salario)values('Juan','Medico',2500);
insert into Empleado (nombre, trabajo,salario)values('Pedro','Secretario',1200);
