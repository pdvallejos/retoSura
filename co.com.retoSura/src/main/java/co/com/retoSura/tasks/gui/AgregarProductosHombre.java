package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.retoSura.userinterfaces.gui.AgregarCarritoProductosHombres.LNK_HOMBRES;
import static co.com.retoSura.userinterfaces.gui.AgregarCarritoProductosHombres.LNK_PANTALONES;
import static co.com.retoSura.userinterfaces.gui.AgregarCarritoProductosHombres.*;


public class AgregarProductosHombre implements Task {

    WebDriver driver;


    public AgregarProductosHombre agregarProductosHombre(WebDriver driver) {
        this.driver = driver;
        return null;
    }

    public static AgregarProductosHombre todo(WebDriver driver) {
        return instrumented(AgregarProductosHombre.class, driver);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LNK_HOMBRES),
                Click.on(LNK_PANTALONES),
                Click.on(BTN_TALLA).then(Click.on(BTN_COLOR)).then(Click.on(BTN_AGREGAR_AL_CARRITO)),
                Click.on(BTN_TALLA_DOS).then(Click.on(BTN_COLOR_DOS)).then(Click.on(BTN_AGREGAR_AL_CARRITO_DOS)),
                Click.on(LNK_CARRITO_DE_COMPRAS),
                Click.on(BTN_PASAR_POR_CAJA)
        );

    }
}





