
package demo.domain.json;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "name",
    "surname"
})
public class JSONResponse implements Serializable
{

    @JsonProperty("name")
    private String name;

    @JsonProperty("surname")
    private String surname;

    @JsonProperty("name")
    public String getName() {
        return name;
    }


    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }


    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }


    @JsonProperty("surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
