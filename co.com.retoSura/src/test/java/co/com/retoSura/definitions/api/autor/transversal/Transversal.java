package co.com.retoSura.definitions.api.autor.transversal;

import co.com.retoSura.definitions.api.setup.SetUp;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;

import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class Transversal extends SetUp {
    private static String actorName = "Pepe";

    @Dado("que el cliente ingreso a la pagina")
    public void queElClienteIngresoALaPagina() {
        setUpLog4j2();
        actor = Actor.named(actorName);
        actor.can(CallAnApi.at(URL_BASE_REST_FAKE_API));
    }

    @Entonces("el sistema deberá mostrar un mensaje de error")
    public void elSistemaDeberáMostrarUnMensajeDeError() throws JsonProcessingException {
        actor.should(
                seeThatResponse("El código de respuesta debe ser" + HttpStatus.SC_BAD_REQUEST,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_BAD_REQUEST))
        );
    }
}
