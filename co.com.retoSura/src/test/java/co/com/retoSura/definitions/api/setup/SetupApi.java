package co.com.retoSura.definitions.api.setup;


import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
import co.com.retoSura.models.api.Libro;
import co.com.retoSura.models.api.LibroInvalido;
import co.com.retoSura.models.api.Usuario;
import co.com.retoSura.models.api.UsuarioInvalido;
import net.serenitybdd.screenplay.Actor;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.enums.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;


public class SetupApi {

    protected static final Logger LOGGER = Logger.getLogger(SetupApi.class);

    protected static final String URL_BASE_REST_FAKE_API= "https://fakerestapi.azurewebsites.net";
    protected static final String CREAR_LIBRO_RECURSO= "/api/v1/Books";
    protected static final String AUTOR_RECURSO = "/api/v1/Authors";
    protected static final String USUARIO_RECURSO = "/api/v1/Users";
    protected static final String ID_INCORRECTO = "/21321324543564";


    protected Libro libro;
    protected LibroInvalido libroInvalido;
    protected static String response;
    protected static Autor autor;
    protected static AutorInvalido invalidAutor;
    protected static Usuario usuario;
    protected static UsuarioInvalido usuarioInvalido;



    protected static Actor actor;
    protected Map<String, String> headers = new HashMap<>() {{
        put("Content-Type", "application/json");
    }};

    protected void setUpLog4j2() {
        try {
            PropertyConfigurator.configure(LOG4J_PROPERTIES_FILE_PATH.getValue());
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
        }
    }
}
