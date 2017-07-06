package com.realdolmen;

/**
 * Created by vdabcursist on 06/07/2017.
 */
public class PersonService {

    PersonRepository personRepository;

    public void savePerson(Person person) {
        personRepository.save(person);

    }

    public Person findById(Integer id) {
        return personRepository.find(id);
    }

    public void remove(Integer id) {
        Person p = personRepository.find(id);
        personRepository.remove(p);
    }
}
