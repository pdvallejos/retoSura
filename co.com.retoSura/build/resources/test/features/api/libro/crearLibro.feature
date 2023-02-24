# language: es
Característica: Crear un libro
  Como usuario de la pagina
  Quiero crear un libro
  Para poder publicarlo

  Escenario: Creación de libro exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la creación del libro
    Entonces el sistema deberá mostrar el nuevo libro creado


  Escenario: Creación de libro no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la creación del libro
    Entonces el sistema deberá mostrar un mensaje de error