# language: es
Característica: Editar un autor
  Como usuario de la pagina
  Quiero editar un autor
  Para poder actualizar los datos correctamente

  Escenario: Edición de autor exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la actualización del autor
    Entonces el sistema deberá mostrar el nuevo autor con los datos actuales


  Escenario: Edición de autor no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la actualización del autor
    Entonces el sistema deberá mostrar un mensaje de error