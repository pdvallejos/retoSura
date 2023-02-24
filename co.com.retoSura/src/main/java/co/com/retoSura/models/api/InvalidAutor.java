package co.com.retoSura.models.api;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "idBook",
        "firstName",
        "lastName"
})

public class InvalidAutor {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("idBook")
    private Integer idBook;
    @JsonProperty("firstName")
    private Integer firstName;
    @JsonProperty("lastName")
    private Integer lastName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("idBook")
    public Integer getIdBook() {
        return idBook;
    }

    @JsonProperty("idBook")
    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    @JsonProperty("firstName")
    public Integer getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(Integer firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public Integer getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(Integer lastName) {
        this.lastName = lastName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}