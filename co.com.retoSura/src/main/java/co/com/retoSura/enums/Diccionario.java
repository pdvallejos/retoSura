package co.com.retoSura.enums;

public enum Diccionario {

    URL_BASE_GUI  ("https://magento.softwaretestingboard.com/"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers");

    private final String valor;

    Diccionario(String valor){
        this.valor=valor;
    }

    public String getValor() {
        return valor;
    }
}
