package br.com.erudio.rest_with_spring_boot_and_java_erudio;

import br.com.erudio.rest_with_spring_boot_and_java_erudio.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public List<Person> findAll() {
        logger.info("Finding all people!");
        List<Person> people = new ArrayList<Person>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);

            people.add(person);
        }

        return people;
    }

    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Murilo");
        person.setLastName("Miorim");
        person.setAddress("Sapucaia do Sul - RS, Brazil");
        person.setGender("Male");

        return person;
    }

    public Person create(Person person) {
        logger.info("Creating a person!");

        return person;
    }

    public Person update(Person person) {
        logger.info("Updating a person!");

        return person;
    }

    public void delete(String id) {
        logger.info("Deleting a person!");
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FirstName " + i);
        person.setLastName("LastName " + i);
        person.setAddress("Address " + i);
        person.setGender("Male");

        return person;
    }
}
