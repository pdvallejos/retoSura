package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.BTN_INGRESAR;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CONTRASENA_CREACION_INGRESAR;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.CORREO_ELECTRONICO_INGRESAR;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.INGRESAR;


public class SingIn implements Task {
    private String correo;
    public SingIn conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    private String contrasena;
    public SingIn conContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INGRESAR),
                Enter.theValue(correo).into(CORREO_ELECTRONICO_INGRESAR),
                Enter.theValue(contrasena).into(CONTRASENA_CREACION_INGRESAR),
                Click.on(BTN_INGRESAR)
        );
    }

    public static SingIn singIn(){
        return new SingIn();
    }
}
