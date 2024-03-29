package liucheuski.siarhei.servlets.command.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommandType {
    LOGIN("login"),
    SIGN_OUT("sign_out"),
    WELCOME("welcome"),
    REGISTER_NEW_USER("register_new_user"),
    ADD_NEW_PERSON("add_new_person"),
    LOGIN_PAGE("login_page"),
    REGISTRATION_PAGE("registration_page");
    private String command;

}
