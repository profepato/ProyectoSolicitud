CREATE DATABASE bd_proyecto_solicitud;

USE bd_proyecto_solicitud;

/*
Aún no está normalizada, en algún futuro vamos a necesitar
más tablas, tales como:

- Producto
- Cliente

*/
CREATE TABLE solicitud(
    id INT AUTO_INCREMENT,
    nombreProducto VARCHAR(100),
    marcaProducto VARCHAR(100), /*FK --> Tabla marca --> ID*/
    nombreCliente VARCHAR(100), 
    fono VARCHAR(100), 
    PRIMARY KEY(id)
);

INSERT INTO solicitud VALUES(NULL, 'Jugo de piña', 'Soprole', 'Pato Pérez', '+569-78954632');

SELECT * FROM solicitud;