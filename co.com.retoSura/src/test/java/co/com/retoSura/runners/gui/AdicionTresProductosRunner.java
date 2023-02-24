package co.com.retoSura.runners.gui;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/gui/adicion_tres_productos.feature"},
        glue = {"co.com.retoSura.definitions.gui"})
public class AdicionTresProductosRunner {
}
