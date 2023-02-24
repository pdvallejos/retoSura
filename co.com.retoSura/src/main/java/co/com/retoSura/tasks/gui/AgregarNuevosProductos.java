package co.com.retoSura.tasks.gui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.retoSura.enums.Cantidades.DOS;
import static co.com.retoSura.enums.Cantidades.TRES;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.BTN_ANADIR_CARRO;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.CANTIDAD;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.CHAQUETA_HOMBRE;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.CHAQUETA_MUJER;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.COLOR_NEGRO;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.NUEVOS_PRODUCTOS;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.PRODUCTO_A_SELECCIONAR;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.CAMISAS_MUJER;
import static co.com.retoSura.userinterfaces.gui.NuevosProductosLocalizadores.TALLA_M;

public class AgregarNuevosProductos implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NUEVOS_PRODUCTOS),
                Click.on(CHAQUETA_HOMBRE),
                Click.on(PRODUCTO_A_SELECCIONAR),
                Click.on(TALLA_M),
                Click.on(COLOR_NEGRO),
                Enter.theValue(DOS.getValor()).into(CANTIDAD),
                Click.on(BTN_ANADIR_CARRO),
                Click.on(NUEVOS_PRODUCTOS),
                Click.on(CHAQUETA_MUJER),
                Click.on(PRODUCTO_A_SELECCIONAR),
                Click.on(TALLA_M),
                Click.on(COLOR_NEGRO),
                Enter.theValue(TRES.getValor()).into(CANTIDAD),
                Click.on(BTN_ANADIR_CARRO),
                Click.on(NUEVOS_PRODUCTOS),
                Click.on(CAMISAS_MUJER),
                Click.on(PRODUCTO_A_SELECCIONAR),
                Click.on(TALLA_M),
                Click.on(COLOR_NEGRO),
                Click.on(BTN_ANADIR_CARRO)
        );
    }
    public static AgregarNuevosProductos agregarNuevosProductos(){return new AgregarNuevosProductos();}
}
