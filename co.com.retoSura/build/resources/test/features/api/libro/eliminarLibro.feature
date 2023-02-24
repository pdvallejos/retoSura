# language: es
Característica: Eliminar un libro
  Como usuario de la pagina
  Quiero eliminar un libro
  Para que no siga disponible

  Escenario: Eliminación de libro exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese el libro que sera eliminado
    Entonces el sistema deberá mostrar que el libro a sido eliminado exitosamente


  Escenario: Eliminación de libro no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando intente eliminar un libro que no exista
    Entonces el sistema deberá mostrar un mensaje de error