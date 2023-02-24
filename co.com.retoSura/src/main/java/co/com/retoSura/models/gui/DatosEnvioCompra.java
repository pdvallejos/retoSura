package co.com.retoSura.models.gui;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
public class DatosEnvioCompra {

    //Declaración de variables de instancia privadas
    private String correo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private int estado;
    private String codigoPostal;
    private String telefono;


    //Constructor sin argumentos
    public DatosEnvioCompra(){
    }

    //Constructor con siete argumentos para inicializar las variables de instancia
    public DatosEnvioCompra(String correo, String nombre, String apellido, String direccion, String ciudad,int estado, String codigoPostal, String telefono) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    //Métodos getter y setter para acceder a las variables de instancia y establecer o modificar su valor
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
