package co.com.retoSura.userinterfaces.gui;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.cssSelector;

public class CreacionYSinginLocalizadores {
    public static final Target CREAR_NUEVO_CLIENTE = Target
            .the("Crear nuevo Cliente")
            .located(cssSelector("header a[href*='https://magento.softwaretestingboard.com/customer/account/create/']"));

    public static final Target PRIMER_NOMBRE = Target
            .the("Primer Nombre")
            .located(id("firstname"));

    public static final Target SEGUNDO_NOMBRE = Target
            .the("Segundo Nombre")
            .located(id("lastname"));

    public static final Target CORREO_ELECTRONICO_CREACION = Target
            .the("Correo Electronico creacion")
            .located(id("email_address"));

    public static final Target CONTRASENA_CREACION = Target
            .the("Contrasena creacion")
            .located(cssSelector("#password.input-text"));

    public static final Target CONFIRMACION_CONTRASENA = Target
            .the("Confirmacion Contrasena")
            .located(id("password-confirmation"));

    public static final Target BTN_CREAR_NUEVO_CLIENTE = Target
            .the("Boton Crear nuevo Cliente")
            .located(cssSelector("#form-validate .primary button"));

    public static final Target PESTANA_SALIR = Target
            .the("Pestana para Salir")
            .located(cssSelector("header span .action"));

    public static final Target OPCION_SALIR = Target
            .the("Opcion para salir")
            .located(cssSelector("li.customer-welcome.active li.authorization-link a[href*='https://magento.softwaretestingboard.com/customer/account/logout']"));

    public static final Target INGRESAR = Target
            .the("Ingresar")
            .located(cssSelector("header a[href*='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']"));

    public static final Target CORREO_ELECTRONICO_INGRESAR = Target
            .the("Correo Electronico")
            .located(id("email"));

    public static final Target CONTRASENA_CREACION_INGRESAR = Target
            .the("Contrasena ingresar")
            .located(cssSelector("fieldset #pass"));

    public static final Target BTN_INGRESAR = Target
            .the("Contrasena ingresar")
            .located(cssSelector("fieldset #send2"));
}
