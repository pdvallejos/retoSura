package co.com.retoSura.definitions.api.usuario;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.Usuario;
import co.com.retoSura.models.api.UsuarioInvalido;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.questions.api.AssertInteger.assertInteger;
import static co.com.retoSura.tasks.api.DoPost.doPost;
import static co.com.retoSura.tasks.api.DoPut.doPut;
import static co.com.retoSura.util.CrearAutor.createAutor;
import static co.com.retoSura.util.CrearAutor.crearAutorInvalido;
import static co.com.retoSura.util.CrearUsuario.crearUsuario;
import static co.com.retoSura.util.CrearUsuario.crearUsuarioInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class EditarUsuarioDefinition extends SetupApi {

    private static UsuarioInvalido usuarioInvalido;
    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Cuando("ingrese los datos necesarios para la actualización del usuario")
    public void ingreseLosDatosNecesariosParaLaActualizaciónDelUsuario() throws JsonProcessingException {
        usuario = crearUsuario();
        actor.attemptsTo(
                doPut().usingTheResource(USUARIO_RECURSO + "/1").withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(usuario)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo usuario con los datos actuales")
    public void elSistemaDeberáMostrarElNuevoUsuarioConLosDatosActuales() throws JsonProcessingException {
        Autor autorResponse = objectMapper.readValue(response, Autor.class);
        actor.should(
                seeThat(assertInteger().is(usuario.getId(), autorResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la actualización del usuario")
    public void ingreseDatosIncorrectosParaLaActualizaciónDelUsuario() throws JsonProcessingException {
        usuarioInvalido = crearUsuarioInvalido();
        actor.attemptsTo(
                doPost().usingTheResource(USUARIO_RECURSO + "/1").withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(usuarioInvalido)));
        response = SerenityRest.lastResponse().getBody().asString();
    }
}
