package co.com.retoSura.definitions.gui;

import co.com.retoSura.interaccions.Esperar;
import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.tasks.gui.AgregarProductoFiltrado;
import co.com.retoSura.tasks.gui.SeleccionFIltro;
import co.com.retoSura.tasks.gui.SeleccionProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import java.util.EmptyStackException;

import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;

public class FiltrosDefinition extends Setup {
    @Dado("que el usuario ingresa al sitio web")
    public void queElUsuarioIngresaAlSitioWeb() {
        setupGeneral();
        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE_GUI));
    }

    @Cuando("el usuario aplica los filtros")
    public void elUsuarioAplicaLosFiltros() {
        actor.attemptsTo(
                SeleccionProducto.deseado(),
                SeleccionFIltro.requerido()
        );

    }

    @Entonces("podra adicionar al carrito los productos encontrados")
    public void podraAdicionarAlCarritoLosProductosEncontrados() {
        actor.attemptsTo(
                AgregarProductoFiltrado.todos(webdriver),
                Esperar.unMomento(20)
        );
    }
}
