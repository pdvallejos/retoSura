package co.com.retoSura.definitions.gui;

import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.tasks.gui.AgregarProductoAleatorio;
import co.com.retoSura.tasks.gui.EliminarArcuticulo;
import co.com.retoSura.tasks.gui.SeleccionProducto;
import co.com.retoSura.tasks.gui.VerificarCarritoCompras;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.retoSura.enums.Diccionario.MENSAJE_CARRITO_VACIO;
import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;
import static co.com.retoSura.questions.gui.ValidarTexto.validarTextos;
import static co.com.retoSura.userinterfaces.gui.CarritoCompras.CARRITO_VACIO_VALIDACION;
import static co.com.retoSura.util.Utilidades.obtenerTextoElemento;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class EliminarProductoCarritoDefinition extends Setup {
    @Dado("que el usuario ingresa al portal de compras")
    public void queElUsuarioIngresaAlPortalDeCompras() {
        setupGeneral();
        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE_GUI.getValor()));
    }

    @Cuando("se adiere un producto al carrito")
    public void seAdiereUnProductoAlCarrito() {
        actor.attemptsTo(
                SeleccionProducto.deseado(),
                AgregarProductoAleatorio.alCarrito(webdriver),
                VerificarCarritoCompras.mio()
        );
    }

    @Entonces("el usuario proda eliminarlo de su carrito")
    public void elUsuarioProdaEliminarloDeSuCarrito() {
        actor.attemptsTo(
                EliminarArcuticulo.carrito()
        );
        actor.should(
                seeThat(
                      validarTextos(obtenerTextoElemento(CARRITO_VACIO_VALIDACION, actor), MENSAJE_CARRITO_VACIO.getValor())
                )
        );
    }
}
