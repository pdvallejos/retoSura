package co.com.retoSura.tasks.gui;

import co.com.retoSura.interaccions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static co.com.retoSura.userinterfaces.gui.AgregarProductosFiltradosUserInterfaces.LNK_AGREGAR;
import static co.com.retoSura.userinterfaces.gui.AgregarProductosFiltradosUserInterfaces.LNK_PRODUCTO;
import static co.com.retoSura.userinterfaces.gui.MenuRelojesUserInterface.LNK_GEAR;
import static co.com.retoSura.userinterfaces.gui.MenuRelojesUserInterface.LNK_RELOJES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductoAleatorio implements Task {
    private final WebDriver driver;

    public AgregarProductoAleatorio(WebDriver driver) {this.driver = driver;}

    public static AgregarProductoAleatorio alCarrito(WebDriver driver) {
        return instrumented(AgregarProductoAleatorio.class, driver);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElement> elementosLi = driver.findElements(By.xpath(LNK_PRODUCTO));

        Random random = new Random();
        int indice = random.nextInt(elementosLi.size());

        WebElement elementoAleatorio = elementosLi.get(indice);
        agregarProducto(actor, elementoAleatorio, indice);
    }

    private <T extends Actor> void agregarProducto(T actor, WebElement elemento, int indice) {

        actor.attemptsTo(
                Esperar.unMomento(5),
                new MoveMouseToWebElement(elemento),
                Esperar.unMomento(6),
                Click.on(String.format(LNK_AGREGAR, indice+1))
        );
    }
}
