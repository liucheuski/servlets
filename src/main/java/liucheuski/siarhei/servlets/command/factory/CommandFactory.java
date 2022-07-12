package liucheuski.siarhei.servlets.command.factory;

import liucheuski.siarhei.servlets.command.Command;
import liucheuski.siarhei.servlets.command.LoginPageCommand;
import liucheuski.siarhei.servlets.command.RegisterPageCommand;
import liucheuski.siarhei.servlets.command.authorithation.LoginCommand;
import liucheuski.siarhei.servlets.command.authorithation.RegisterNewUserCommand;
import liucheuski.siarhei.servlets.command.authorithation.SignOutCommand;
import liucheuski.siarhei.servlets.command.grouppersons.AddNewPersonCommand;
import liucheuski.siarhei.servlets.command.grouppersons.WelcomeCommand;

public class CommandFactory {
    public static Command create(String command) {
        command = command.toUpperCase();
        System.out.println(command);
        CommandType commandEnum = CommandType.valueOf(command);
        Command resultCommand;
        switch (commandEnum) {
            case LOGIN: {
                resultCommand = new LoginCommand();
                break;
            }
            case REGISTER_NEW_USER: {
                resultCommand = new RegisterNewUserCommand();
                break;
            }
            case SIGN_OUT: {
                resultCommand = new SignOutCommand();
                break;
            }
            case ADD_NEW_PERSON: {
                resultCommand = new
                        AddNewPersonCommand();
                break;
            }
            case LOGIN_PAGE: {
                resultCommand = new LoginPageCommand();
                break;
            }
            case WELCOME: {
                resultCommand = new WelcomeCommand();
                break;
            }
            case REGISTRATION_PAGE: {
                resultCommand = new RegisterPageCommand();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid command" + commandEnum);
            }
        }
        return resultCommand;
    }
}
