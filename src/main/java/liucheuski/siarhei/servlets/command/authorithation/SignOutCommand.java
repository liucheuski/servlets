package liucheuski.siarhei.servlets.command.authorithation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import liucheuski.siarhei.servlets.command.Command;
import liucheuski.siarhei.servlets.command.CommandResult;
import liucheuski.siarhei.servlets.command.session.SessionAttribute;
import liucheuski.siarhei.servlets.exception.IncorrectDataException;
import liucheuski.siarhei.servlets.exception.ServiceException;
import liucheuski.siarhei.servlets.util.page.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignOutCommand implements Command {
    private static final Logger logger = LogManager.getLogger(SignOutCommand.class.getName());

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException, IncorrectDataException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute(SessionAttribute.NAME);
        logger.info("user was above: name:" + username);
        session.removeAttribute(SessionAttribute.NAME);
        return new CommandResult(Page.LOGIN_PAGE.getPage(), false);
    }
}
