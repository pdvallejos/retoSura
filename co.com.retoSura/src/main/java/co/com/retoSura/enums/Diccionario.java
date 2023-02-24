package co.com.retoSura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {



    URL_BASE_GUI  ("https://magento.softwaretestingboard.com/"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers"),
    VALIDACION_NO_DILIGENCIA_CAMPOS ("error durante el proceso de diligenciamiento de campos");


    private final String valor;


}
