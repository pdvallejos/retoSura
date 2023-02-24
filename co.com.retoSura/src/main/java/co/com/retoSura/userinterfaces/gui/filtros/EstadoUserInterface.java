package co.com.retoSura.userinterfaces.gui.filtros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstadoUserInterface {
    public static final Target TXT_ESTADO = Target.the("seleccion de estado")
            .located(By.xpath("//div[contains(text(), 'New')]"));

    public static final Target  LNK_NUEVO = Target.the("selecciona el estado nuevo")
            .located(By.xpath("//a[contains(text(), 'Yes')]"));
}
