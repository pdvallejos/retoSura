package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.cssSelector;

public class CarritoCompras {

    public static final Target CARRO_COMPRAS = Target
            .the("Carrito de compras")
            .located(cssSelector("body > div.page-wrapper > header > div.header.content > div.minicart-wrapper > a"));

    public static final Target MIRAR_CARRO_COMPRAS = Target
            .the("Mirar Carrito de compras")
            .located(cssSelector("#minicart-content-wrapper > div.block-content > div:nth-child(7) > div > a > span"));

    public static final Target PRECIO_TOTAL = Target
            .the("Precio Total")
            .located(cssSelector(".totals :first-child .amount .price"));

    public static final Target ELIMINAR_ARTICULO = Target.the("elimina el articulo")
            .located(cssSelector("#shopping-cart-table > tbody > tr.item-actions > td > div > a.action.action-delete"));

    public static final Target CARRITO_VACIO_VALIDACION = Target.the("mensaje que arroja cuando el carrito esta vacio")
            .located(By.xpath("//p[contains(text(), 'no items')]"));

}
