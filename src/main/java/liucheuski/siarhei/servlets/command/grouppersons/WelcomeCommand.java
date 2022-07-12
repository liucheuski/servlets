package liucheuski.siarhei.servlets.command.grouppersons;

import liucheuski.siarhei.servlets.command.Command;
import liucheuski.siarhei.servlets.command.CommandResult;
import liucheuski.siarhei.servlets.exception.IncorrectDataException;
import liucheuski.siarhei.servlets.exception.ServiceException;
import liucheuski.siarhei.servlets.model.Person;
import liucheuski.siarhei.servlets.service.PersonService;
import liucheuski.siarhei.servlets.util.page.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static liucheuski.siarhei.servlets.command.grouppersons.GroupConstant.*;

import java.util.List;

public class WelcomeCommand implements Command {
    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        PersonService personService = new PersonService();
        List<Person> clients = personService.findAll();
        if (!clients.isEmpty()) {
            request.setAttribute(LISTGROUP, clients);
        }
        return new CommandResult(Page.WELCOME_PAGE.getPage(), false);
    }
}
