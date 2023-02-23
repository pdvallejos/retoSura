package co.com.retoSura.definitions.gui;

import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.util.UsuariosAleatoreos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import java.util.ArrayList;


import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;
import static co.com.retoSura.tasks.gui.CrearCliente.crearCliente;
import static co.com.retoSura.tasks.gui.SingIn.singIn;

public class CreacionSinginDefinition extends Setup {
    public ArrayList<String> listaCliente = UsuariosAleatoreos.generarClientesAleatorios();

    @Dado("que el usuario quiere crear un nuevo usuario en la pagina")
    public void CrearNuevoUsuarioPagina() {
        setupGeneral();

        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE_GUI.getValor()));
//        theActorInTheSpotlight().wasAbleTo(new AbrirPagina()
//        );


    }

    @Cuando("el usuario ingrese los datos y cree el nuevo usuario")
    public void IngresarDatosYCrearNuevoUsuario() {
        actor.attemptsTo(
                crearCliente().conNombre(listaCliente.get(0))
                        .conSegundoNombre(listaCliente.get(1))
                        .conCorreo(listaCliente.get(2))
                        .conContrasena(listaCliente.get(3))
                        .conSegundaContrasena(listaCliente.get(3))
        );
    }

    @Entonces("el usuario puede ingresar por sing in")
    public void IngresarPorSingIn() {
        actor.attemptsTo(
                singIn().conCorreo(listaCliente.get(2))
                        .conContrasena(listaCliente.get(3))
        );
    }

}
