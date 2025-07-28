/*DML: Data Manipulation Language
Permiten interactuar con la informacion en los
objetos de datos: SELECT INSERT DELETE UPDATE*/
--siempre es importante seleccionar la BD:
USE Gerardo
GO
--las instrucciones DML no requieren del uso del GO a menos
--que Usted quiera hacer una pausa entre cada instruccion.
/*Instruccion INSERT: agrega uno o varios registros a una tabla.
1) en INSERT se debe incluir todos los campos NOT NULL (obligatorios) de la tabla
2) Los campos NULL (opcionales) se pueden incluir solo si Usted lo requiere
3) La columna IDENTITY no se incluye en INSERT porque es autonumerada por la BD.*/

--INSERT que llena todos los campos de la tabla Producto:
INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios)
VALUES('CC01','Coca Cola 3L',62,70,0,'Mala para la salud')

--INSERT no obliga a incluir los campos en el orden que estan en la tabla:
INSERT Producto(Costo, Codigo, PrecioVenta, Nombre, Comentarios, Existencias)
VALUES(61,'CC02',67,'Mirinda Naranja 3L','Tabien es malo para la salud',10)

--INSERT sin el campo Comentarios (admite NULL)
INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencias)
VALUES('CC03','Sprite 2L',35,40,90)

--INSERT multiregistro:
INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios)
VALUES
('FR01','Manzana Unidad',6,8.5,100,'Buena para la salud'),
('FR02','Pera Unidad',5,6.25,50,'Buena para la salud'),
('VD45','Lechuga Unidad',17,22,7,'Buena para la salud'),
('PR99','Taqueritos Fuego',15,20,1,NULL),
('PR23','Halls Cereza',7,10,73,NULL),
('AG11','Agua en bolsa',2,3,2000,'Lo mas recomendado')

/*Instruccion SELECT: Consulta el contenido de una tabla, el resultado
va a depender de los modificadores que usemos.*/

--Consulta todos los registros para todas las columnas de la tabla Producto:
SELECT * FROM Producto
/*IMPORTANTE: el uso de * en SELECT es considerado una mala practica cuando ya se
va a utilizar en software para distribucion. El uso de * en un SELECT crea la necesidad
para el DMBS de ir a consultar que columnas hay en esa tabla lo que representa un trabajo
adicional que puede consumir recursos innecesarios lo que se siente a gran escala.
Lo correcto en un SELECT es mencionar que columnas va a consultar:*/
SELECT ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto

--consultar las primeras 3 filas y todas las columnas de la tabla Producto:
SELECT TOP(3) * FROM Producto
SELECT TOP(3) ProductoID, Codigo, Nombre, Costo, PrecioVenta, Existencias, Comentarios FROM Producto

--mostrar todas las filas de la tabla Producto pero solo ver las columnas Codigo, Nombre y Comentarios
SELECT Codigo, Nombre, Comentarios FROM Producto
--mostrar todas las filas de la tabla Producto pero solo ver las columnas Nombre, PrecioVenta, Costo y Existencias
SELECT Nombre, PrecioVenta, Costo, Existencias FROM Producto
--mostrar todas las filas de la tabla Producto pero solo ver las columnas Costo, PrecioVenta y Codigo
SELECT Costo, PrecioVenta, Codigo FROM Producto

--tambien puede colocar alias a las columnas
--cuando son varias palabras utilice corchetes
SELECT	ProductoID as Numero, Codigo,
		Nombre as [Nombre del Producto],
		PrecioVenta as [Precio de Venta],
		Comentarios as Observaciones
FROM Producto

--Campos calculados
SELECT	Codigo, Nombre, Costo, PrecioVenta,
		PrecioVenta-Costo as Utilidad,
		PrecioVenta*0.15 as [I.S.V.],
		POWER(Costo,2) as [Costo al cuadrado],
		SQRT(PrecioVenta) as RaizVenta,
		(PrecioVenta-Costo)/Costo*100 as [Desviacion Estandar de Utilidad vs Costo]
FROM Producto

--Ordenar la informacion
--Todos los productos ordenados por costo de menor a mayor
SELECT *
FROM Producto
ORDER BY Costo ASC

--Todos los productos ordenados por nombre ascendentemente
SELECT Codigo, Nombre, PrecioVenta, Costo
FROM Producto
ORDER BY Nombre ASC

--Puede ordenar por determinado campo aunque no se mencione
--en el SELECT
--todos los productos, mostrar solo nombre y codigo
--ordenados por sus existencias de mayor a menor (DESCENDANT)
SELECT Codigo, Nombre
FROM Producto
ORDER BY Existencias DESC

--ordenar usando como criterio mas de un campo
--todos los productos ordenados primero por precio de venta
--de mayor a menor y luego por nombre de menor a mayor.
SELECT Codigo, Nombre, PrecioVenta
FROM Producto
ORDER BY PrecioVenta DESC, Nombre ASC

--se puede ordenar por un campo calculado?
--Si se puede, ejemplo: ordenar todos los productos de acuerdo
--a las ganancias que dejan de mayor a menor.
SELECT Codigo, Nombre, PrecioVenta-Costo as Utilidad
FROM Producto
ORDER BY Utilidad DESC
--En SQL SERVER de Microsoft, a partir de 2016 se puede ordenar
--un campo calculado por su ALIAS; pero en versiones anteriores
--o en otros motores como MySQL u ORACLE probablemente no
--Ahi debe ordenar de la manera siguiente:
SELECT Codigo, Nombre, PrecioVenta-Costo as Utilidad
FROM Producto
ORDER BY PrecioVenta-Costo DESC
--note que se pone el calculo sin el AS ALIAS