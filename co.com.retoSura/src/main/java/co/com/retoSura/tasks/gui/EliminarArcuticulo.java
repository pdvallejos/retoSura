package co.com.retoSura.tasks.gui;

import co.com.retoSura.interaccions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.retoSura.userinterfaces.gui.CarritoCompras.ELIMINAR_ARTICULO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarArcuticulo implements Task {

    public static Performable carrito() {
        return instrumented(EliminarArcuticulo.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ELIMINAR_ARTICULO),
                Esperar.unMomento(5)
        );
    }
}
