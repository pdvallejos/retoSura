package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class ProcesoDeCompra extends PageObject {


    public static final Target TXT_CORREO =  Target
            .the("correo electronico")
            .located(By.xpath("//body/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[1]/fieldset[1]/div[1]/div[1]/input[1]"));

    public static final Target TXT_NOMBRE =  Target
            .the("nombre")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[1]/div[1]/input[1]"));

    public static final Target TXT_APELLIDO =  Target
            .the("apellido")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target TXT_DIRECCION =  Target
            .the("direccion")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/input[1]"));

    public static final Target TXT_CIUDAD =  Target
            .the("ciudad")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[4]/div[1]/input[1]"));

    public static final Target TXT_CODIGO_POSTAL =  Target
            .the("codigo postal")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[7]/div[1]/input[1]"));

    public static final Target TXT_TELEFONO =  Target
            .the("telefono")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[9]/div[1]/input[1]"));

    public static final Target LST_ESTADO =  Target
            .the("Lista estado")
            .located(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[2]/div[1]/div[2]/div[4]/ol[1]/li[1]/div[2]/form[2]/div[1]/div[5]/div[1]/select[1]"));

    public static final Target CHK_PRECIO =  Target
            .the("Check Precio")
            .located(By.name("ko_unique_3"));

    public static final Target BTN_SIGUIENTE =  Target
            .the("Boton Siguiente")
            .located(By.cssSelector("button.button.action.continue.primary"));

    public static final Target BTN_REALIZAR_PEDIDO =  Target
            .the("Boton Pedido Realizado")
            .located(By.cssSelector("button.action.primary.checkout"));



}
