package liucheuski.siarhei.servlets.command;

import liucheuski.siarhei.servlets.exception.IncorrectDataException;
import liucheuski.siarhei.servlets.exception.ServiceException;
import liucheuski.siarhei.servlets.util.page.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterPageCommand implements Command {
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws IncorrectDataException, ServiceException, IOException {
        System.out.println("REGISTER_PAGE");
        return new CommandResult(Page.REGISTER_PAGE.getPage(), false);
    }
}
