package co.com.retoSura.enums;

import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {

    URL_BASE_GUI  ("https://magento.softwaretestingboard.com/"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers");

    private final String valor;

}
