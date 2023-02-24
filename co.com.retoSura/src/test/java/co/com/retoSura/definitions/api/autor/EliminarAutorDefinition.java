package co.com.retoSura.definitions.api.autor;

import co.com.retoSura.definitions.api.setup.SetUp;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.InvalidAutor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.tasks.api.DoDelete.doDelete;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.util.CreateObjects.createActor;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class EliminarAutorDefinition extends SetUp {
    private static String actorName = "Pepe";
    protected Map<String, String> headers = new HashMap<>() {{
        put("Content-Type", "application/json");
    }};
    private String resource = "/api/v1/Authors";
    private static String response;
    private static Autor autor;
    private static InvalidAutor invalidAutor;
    private static String wrongId = "/21321324543564";
    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);



    /*@Dado("que el cliente ingreso a la pagina")
    public void queElClienteIngresoALaPagina() {
        setUpLog4j2();
        actor = Actor.named(actorName);
        actor.can(CallAnApi.at(URL_BASE_REST_FAKE_API));
    }*/

    @Cuando("ingrese el autor que sera eliminado")
    public void ingreseElAutorQueSeraEliminado() {
        autor = createActor();
        actor.attemptsTo(
                doDelete().usingTheResource(resource + "/1")
        );
    }

    @Entonces("el sistema deberá mostrar que el autor a sido eliminado exitosamente")
    public void elSistemaDeberáMostrarQueElAutorASidoEliminadoExitosamente() {
        actor.should(
                seeThatResponse("El código de respuesta debe ser" + HttpStatus.SC_OK,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_OK))
        );
    }



    @Cuando("intente eliminar un autor que no exista")
    public void intenteEliminarUnAutorQueNoExista() {
        actor.attemptsTo(
                doDelete().usingTheResource(resource +  wrongId)
        );
    }

    /*@Entonces("el sistema deberá mostrar un mensaje de error")
    public void elSistemaDeberáMostrarUnMensajeDeError() {
        actor.should(
                seeThatResponse("El código de respuesta debe ser" + HttpStatus.SC_BAD_REQUEST,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_BAD_REQUEST))
        );
    }*/
}
