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
public class LibroInvalido {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("pageCount")
    private String pageCount;
    @JsonProperty("excerpt")
    private String excerpt;
    @JsonProperty("publishDate")
    private String publishData;


}
