package co.com.retoSura.definitions.api.usuario;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
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
import static co.com.retoSura.util.CrearAutor.createAutor;
import static co.com.retoSura.util.CrearAutor.crearAutorInvalido;
import static co.com.retoSura.util.CrearUsuario.crearUsuario;
import static co.com.retoSura.util.CrearUsuario.crearUsuarioInvalido;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearUsuarioDefinition extends SetupApi {


    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);


    @Cuando("ingrese los datos necesarios para la creación del usuario")
    public void ingreseLosDatosNecesariosParaLaCreaciónDelUsuario() throws JsonProcessingException {
        usuario = crearUsuario();
        actor.attemptsTo(
                doPost().usingTheResource(USUARIO_RECURSO).withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(usuario)));
        response = SerenityRest.lastResponse().getBody().asString();
    }

    @Entonces("el sistema deberá mostrar el nuevo usuario creado")
    public void elSistemaDeberáMostrarElNuevoUsuarioCreado() throws JsonProcessingException {
        Usuario usuarioResponse = objectMapper.readValue(response, Usuario.class);
        actor.should(
                seeThat(assertInteger().is(usuario.getId(), usuarioResponse.getId()), equalTo(true))
        );
    }

    @Cuando("ingrese datos incorrectos para la creación del usuario")
    public void ingreseDatosIncorrectosParaLaCreaciónDelUsuario() throws JsonProcessingException {
        usuarioInvalido = crearUsuarioInvalido();
        actor.attemptsTo(
                doPost().usingTheResource(USUARIO_RECURSO).withHeaders(headers).andBodyRequest(objectMapper.writeValueAsString(usuarioInvalido)));
        response = SerenityRest.lastResponse().getBody().asString();
    }
}
