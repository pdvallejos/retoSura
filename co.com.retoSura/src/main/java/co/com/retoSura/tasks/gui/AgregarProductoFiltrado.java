package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
        List<WebElement> elementosLi = driver.findElements(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol"));

        List<WebElement> elementosLiExcluido = elementosLi.subList(0, elementosLi.size() - 1);

        for (WebElement elemento : elementosLiExcluido) {
            // Realiza la acción que necesites con cada elemento `li`
            WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions
                            .elementToBeClickable(elemento.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[*]/ol/li[1]/div/div/div[3]/div/div[1]/form/button"))));


            button.click();
        }
    }
}
