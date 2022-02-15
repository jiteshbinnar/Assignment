package BusinessDemo;


import java.util.ArrayList;
import java.util.List;

public class BusinessMan {
    private PersonService personService;

    public BusinessMan(PersonService personService) {
        this.personService = personService;
    }
    public List<Person> findAllPerson(Person person){
        List<Person> people=new ArrayList<>();
        people.add(person);
        return people;

    }
}