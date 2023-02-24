package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class NuevosProductosLocalizadores {

    public static final Target NUEVOS_PRODUCTOS = Target
            .the("Nuevos productos")
            .located(cssSelector("#ui-id-3 > span"));

    public static final Target CHAQUETA_HOMBRE = Target
            .the("Chaqueta hombre")
            .located(cssSelector("#maincontent > div.columns > div.sidebar.sidebar-main > div > div > ul:nth-child(4) > li:nth-child(2) > a"));

    public static final Target PRODUCTO_A_SELECCIONAR = Target
            .the("Producto para seleccionar")
            .located(cssSelector("#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(1) > div > a > span > span > img"));

    public static final Target TALLA_M = Target
            .the("Talla M")
            .located(id("option-label-size-143-item-168"));

    public static final Target COLOR_NEGRO = Target
            .the("Color negro")
            .located(id("option-label-color-93-item-49"));

    public static final Target CANTIDAD = Target
            .the("Cantidad de productos")
            .located(id("qty"));

    public static final Target BTN_ANADIR_CARRO = Target
            .the("Boton Añadir al carro")
            .located(id("product-addtocart-button"));

    public static final Target CHAQUETA_MUJER = Target
            .the("Chaqueta de mujer")
            .located(cssSelector("#maincontent > div.columns > div.sidebar.sidebar-main > div > div > ul:nth-child(2) > li:nth-child(2) > a"));

    public static final Target CAMISAS_MUJER = Target
            .the("Camisas de mujer")
            .located(cssSelector("#maincontent > div.columns > div.sidebar.sidebar-main > div > div > ul:nth-child(2) > li:nth-child(3) > a"));
}
