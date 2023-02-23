package co.com.retoSura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TextosValidacion {

    TXT_REGISTRO_COMPLETO("Thank you for registering with Fake Online Clothing Store."),
    TXT_INICIO_DE_SECCION("Welcome, ");

    private final String valor;
}
