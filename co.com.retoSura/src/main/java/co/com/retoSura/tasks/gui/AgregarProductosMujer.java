package co.com.retoSura.tasks.gui;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.retoSura.userinterfaces.gui.AgregarCarritoProductosMujeres.*;


public class AgregarProductosMujer implements Task {

    @Override
    public <T extends Actor>  void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LNK_VENTAS),
                Click.on(LNK_CHAQUETAS),
                Click.on(BTN_TALLA).then(Click.on(BTN_COLOR)).then(Click.on(BTN_AGREGAR_AL_CARRITO)),
                Click.on(BTN_TALLA1).then(Click.on(BTN_COLOR1)).then(Click.on(BTN_AGREGAR_AL_CARRITO1))

        );
    }

    public static AgregarProductosMujer agregarProductosMujer() {
        return new AgregarProductosMujer();
    }
}








