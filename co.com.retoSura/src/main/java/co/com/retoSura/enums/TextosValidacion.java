package co.com.retoSura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TextosValidacion {
    TXT_INICIO_DE_SECCION("Welcome, "),
    TXT_PRECIO_TOTAL("$345.00");

    private final String valor;
}
