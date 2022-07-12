package liucheuski.siarhei.servlets.command.grouppersons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import liucheuski.siarhei.servlets.command.Command;
import liucheuski.siarhei.servlets.command.CommandResult;
import liucheuski.siarhei.servlets.exception.IncorrectDataException;
import liucheuski.siarhei.servlets.exception.ServiceException;
import liucheuski.siarhei.servlets.model.Person;
import liucheuski.siarhei.servlets.service.PersonService;
import liucheuski.siarhei.servlets.util.page.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static liucheuski.siarhei.servlets.command.grouppersons.GroupConstant.*;

import java.util.List;
import java.util.Optional;

import static java.util.Optional.of;
import static org.apache.commons.lang3.StringUtils.isEmpty;

public class AddNewPersonCommand implements Command {
    private static final Logger logger = LogManager.getLogger(AddNewPersonCommand.class.getName());

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        PersonService personService = new PersonService();
        Optional<String> newName = of(request).map(httpServletRequest -> httpServletRequest.getParameter(NEWNAME));
        Optional<String> newPhone = of(request).map(httpServletRequest -> httpServletRequest.getParameter(NEWPHONE));
        Optional<String> newEmail = of(request).map(httpServletRequest -> httpServletRequest.getParameter(NEWEMAIL));
        if (isEmpty(newName.get()) || isEmpty(newPhone.get()) || isEmpty(newEmail.get())) {
            logger.info("missing parameter for new person in addition mode");
            request.setAttribute(ERROR_MESSAGE, ERROR_MESSAGE_TEXT);
        } else {
            Person newperson = new Person(newName.get(), newPhone.get(), newEmail.get());
            personService.save(newperson);
        }
        List<Person> clients = personService.findAll();
        if (!clients.isEmpty()) {
            request.setAttribute(LISTGROUP, clients);
        }
        return new CommandResult(Page.WELCOME_PAGE.getPage(), false);
    }
}
