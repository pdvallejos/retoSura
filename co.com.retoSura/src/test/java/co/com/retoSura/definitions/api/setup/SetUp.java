package co.com.retoSura.definitions.api.setup;

import net.serenitybdd.screenplay.Actor;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.HashMap;
import java.util.Map;

import static co.com.retoSura.enums.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;
import static com.google.common.base.StandardSystemProperty.USER_DIR;

public class SetUp {
    protected static final Logger LOGGER = Logger.getLogger(SetUp.class);
    protected static final String URL_BASE_REST_FAKE_API= "https://fakerestapi.azurewebsites.net";


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
