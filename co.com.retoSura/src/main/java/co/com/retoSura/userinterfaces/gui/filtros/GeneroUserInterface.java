package co.com.retoSura.userinterfaces.gui.filtros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GeneroUserInterface {

    public static final Target TXT_GENERO = Target.the("seleccion de genero")
            .located(By.xpath("//div[contains(text(), 'Gender')]"));
    public static final Target LNK_MASCULINO = Target.the("seleccion genero masculino")
            .located(By.xpath("//div[contains(text(), 'Gender')]/following-sibling::*/ol/li/a"));
}
