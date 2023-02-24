package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductosFiltradosUserInterfaces {


    private static int indice;
    public static final Target LNK_PRODUCTO = Target.the("seleccion la opcion Gear")
            .located(By.xpath("//*[@id='maincontent']/div[3]/div[1]/div[3]/ol"));

    public static final Target LNK_AGREGAR = Target.the("agrega el produco al carro de compras")
            .located(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[*]/ol/li[1]/div/div/div[3]/div/div[1]/form/button"));

}
