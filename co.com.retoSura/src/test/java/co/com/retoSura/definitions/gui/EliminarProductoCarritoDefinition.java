package co.com.retoSura.definitions.gui;

import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.tasks.gui.AgregarProductoAleatorio;
import co.com.retoSura.tasks.gui.SeleccionProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;

public class EliminarProductoCarritoDefinition extends Setup {
    @Dado("que el usuario ingresa al portal de compras")
    public void queElUsuarioIngresaAlPortalDeCompras() {
        setupGeneral();
        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE_GUI));
    }

    @Cuando("se adiere un producto al carrito")
    public void seAdiereUnProductoAlCarrito() {
        actor.attemptsTo(
                SeleccionProducto.deseado(),
                AgregarProductoAleatorio.alCarrito(webdriver)
        );
    }

    @Entonces("el usuario proda eliminarlo de su carrito")
    public void elUsuarioProdaEliminarloDeSuCarrito() {
    }
}
