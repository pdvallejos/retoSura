package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuRelojesUserInterface {
    public static final Target LNK_GEAR = Target.the("seleccion la opcion Gear")
            .located(By.id("ui-id-6"));
    public static final Target LNK_RELOJES = Target.the("selecciona la opcion Watches")
            .located(By.id("ui-id-27"));
}
