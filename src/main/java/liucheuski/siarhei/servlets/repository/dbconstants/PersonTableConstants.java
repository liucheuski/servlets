package liucheuski.siarhei.servlets.repository.dbconstants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PersonTableConstants {
    ID("id"),
    NAME("pname"),
    PHONE("phone"),
    EMAIL("email");
    private String fieldName;
}
