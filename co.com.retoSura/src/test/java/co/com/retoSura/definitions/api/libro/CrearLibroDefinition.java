package co.com.retoSura.definitions.api.libro;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Libro;
import co.com.retoSura.models.api.LibroInvalido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import lombok.SneakyThrows;
import net.serenitybdd.rest.SerenityRest;

import java.io.IOException;

import static co.com.retoSura.questions.api.AssertInteger.assertInteger;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.util.CrearAutor.crearAutorInvalido;
import static co.com.retoSura.util.CrearLibro.generarLibro;
import static co.com.retoSura.util.CrearLibro.generarLibroInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearLibroDefinition extends SetupApi{

    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Cuando("ingrese los datos necesarios para la creación del libro")
    public void ingreseLosDatosNecesariosParaLaCreaciónDelLibro() throws IOException {
        libro = generarLibro();
        actor.attemptsTo(doPost()
                .usingTheResource(CREAR_LIBRO_RECURSO)
                .withHeaders(headers)
                .andBodyRequest(objectMapper.writeValueAsString(libro)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo libro creado")
    public void elSistemaDeberáMostrarElNuevoLibroCreado() throws JsonProcessingException {

        // Convertir la respuesta en un objeto Autor usando ObjectMapper
        Libro libroResponse = objectMapper.readValue(response, Libro.class);
        // Se valida que el ID del libro creado sea igual al ID de la respuesta
        actor.should(
                seeThat(assertInteger().is(libro.getId(), libroResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la creación del libro")
    public void ingreseDatosIncorrectosParaLaCreaciónDelLibro() throws JsonProcessingException {
        libroInvalido = generarLibroInvalido();
        actor.attemptsTo(doPost()
                .usingTheResource(CREAR_LIBRO_RECURSO)
                .withHeaders(headers)
                .andBodyRequest(objectMapper.writeValueAsString(libroInvalido)));
        response = SerenityRest.lastResponse().getBody().asString();
    }
}
