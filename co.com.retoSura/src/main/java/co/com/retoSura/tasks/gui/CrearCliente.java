package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.BTN_CREAR_NUEVO_CLIENTE;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CONFIRMACION_CONTRASENA;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CONTRASENA_CREACION;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CORREO_ELECTRONICO_CREACION;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CREAR_NUEVO_CLIENTE;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.PRIMER_NOMBRE;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.SEGUNDO_NOMBRE;


public class CrearCliente implements Task {

    private String nombre;
    public CrearCliente conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    private String segundoNombre;
    public CrearCliente conSegundoNombre(String apellido) {
        this.segundoNombre = apellido;
        return this;
    }
    private String correo;
    public CrearCliente conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    private String contrasena;
    public CrearCliente conContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    private String segundaContrasena;
    public CrearCliente conSegundaContrasena(String contrasena) {
        this.segundaContrasena = contrasena;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREAR_NUEVO_CLIENTE),
                Enter.theValue(nombre).into(PRIMER_NOMBRE),
                Enter.theValue(segundoNombre).into(SEGUNDO_NOMBRE),
                Enter.theValue(correo).into(CORREO_ELECTRONICO_CREACION),
                Enter.theValue(contrasena).into(CONTRASENA_CREACION),
                Enter.theValue(segundaContrasena).into(CONFIRMACION_CONTRASENA),
                Click.on(BTN_CREAR_NUEVO_CLIENTE)
        );
    }

    public static CrearCliente crearCliente(){
        return new CrearCliente();
    }

}
