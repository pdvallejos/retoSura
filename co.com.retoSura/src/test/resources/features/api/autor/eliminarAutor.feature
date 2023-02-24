# language: es
Característica: Eliminar un autor
  Como usuario de la pagina
  Quiero eliminar un autor
  Para no usarlo mas

  Escenario: Eliminación de autor exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese el autor que sera eliminado
    Entonces el sistema deberá mostrar que el autor a sido eliminado exitosamente


  Escenario: Eliminación de autor no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando intente eliminar un autor que no exista
    Entonces el sistema deberá mostrar un mensaje de error