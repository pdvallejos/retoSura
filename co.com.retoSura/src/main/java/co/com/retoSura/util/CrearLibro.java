package co.com.retoSura.util;

import co.com.retoSura.models.api.Libro;
import co.com.retoSura.models.api.LibroInvalido;
import com.github.javafaker.Faker;


public class CrearLibro {

   public static Libro generarLibro() {
        Faker faker = new Faker();
        Libro libro = new Libro();
        libro.setTitle(faker.book().title());
        libro.setDescription(faker.lorem().paragraph());
        libro.setPageCount(3);
        libro.setExcerpt(faker.lorem().paragraph());
        libro.setPublishData(faker.book().publisher());
        return libro;

    }

    public static LibroInvalido generarLibroInvalido() {
        Faker faker = new Faker();
        LibroInvalido libroInvalido = new LibroInvalido();
        libroInvalido.setTitle(faker.book().title());
        libroInvalido.setDescription(faker.lorem().paragraph());
        libroInvalido.setPageCount(faker.book().title());
        libroInvalido.setExcerpt(faker.lorem().paragraph());
        libroInvalido.setPublishData(faker.book().publisher());
        return libroInvalido;

    }
}