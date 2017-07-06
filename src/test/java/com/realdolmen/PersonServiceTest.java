package com.realdolmen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.matches;
import static org.mockito.Mockito.*;

/**
 * Created by vdabcursist on 06/07/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {


    @Mock
    private PersonRepository personRepository;

    @Captor
    private ArgumentCaptor<Person> captor;


    @InjectMocks
    PersonService personService = new PersonService();


    Person p = new Person("Tjen", "Dekker", null, null);

    @Test
    public void personCanBeSaved() {
        personService.savePerson(p);
        verify(personRepository, times(1)).save(captor.capture());
        assertEquals("Tjen", captor.getValue().getFirstName());
        assertEquals("Dekker", captor.getValue().getLastName());

    }

    @Test
    public void personCanBeFound() {
        when(personRepository.find(anyInt())).thenReturn(anyObject());
        personService.findById(25);
        verify(personRepository).find(anyInt());
    }

    @Test
    public void personCanBeRemoved() {
        when(personRepository.find(anyInt())).thenReturn(p);
        personService.remove(25);
        verify(personRepository).find(anyInt());
        verify(personRepository).remove(captor.capture());
        assertEquals("Tjen", captor.getValue().getFirstName());
        assertEquals("Dekker", captor.getValue().getLastName());
    }


}
