package co.com.retoSura.definitions.api.transversal;

import co.com.retoSura.definitions.api.setup.SetupApi;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;

import static co.com.retoSura.enums.Diccionario.ACTOR_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class Transversal extends SetupApi {



    @Dado("que el cliente ingreso a la pagina")
    public void queElClienteIngresoALaPagina() {
        setUpLog4j2();
        actor = Actor.named(ACTOR_NAME.getValor());
        actor.can(CallAnApi.at(URL_BASE_REST_FAKE_API));
    }

    @Entonces("el sistema deberá mostrar un mensaje de error")
    public void elSistemaDeberáMostrarUnMensajeDeError() throws JsonProcessingException {
        actor.should(
            seeThat("el codigo de respuesta no debe ser 200", validatableResponse -> {
                if (SerenityRest.lastResponse().statusCode() != HttpStatus.SC_OK){
                    return true;
                }return false;
            })
        );
    }
}