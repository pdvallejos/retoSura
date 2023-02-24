package co.com.retoSura.tasks.gui;

import co.com.retoSura.interaccions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import static co.com.retoSura.userinterfaces.gui.AgregarProductosFiltradosUserInterfaces.LNK_AGREGAR;
import static co.com.retoSura.userinterfaces.gui.AgregarProductosFiltradosUserInterfaces.LNK_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductoFiltrado implements Task {
    private WebDriver driver;

    public AgregarProductoFiltrado(WebDriver driver) {
        this.driver = driver;
    }

    public static AgregarProductoFiltrado todos(WebDriver driver) {
        return instrumented(AgregarProductoFiltrado.class, driver);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> elementosLi = driver.findElements(By.xpath(LNK_PRODUCTO));
        List<WebElement> elementosLiExcluido = elementosLi.subList(0, elementosLi.size());
        int indice = 1;

        for (WebElement elemento : elementosLiExcluido) {

            agregarProducto(actor, elemento, indice);
            indice++;
        }
    }

    private <T extends Actor> void agregarProducto(T actor, WebElement elemento, int indice) {

        actor.attemptsTo(
                Esperar.unMomento(5),
                new MoveMouseToWebElement(elemento),
                Esperar.unMomento(5),
                Click.on(String.format(LNK_AGREGAR, indice))
                );
    }
}
