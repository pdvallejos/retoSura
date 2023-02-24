package co.com.retoSura.util;

import co.com.retoSura.models.gui.DatosEnvioCompra;
import com.github.javafaker.Faker;

public class DatosUsuario {

    //Este campo almacena los datos de envío generados por el método generarDireccion()
    private DatosEnvioCompra datosEnvioCompra;

    /*
    Este método genera datos aleatorios para llenar el
    formulario de envío y los almacena en un objeto DatosEnvioCompra
    */
    public DatosEnvioCompra generarDireccion(){

        //Creación de un objeto Faker, que se utilizará para generar datos aleatorios
        Faker faker = new Faker();

        //Creación de un objeto DatosEnvioCompra, que se utilizará para almacenar los datos generados
        datosEnvioCompra= new DatosEnvioCompra();

        //Asignación de valores aleatorios a los campos del objeto DatosEnvioCompra
        datosEnvioCompra.setNombre(faker.name().firstName());
        datosEnvioCompra.setApellido(faker.name().lastName());
        datosEnvioCompra.setCorreo(datosEnvioCompra.getNombre()+datosEnvioCompra.getApellido()+"@gmail.com");
        datosEnvioCompra.setDireccion(faker.address().fullAddress());
        datosEnvioCompra.setCiudad(faker.address().state());
        datosEnvioCompra.setEstado(faker.number().numberBetween(1,65));
        datosEnvioCompra.setCodigoPostal(faker.address().zipCode());
        datosEnvioCompra.setTelefono(faker.phoneNumber().cellPhone());

        //Devolución del objeto DatosEnvioCompra con los datos generados
        return datosEnvioCompra;
    }
}

