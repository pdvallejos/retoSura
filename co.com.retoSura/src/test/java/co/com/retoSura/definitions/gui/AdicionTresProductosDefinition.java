package co.com.retoSura.definitions.gui;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import co.com.retoSura.services.generics.Setup;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;
import static co.com.retoSura.enums.TextosValidacion.TXT_PRECIO_TOTAL;
import static co.com.retoSura.questions.gui.ValidarTexto.validarTextos;
import static co.com.retoSura.tasks.gui.AgregarNuevosProductos.agregarNuevosProductos;;
import static co.com.retoSura.tasks.gui.VerificarCarritoCompras.verificarCarritoCompras;
import static co.com.retoSura.userinterfaces.gui.CarritoCompras.PRECIO_TOTAL;
import static co.com.retoSura.util.Utilidades.obtenerTextoElemento;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class AdicionTresProductosDefinition extends Setup {

    @Dado("que el usuario ingresa al portal web")
    public void ElUsuarioIngresaPortalWeb() {
        setupGeneral();
        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE_GUI.getValor())
        );
    };

    @Cuando("el usuario adicione los tres productos de diferentes categorias al carrito de compras")
    public void ElUsuarioAdicioneProductosDiferentesCategoriasCarritoCompras() {
        actor.attemptsTo(
                agregarNuevosProductos()
        );
    }
    @Entonces("el usuario puede validar en el carrito de compras si estos se adicionaron correctamente")
    public void ElUsuarioValideCarritoComprasAdicionCorrectamente() {
        actor.attemptsTo(
                verificarCarritoCompras()
        );
        actor.should(seeThat(
                validarTextos(obtenerTextoElemento(PRECIO_TOTAL, actor), TXT_PRECIO_TOTAL.getValor())
        ));
    }
}
