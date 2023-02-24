# language: es
Característica: Editar un usuario
  Como usuario de la pagina
  Quiero editar un usuario
  Para poder actualizar los datos correctamente

  Escenario: Edición de usuario exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la actualización del usuario
    Entonces el sistema deberá mostrar el nuevo usuario con los datos actuales


  Escenario: Edición de usuario no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la actualización del usuario
    Entonces el sistema deberá mostrar un mensaje de error