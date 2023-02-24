package co.com.retoSura.definitions.api.autor;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.questions.api.AssertInteger.assertInteger;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.tasks.api.DoPut.doPut;
import static co.com.retoSura.util.CrearAutor.createAutor;
import static co.com.retoSura.util.CrearAutor.crearAutorInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.equalTo;

public class EditarAutorDefinition extends SetupApi {

    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Cuando("ingrese los datos necesarios para la actualización del autor")
    public void ingreseLosDatosNecesariosParaLaActualizaciónDelAutor() throws JsonProcessingException {
        autor = createAutor();
        actor.attemptsTo(
                doPut().usingTheResource(AUTOR_RECURSO+"/1").withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(autor)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo autor con los datos actuales")
    public void elSistemaDeberáMostrarElNuevoAutorConLosDatosActuales() throws JsonProcessingException {
        Autor autorResponse = objectMapper.readValue(response, Autor.class);
        actor.should(
                seeThat(assertInteger().is(autor.getId(), autorResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la actualización del autor")
    public void ingreseDatosIncorrectosParaLaActualizaciónDelAutor() throws JsonProcessingException {
        invalidAutor = crearAutorInvalido();
        actor.attemptsTo(
                doPost().usingTheResource(AUTOR_RECURSO+"/1").withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(invalidAutor)));
        response = SerenityRest.lastResponse().getBody().asString();
    }
}
