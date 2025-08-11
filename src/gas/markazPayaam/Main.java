package gas.markazPayaam;

import gas.markazPayaam.entity.Person7se1;
import gas.markazPayaam.service.PersonService;

import java.util.List;

/*
SQL> create table person7se1 (id number, name varchar2(20), family varchar2(20),salary number);

 */

public class Main {
    public static void main(String[] args) throws Exception {
        Person7se1 person1 = new Person7se1()
                                     .setId(15)
                                     .setName("Ghaasem")
                                     .setFamily("Joshi")
                                     .setSalary(5000);
        Person7se1 person2 = new Person7se1()
                .setId(12)
                .setName("Majid")
                .setFamily("Daaraabi")
                .setSalary(10000);

       PersonService.getInstance().save(person1);
        PersonService.getInstance().save(person2);
        PersonService.getInstance().change(person1);
       PersonService.getInstance().remove(person1);



        List<Person7se1> personList = PersonService.getInstance().findAll();
        for (Person7se1 person : personList) {
            System.out.println(person.getId());
            System.out.println(person.getName());
            System.out.println(person.getFamily());
        }

    }
}