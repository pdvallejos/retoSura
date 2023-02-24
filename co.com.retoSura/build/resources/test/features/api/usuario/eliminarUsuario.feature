# language: es
Característica: Eliminar un usuario
  Como usuario de la pagina
  Quiero eliminar un usuario
  Para no usarlo mas

  Escenario: Eliminación de usuario exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese el usuario que sera eliminado
    Entonces el sistema deberá mostrar que el usuario a sido eliminado exitosamente


  Escenario: Eliminación de usuario no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando intente eliminar un usuario que no exista
    Entonces el sistema deberá mostrar un mensaje de error