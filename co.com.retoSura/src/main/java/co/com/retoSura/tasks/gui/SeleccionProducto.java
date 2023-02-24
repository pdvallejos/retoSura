package co.com.retoSura.tasks.gui;

import co.com.retoSura.interaccions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoSura.userinterfaces.gui.MenuRelojesUserInterface.LNK_GEAR;
import static co.com.retoSura.userinterfaces.gui.MenuRelojesUserInterface.LNK_RELOJES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionProducto implements Task {
    public static Performable deseado() { return instrumented(SeleccionProducto.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unMomento(5),
                new MoveMouseToTarget(LNK_GEAR),
                WaitUntil.the(LNK_RELOJES, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(LNK_RELOJES)
        );
    }
}
