package co.com.retoSura.userinterfaces.gui.filtros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MaterialUserInterface {
    public static final Target TXT_MATERIAL = Target.the("seleccion de tipo de material")
            .located(By.xpath("//div[contains(text(), 'Material')]"));

    public static final Target LNK_PLASTICO = Target.the("seleccion material plastico")
            .located(By.xpath("//a[contains(text(), 'Plastic')]"));
}
