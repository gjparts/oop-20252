 /*Comentario
 de
 varias
 lineas*/
 --comentario de una linea
 --DDL: Data Definition Language
 --CREATE ALTER DROP TRUNCATE
 --crear nueva base de datos
 CREATE DATABASE Gerardo
 GO
 /*recomiendo colocar GO despues de cada instruccion
 DDL porque GO se asegura de haber terminado de hacer
 la instruccion anterior antes de continuar con las
 demas instrucciones.*/
 --eliminar una base de datos: (peligroso)
 --dejar de usar la base de datos, para ello pedimos la base
 --de datos maestra:
USE master
GO
 --ejecutar el borrado de la bd deseada:
DROP DATABASE Gerardo
GO

--crear una tabla
USE Gerardo
GO
CREATE TABLE Producto(
	ProductoID bigint NOT NULL IDENTITY(1,1), --aumentar de 1 en 1 desde 1
	Codigo VARCHAR(30) NOT NULL,
	Nombre VARCHAR(200) NOT NULL,
	Costo DECIMAL(12,2) NOT NULL,
	PrecioVenta DECIMAL(12,2) NOT NULL,
	Existencias DECIMAL(12,2) NOT NULL,
	Comentarios TEXT NULL,
	PRIMARY KEY(ProductoID) --define que campo va a ser unico a cada registro (llave primaria)
)
GO

--borrar una tabla (destruye la tabla, aunque este en uso)
USE Gerardo --BASE_DE_DATOS_DONDE_ESTA_LA_TABLA
GO
DROP TABLE Producto
GO

--vaciar una tabla sin borrarla y sin respetar sus reglas
USE Gerardo
GO
TRUNCATE TABLE Producto
GO
--en SQL SERVER Truncate tambien reinicia el campo IDENTITY

