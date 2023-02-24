# language: es
Característica: Crear un autor
  Como usuario de la pagina
  Quiero crear un autor
  Para poder publicar libros

  Escenario: Creación de autor exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese los datos necesarios para la creación del autor
    Entonces el sistema deberá mostrar el nuevo autor creado


  Escenario: Creación de autor no exitoso
    Dado que el cliente ingreso a la pagina
    Cuando ingrese datos incorrectos para la creación del autor
    Entonces el sistema deberá mostrar un mensaje de error