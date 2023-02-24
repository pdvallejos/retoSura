package co.com.retoSura.runners.api.libro;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/api/libro/crearLibro.feature"},
        glue = {"co.com.retoSura.definitions"}
)
public class CrearLibroRunner {
}
