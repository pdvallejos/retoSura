package co.com.retoSura.definitions.api.libro;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
import co.com.retoSura.models.api.Libro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.questions.api.AssertInteger.assertInteger;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.tasks.api.DoPut.doPut;
import static co.com.retoSura.util.CrearAutor.crearAutorInvalido;
import static co.com.retoSura.util.CrearAutor.createAutor;
import static co.com.retoSura.util.CrearLibro.generarLibro;
import static co.com.retoSura.util.CrearLibro.generarLibroInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class EditarLibroDefinition extends SetupApi {

    private static BigInteger wrongId = new BigInteger("8348937884843");
    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Cuando("ingrese los datos necesarios para la actualización del libro")
    public void ingreseLosDatosNecesariosParaLaActualizaciónDelLibro() throws IOException{
        libro = generarLibro();
        actor.attemptsTo(
                doPut()
                    .usingTheResource(CREAR_LIBRO_RECURSO + "/1")
                    .withHeaders(headers)
                    .andBodyRequest(objectMapper.writeValueAsString(libro)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo libro con los datos actuales")
    public void elSistemaDeberáMostrarElNuevoLibroConLosDatosActuales() throws JsonProcessingException {
        Libro libroResponse = objectMapper.readValue(response, Libro.class);
        actor.should(
            seeThat(assertInteger().is(libro.getId(), libroResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la actualización del libro")
    public void ingreseDatosIncorrectosParaLaActualizaciónDelLibro() throws IOException {
        libroInvalido = generarLibroInvalido();
        actor.attemptsTo(
            doPut()
                    .usingTheResource(CREAR_LIBRO_RECURSO+"/1")
                    .withHeaders(headers)
                    .andBodyRequest(objectMapper.writeValueAsString(libroInvalido)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

}
