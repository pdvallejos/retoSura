package co.com.retoSura.definitions.api.autor;

import co.com.retoSura.definitions.api.setup.SetUp;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.InvalidAutor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.questions.api.AssertInteger.assertInteger;
import static co.com.retoSura.questions.api.AssertText.assertText;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.util.CreateObjects.createActor;
import static co.com.retoSura.util.CreateObjects.createInvalidAutor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearUsuarioDefinition extends SetUp {
    private static String actorName = "Pepe";
    protected Map<String, String> headers = new HashMap<>() {{
        put("Content-Type", "application/json");
    }};
    private String resource = "/api/v1/Authors";
    private static String response;
    private static Autor autor;
    private static InvalidAutor invalidAutor;
    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


    /*@Dado("que el cliente ingreso a la pagina")
    public void queElClienteIngresoALaPagina() {
        setUpLog4j2();
        actor = Actor.named(actorName);
        actor.can(CallAnApi.at(URL_BASE_REST_FAKE_API));
    }*/

    @Cuando("ingrese los datos necesarios para la creación del autor")
    public void ingreseLosDatosNecesariosParaLaCreaciónDelAutor() throws JsonProcessingException {
        autor = createActor();
            actor.attemptsTo(
                    doPost().usingTheResource(resource).withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(autor)));
            response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo autor creado")
    public void elSistemaDeberáMostrarElNuevoAutorCreado() throws JsonProcessingException {
        Autor autorResponse = objectMapper.readValue(response, Autor.class);
        actor.should(
                seeThat(assertInteger().is(autor.getId(), autorResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la creación del autor")
    public void ingreseDatosIncorrectosParaLaCreaciónDelAutor() throws JsonProcessingException {
        invalidAutor = createInvalidAutor();
        actor.attemptsTo(
                doPost().usingTheResource(resource).withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(invalidAutor)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    /*@Entonces("el sistema deberá mostrar un mensaje de error")
    public void elSistemaDeberáMostrarUnMensajeDeError() throws JsonProcessingException {
        actor.should(
                seeThatResponse("El código de respuesta debe ser" + HttpStatus.SC_BAD_REQUEST,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_BAD_REQUEST))
        );
    }*/
}
