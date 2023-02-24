package co.com.retoSura.definitions.api.autor;

import co.com.retoSura.definitions.api.setup.SetupApi;
import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.tasks.api.DoDelete.doDelete;
import static co.com.retoSura.util.CrearAutor.createAutor;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class EliminarAutorDefinition extends SetupApi {

    ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    @Cuando("ingrese el autor que sera eliminado")
    public void ingreseElAutorQueSeraEliminado() {
        autor = createAutor();
        actor.attemptsTo(
                doDelete().usingTheResource(AUTOR_RECURSO + "/1")
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
                doDelete().usingTheResource(AUTOR_RECURSO +  ID_INCORRECTO)
        );
    }
}
