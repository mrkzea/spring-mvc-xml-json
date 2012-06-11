package demo.domain.xml;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("data")
public class XMLResponse {


    @XStreamAsAttribute
    private String name;

    @XStreamAsAttribute
    private String surname;

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }
    public String getSurname() { return surname; }
    public void setSurname(String value) { this.surname = value; }



}
