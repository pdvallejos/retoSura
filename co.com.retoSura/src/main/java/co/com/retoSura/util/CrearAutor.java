package co.com.retoSura.util;

import co.com.retoSura.models.api.Autor;
import co.com.retoSura.models.api.AutorInvalido;

public class CrearAutor {

    public static Autor createAutor(){
        Autor autor = new Autor();
        autor.setId(1);
        autor.setIdBook(2);
        autor.setFirstName("pepe");
        autor.setLastName("morales");
        return autor;
    }

    public static AutorInvalido crearAutorInvalido(){
        AutorInvalido invalidAutor = new AutorInvalido();
        invalidAutor.setId(1);
        invalidAutor.setIdBook(2);
        invalidAutor.setFirstName(1);
        invalidAutor.setLastName(2);
        return invalidAutor;
    }
}
