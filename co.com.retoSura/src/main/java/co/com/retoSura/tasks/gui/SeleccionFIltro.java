package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.retoSura.userinterfaces.gui.filtros.EstadoUserInterface.LNK_NUEVO;
import static co.com.retoSura.userinterfaces.gui.filtros.EstadoUserInterface.TXT_ESTADO;
import static co.com.retoSura.userinterfaces.gui.filtros.GeneroUserInterface.LNK_MASCULINO;
import static co.com.retoSura.userinterfaces.gui.filtros.GeneroUserInterface.TXT_GENERO;
import static co.com.retoSura.userinterfaces.gui.filtros.MaterialUserInterface.LNK_PLASTICO;
import static co.com.retoSura.userinterfaces.gui.filtros.MaterialUserInterface.TXT_MATERIAL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionFIltro implements Task {
    public static Performable requerido() { return instrumented(SeleccionFIltro.class);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_GENERO),
                Click.on(LNK_MASCULINO),
                Scroll.to(TXT_MATERIAL),
                Click.on(TXT_MATERIAL),
                Click.on(LNK_PLASTICO),
                Scroll.to(TXT_ESTADO),
                Click.on(TXT_ESTADO),
                Click.on(LNK_NUEVO)
        );
    }
}
