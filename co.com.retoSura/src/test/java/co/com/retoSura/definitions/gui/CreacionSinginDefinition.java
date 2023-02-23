package co.com.retoSura.definitions.gui;

import co.com.retoSura.services.generics.Setup;
import co.com.retoSura.util.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import java.util.ArrayList;


import static co.com.retoSura.enums.Diccionario.URL_BASE_GUI;
import static co.com.retoSura.enums.TextosValidacion.TXT_INICIO_DE_SECCION;
import static co.com.retoSura.questions.gui.ValidarTexto.validarTextos;
import static co.com.retoSura.tasks.gui.CrearCliente.crearCliente;
import static co.com.retoSura.tasks.gui.SingIn.singIn;
import static co.com.retoSura.userinterfaces.gui.CreacionYSinginLocalizadores.TITULO_INGRESO;
import static co.com.retoSura.util.Utilidades.obtenerTextoElemento;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CreacionSinginDefinition extends Setup {
    public ArrayList<String> listaCliente = Utilidades.generarClientesAleatorios();

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
//        actor.should(seeThat(
//                validarTextos(obtenerTextoElemento(MSJ_REGISTRO, actor),TXT_REGISTRO_COMPLETO.getValor())
//        ));
    }

    @Entonces("el usuario puede ingresar por sing in")
    public void IngresarPorSingIn() {
        actor.attemptsTo(
                singIn().conCorreo(listaCliente.get(2))
                        .conContrasena(listaCliente.get(3))
        );
        System.out.println(obtenerTextoElemento(TITULO_INGRESO, actor));
        System.out.println(TXT_INICIO_DE_SECCION.getValor()+listaCliente.get(0)+" "+listaCliente.get(1)+"!");
        actor.should(seeThat(
                validarTextos(obtenerTextoElemento(TITULO_INGRESO, actor),TXT_INICIO_DE_SECCION.getValor()+listaCliente.get(0)+" "+listaCliente.get(1)+"!")
        ));
    }

}
