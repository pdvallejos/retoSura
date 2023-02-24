package co.com.retoSura.definitions.api.libro;

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

public class EliminarLibroDefinition extends SetupApi {


    @Cuando("ingrese el libro que sera eliminado")
    public void ingreseElLibroQueSeraEliminado() {
        actor.attemptsTo(
                doDelete().usingTheResource(CREAR_LIBRO_RECURSO + "/1")
        );
    }

    @Entonces("el sistema deberá mostrar que el libro a sido eliminado exitosamente")
    public void elSistemaDeberáMostrarQueElLibroASidoEliminadoExitosamente() {
        actor.should(
                seeThatResponse("El código de respuesta debe ser" + HttpStatus.SC_OK,
                        validatableResponse -> validatableResponse.statusCode(HttpStatus.SC_OK))
        );
    }

    @Cuando("intente eliminar un libro que no exista")
    public void intenteEliminarUnLibroQueNoExista() {
        actor.attemptsTo(
                doDelete().usingTheResource(CREAR_LIBRO_RECURSO +  ID_INCORRECTO)
        );
    }
}
