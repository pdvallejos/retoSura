package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarCarritoProductosHombres  extends PageObject {

    public static final Target LNK_HOMBRES = Target
            .the("link seccion hombres")
            .located(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
    public static final Target LNK_PANTALONES = Target
            .the("link seccion pantalones")
            .located(By.linkText("Shorts"));


    public static final Target BTN_TALLA= Target
            .the("opcion talla")
            .located(By.id("option-label-size-143-item-176"));
    public static final Target BTN_COLOR= Target
            .the("opcion color")
            .located(By.id("option-label-color-93-item-58"));
    public static final Target BTN_AGREGAR_AL_CARRITO= Target
            .the("opcion color")
            .located(By.cssSelector("button.action.tocart.primary"));



    public static final Target BTN_TALLA1= Target
            .the("opcion color")
            .located(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]"));
    public static final Target BTN_COLOR1= Target
            .the("opcion color")
            .located(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]"));
    public static final Target BTN_AGREGAR_AL_CARRITO1= Target
            .the("opcion color")
            .located(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]"));


    public static final Target LNK_CARRITO_DE_COMPRAS= Target
            .the("opcion color")
            .located(By.xpath("//header/div[2]/div[1]/a[1]"));
    public static final Target BTN_PASAR_POR_CAJA =  Target
            .the("boton pasar por caja")
            .located(By.id("top-cart-btn-checkout"));

}
