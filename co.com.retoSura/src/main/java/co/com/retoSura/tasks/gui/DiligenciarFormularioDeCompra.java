package co.com.retoSura.tasks.gui;


import java.time.Duration;
import co.com.retoSura.models.gui.DatosEnvioCompra;
import co.com.retoSura.models.gui.DatosEnviosCompraBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.retoSura.interaccions.gui.Click.clickOn;
import static co.com.retoSura.userinterfaces.gui.ProcesoDeCompra.*;
import static net.thucydides.core.webdriver.SerenityWebdriverManager.inThisTestThread;


public class DiligenciarFormularioDeCompra implements Task {

    //Este campo almacena los datos del envío que se utilizarán para llenar el formulario
    private DatosEnvioCompra datosEnvioCompra;

    //Este campo almacena la dirección de correo electrónico del usuario que está llenando el formulario
    private String correo;

    //Constructor de la clase, que recibe un objeto DatosEnvioCompra que se utilizará para llenar el formulario
    public DiligenciarFormularioDeCompra(DatosEnvioCompra datosEnvioCompra) {
        this.datosEnvioCompra = datosEnvioCompra;
    }

    /*
    Método estático que devuelve un objeto DatosEnviosCompraBuilder,
    utilizado para crear objetos DatosEnvioCompra
    */
    public static DatosEnviosCompraBuilder conCorreo(String correo) {
        return new DatosEnviosCompraBuilder(correo);
    }


    /*
    Implementación del método performAs de
    la interfaz Task, que realiza la tarea de llenar el formulario
    */
    @Override
    public <T extends Actor> void performAs(T actor) {

        /*
        Configuración de un tiempo de espera implícito
        de 10 segundos para que los elementos de la página se carguen
        */
        inThisTestThread().getCurrentDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Acciones que el actor debe realizar en la página web para llenar el formulario
        actor.attemptsTo(
                Scroll.to(TXT_CORREO),
                Clear.field(TXT_CORREO),
                Enter.theValue(datosEnvioCompra.getCorreo()).into(TXT_CORREO),

                Scroll.to(TXT_NOMBRE),
                Clear.field(TXT_NOMBRE),
                Enter.theValue(datosEnvioCompra.getNombre()).into(TXT_NOMBRE),

                Scroll.to(TXT_APELLIDO),
                Clear.field(TXT_APELLIDO),
                Enter.theValue(datosEnvioCompra.getApellido()).into(TXT_APELLIDO),

                Scroll.to(TXT_DIRECCION),
                Clear.field(TXT_DIRECCION),
                Enter.theValue(datosEnvioCompra.getDireccion()).into(TXT_DIRECCION),

                Scroll.to(TXT_CIUDAD),
                Clear.field(TXT_CIUDAD),
                Enter.theValue(datosEnvioCompra.getCiudad()).into(TXT_CIUDAD),

                Scroll.to(LST_ESTADO),
                SelectFromOptions.byIndex(datosEnvioCompra.getEstado()).from(LST_ESTADO),


                Scroll.to(TXT_CODIGO_POSTAL),
                Clear.field(TXT_CODIGO_POSTAL),
                Enter.theValue(datosEnvioCompra.getCodigoPostal()).into(TXT_CODIGO_POSTAL),

                Scroll.to(TXT_TELEFONO),
                Clear.field(TXT_TELEFONO),
                Enter.theValue(datosEnvioCompra.getTelefono()).into(TXT_TELEFONO),
                Click.on(CHK_PRECIO),
                Click.on(BTN_SIGUIENTE),
                clickOn(BTN_REALIZAR_PEDIDO)

        );
    }
}

