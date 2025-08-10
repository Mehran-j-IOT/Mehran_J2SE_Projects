package gas.markazPayaam.service;

import java.util.List;
import gas.markazPayaam.entity.Person7se1;
import gas.markazPayaam.repository.PersonDA;

public class PersonService {

    private PersonService(){}
    private static final PersonService PERSON_SERVICE = new PersonService();

    public static PersonService getInstance() {
        return PERSON_SERVICE;
    }
    public void save(Person7se1 person)throws Exception
    {
        try(PersonDA personDA  = new PersonDA()) {
            personDA.insert(person);
            personDA.commit();
        }

    }
    public void change(Person7se1 person)throws Exception
    {
        try(PersonDA personDA  = new PersonDA()) {
            personDA.update(person);
            personDA.commit();
        }
    }
    public void remove(Person7se1 person)throws Exception
    {
        try(PersonDA personDA  = new PersonDA()) {
            personDA.delete(person);
            personDA.commit();
        }
    }

    public List<Person7se1> findAll()throws Exception
    {
        try(PersonDA personDA = new PersonDA()){
            return personDA.selectAll();
        }
    }
}