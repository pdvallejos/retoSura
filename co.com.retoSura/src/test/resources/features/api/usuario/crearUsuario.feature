# language: es
Característica: Crear un usuario
  Como cliente de la pagina
  Quiero crear un usuario
  Para poder ver los libros disponibles

  Escenario: Creación de usuario exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la creación del usuario
    Entonces el sistema deberá mostrar el nuevo usuario creado


  Escenario: Creación de usuario no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la creación del usuario
    Entonces el sistema deberá mostrar un mensaje de error