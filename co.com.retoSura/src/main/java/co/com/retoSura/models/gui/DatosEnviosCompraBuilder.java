package co.com.retoSura.models.gui;

import co.com.retoSura.tasks.gui.DiligenciarFormularioDeCompra;

public  class DatosEnviosCompraBuilder {

    //clase tiene una instancia de DatosEnvioCompra
    DatosEnvioCompra datosEnvioCompra;


    // Propiedades que se utilizan para construir el objeto DatosEnvioCompra
    private String correo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private int estado;
    private String codigoPostal;
    private String telefono;

    //Constructor que recibe el correo electrónico y establece la propiedad correo
    public DatosEnviosCompraBuilder(String correo) {
        this.correo= correo;
    }

    //Métodos que establecen el valor de la propiedad  y devuelve la instancia de DatosEnviosCompraBuilder actual
    public DatosEnviosCompraBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public DatosEnviosCompraBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }
    public DatosEnviosCompraBuilder conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public DatosEnviosCompraBuilder conCiuda(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public DatosEnviosCompraBuilder conEstado(int estado) {
        this.estado = estado;
        return this;
    }

    public DatosEnviosCompraBuilder concodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this;
    }


    //Método que establece el valor de la propiedad telefono y devuelve una instancia de DiligenciarFormularioDeCompra
    public DiligenciarFormularioDeCompra conTelefono(String telefono) {
        this.telefono = telefono;

        //Devuelve una instancia de DiligenciarFormularioDeCompra, que espera un objeto DatosEnvioCompra como argumento
        return new DiligenciarFormularioDeCompra(datosEnvioCompra.builder()
                .correo(this.correo)
                .nombre(this.nombre)
                .apellido(this.apellido)
                .direccion(this.direccion)
                .ciudad(this.ciudad)
                .estado(this.estado)
                .codigoPostal(this.codigoPostal)
                .telefono(this.telefono)
                .build());
    }
}
