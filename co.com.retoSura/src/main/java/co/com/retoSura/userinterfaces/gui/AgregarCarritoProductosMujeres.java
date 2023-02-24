package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AgregarCarritoProductosMujeres extends PageObject {


    public static final Target LNK_VENTAS = Target
            .the("Link ventas")
            .located(By.id("ui-id-8"));

    public static final Target LNK_CHAQUETAS = Target
            .the("Link chaquetas")
            .located(By.linkText("Jackets"));

    public static final Target BTN_TALLA =  Target
            .the("Opcion talla de chaqueta")
            .located(By.id("option-label-size-143-item-168"));
    public static final  Target BTN_COLOR =  Target
            .the("opcion color azul de la chaqueta")
            .located(By.id("option-label-color-93-item-50"));
    public static final Target BTN_AGREGAR_AL_CARRITO = Target
            .the("opcion agregar productos al carrito")
            .located(By.cssSelector("button.action.tocart.primary"));



    public static final Target BTN_TALLA1 =  Target
            .the("Opcion talla de chaqueta")
            .located(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]"));
    public static final  Target BTN_COLOR1 =  Target
            .the("opcion color azul de la chaqueta")
            .located(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]"));
    public static final Target BTN_AGREGAR_AL_CARRITO1 = Target
            .the("opcion agregar productos al carrito")
            .located(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[2]/div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]/span[1]"));


}