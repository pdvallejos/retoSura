package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ValidarCompra extends PageObject {

    public static final Target TXT_CONFIRMACION =  Target
            .the("Texto confirmacion de compra")
            .located(By.xpath("//*[@id=\"registration\"]/div[2]/p[2]/span[2]"));


}
