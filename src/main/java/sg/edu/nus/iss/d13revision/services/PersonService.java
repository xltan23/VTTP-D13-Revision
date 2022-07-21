package sg.edu.nus.iss.d13revision.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.d13revision.models.Person;

@Service
public class PersonService {
    private List<Person> personList = new ArrayList<Person>();

    public PersonService() {
        personList.add(new Person("Cristiano", "Ronaldo"));
        personList.add(new Person("Lionel", "Messi"));
    }

    public List<Person> getPersons() {
        return this.personList;
    }

    public void addPerson(Person p) {
        personList.add(new Person(p.getFirstName(),p.getLastName()));
    }
}
