package co.com.retoSura.tasks.api;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;


import java.util.Map;

public class DoDelete implements Task {
    private String resource;
    private Map<String, String> headers;

    public DoDelete usingTheResource(String resource) {
        this.resource = resource;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(resource)
        );
    }


    public static DoDelete doDelete(){
        return new DoDelete();
    }
}
