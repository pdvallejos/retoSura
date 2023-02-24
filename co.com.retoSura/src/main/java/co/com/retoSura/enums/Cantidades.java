package co.com.retoSura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum Cantidades {
    CERO("0"),
    UNO("1"),
    DOS("2"),
    TRES("3");
    private final String valor;
}
