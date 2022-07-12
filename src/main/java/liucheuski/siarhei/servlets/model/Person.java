package liucheuski.siarhei.servlets.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    private String phone;
    private String email;

    public Person(Person person) {
        this.name = person.name;
        this.phone = person.phone;
        this.email = person.email;
    }

    public Person(String nname, String nphone, String nemail) {
        this.name = nname;
        this.phone = nphone;
        this.email = nemail;
    }
}
