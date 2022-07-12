package liucheuski.siarhei.servlets.service;

import liucheuski.siarhei.servlets.exception.RepositoryException;
import liucheuski.siarhei.servlets.exception.ServiceException;
import liucheuski.siarhei.servlets.model.Person;
import liucheuski.siarhei.servlets.repository.specification.PersonRepository;
import liucheuski.siarhei.servlets.repository.specification.RepositoryCreator;

import java.util.List;

public class PersonService {
    public List<Person> findAll() throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            PersonRepository personRepository = repositoryCreator.getPersonRepository();
            return personRepository.findAll();
        } catch (RepositoryException e) {
            throw new ServiceException(e.getMessage(), e);
        }
    }

    public void save(Person person) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            PersonRepository personRepository = repositoryCreator.getPersonRepository();
            personRepository.save(person);
        } catch (RepositoryException exception) {
            throw new ServiceException(exception.getMessage(), exception);
        }
    }
}
