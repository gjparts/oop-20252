 /*Comentario
 de
 varias
 lineas*/
 --comentario de una linea
 --DDL: Data Definition Language
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