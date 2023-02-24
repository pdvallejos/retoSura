package co.com.retoSura.util;

import co.com.retoSura.models.api.Usuario;
import co.com.retoSura.models.api.UsuarioInvalido;

public class CrearUsuario {

    public static Usuario crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setUserName("elcompae");
        usuario.setPassword("1234rrr");
        return usuario;
    }

    public static UsuarioInvalido crearUsuarioInvalido(){
        UsuarioInvalido usuario = new UsuarioInvalido();
        usuario.setId(1);
        usuario.setUserName(1);
        usuario.setPassword(2);
        return usuario;
    }
}
