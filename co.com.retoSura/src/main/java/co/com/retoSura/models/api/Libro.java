package co.com.retoSura.models.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "description",
        "pageCount",
        "excerpt",
        "publishDate"
})


@Data

public class Libro {

    @JsonProperty("id")
    private int id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("pageCount")
    private int pageCount;
    @JsonProperty("excerpt")
    private String excerpt;
    @JsonProperty("publishDate")
    private String publishData;


}
