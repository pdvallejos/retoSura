package co.com.retoSura.util;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class UsuariosAleatoreos {

    public static ArrayList<String> generarClientesAleatorios(){
        ArrayList<String> listaCliente = new ArrayList<>();
        Faker usFaker = new Faker(new Locale("en-US"));
        String nombre = usFaker.name().firstName();
        listaCliente.add(nombre);
        String apellido = usFaker.name().lastName();
        listaCliente.add(apellido);
        String correo = nombre+apellido+"@gmail.com";
        listaCliente.add(correo);
        String contrasena = usFaker.bothify("#?#?#?#????"+":::");
        listaCliente.add(contrasena);
        return listaCliente;
    }

}
