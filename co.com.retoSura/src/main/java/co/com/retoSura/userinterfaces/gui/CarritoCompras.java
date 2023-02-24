package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;

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

}
