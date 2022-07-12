package liucheuski.siarhei.servlets.repository.dbconstants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserTableConstants {
    ID("id"),
    LOGIN("login"),
    PASSWORD("passw");
    private String fieldName;

}
