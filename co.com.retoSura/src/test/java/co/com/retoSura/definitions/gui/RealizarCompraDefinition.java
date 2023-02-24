package co.com.retoSura.definitions.gui;

import co.com.retoSura.models.gui.DatosEnvioCompra;
import co.com.retoSura.models.gui.DatosEnviosCompraBuilder;
import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.tasks.gui.AgregarProductosHombre;
import co.com.retoSura.util.DatosUsuario;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;
import static co.com.retoSura.questions.gui.ValidarCompra.validarCompra;
//import static co.com.retoSura.tasks.gui.AgregarProductosHombre.agregarProductosHombre;
import static co.com.retoSura.tasks.gui.AgregarProductosMujer.agregarProductosMujer;
import static co.com.retoSura.tasks.gui.DiligenciarFormularioDeCompra.conCorreo;
import static co.com.retoSura.userinterfaces.gui.ValidarCompra.TXT_CONFIRMACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class RealizarCompraDefinition extends Setup {


    private DatosEnvioCompra datosEnvioCompra;


    @Dado("que el usuario ingresa al sitio web")
    public void queElUsuarioIngresaAlSitioWeb() {
            setupGeneral();
            actor.can(BrowseTheWeb.with(webdriver));
            actor.attemptsTo(Open.url(URL_BASE_GUI));
    }


    @Cuando("el usuario ingresa productos al carrito de compras")
    public void elUsuarioIngresaProductosAlCarritoDeCompras() {
            actor.attemptsTo(
                    agregarProductosMujer(),
                    AgregarProductosHombre.todo(webdriver)
            );
    }


    @Y("se realiza el proceso de compra")
    public void seRealizaElPocesoDeCompra () {

        datosEnvioCompra = new DatosEnvioCompra();
        DatosUsuario datosUsuario= new DatosUsuario();
        datosEnvioCompra = datosUsuario.generarDireccion();

        actor.attemptsTo(
                conCorreo(datosEnvioCompra.getCorreo())
                        .conNombre(datosEnvioCompra.getNombre())
                        .conApellido(datosEnvioCompra.getApellido())
                        .conDireccion(datosEnvioCompra.getDireccion())
                        .conCiuda(datosEnvioCompra.getCiudad())
                        .conEstado(datosEnvioCompra.getEstado())
                        .concodigoPostal(datosEnvioCompra.getCodigoPostal())
                        .conTelefono(datosEnvioCompra.getTelefono())
        );
    }


    @Entonces("se visualiza un mensaje de exito")
    public void seVisualizaUnMensajeDeExito() {
        actor.should(
                seeThat("El mensaje de éxito no coincide con el esperado",
                        validarCompra(),
                        equalTo(datosEnvioCompra.getCorreo())
                )
        );
    }
}
