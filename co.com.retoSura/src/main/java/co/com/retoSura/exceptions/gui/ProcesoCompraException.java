package co.com.retoSura.exceptions.gui;

public class ProcesoCompraException extends RuntimeException {

    public ProcesoCompraException(String mensaje) {
        super(mensaje);
    }

    public ProcesoCompraException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }




}
