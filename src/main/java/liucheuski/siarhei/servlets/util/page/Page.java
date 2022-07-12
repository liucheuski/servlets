package liucheuski.siarhei.servlets.util.page;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Page {
    LOGIN_PAGE("/WEB-INF/views/login.jsp"),
    REGISTER_PAGE("/WEB-INF/views/register.jsp"),
    WELCOME_PAGE("/WEB-INF/views/welcome.jsp"),
    ERROR_PAGE("/WEB-INF/views/errorpage.jsp");
    private final String page;
}
