package co.com.retoSura.tasks.gui;

import co.com.retoSura.interaccions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retoSura.interaccions.Esperar.unMomento;
import static co.com.retoSura.userinterfaces.gui.CarritoCompras.CARRO_COMPRAS;
import static co.com.retoSura.userinterfaces.gui.CarritoCompras.MIRAR_CARRO_COMPRAS;


public class VerificarCarritoCompras implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unMomento(2),
                Click.on(CARRO_COMPRAS),
                Click.on(MIRAR_CARRO_COMPRAS),
                unMomento(2)
        );
    }

    public static VerificarCarritoCompras mio(){return new VerificarCarritoCompras();}
}
