# language: es
Característica: Editar un libro
  Como usuario de la pagina
  Quiero editar un libro
  Para poder actualizar los datos correctamente

  Escenario: Edición de libro exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la actualización del libro
    Entonces el sistema deberá mostrar el nuevo libro con los datos actuales


  Escenario: Edición de libro no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la actualización del libro
    Entonces el sistema deberá mostrar un mensaje de error