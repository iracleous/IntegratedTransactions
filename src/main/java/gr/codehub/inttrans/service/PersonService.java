package gr.codehub.inttrans.service;

import gr.codehub.inttrans.dto.PersonDto;

import java.util.List;

public interface PersonService {


    List<PersonDto> getPersons();
    PersonDto getPerson(int id);

    PersonDto addPerson(PersonDto personDto);

    PersonDto updatePerson(int personId, PersonDto personDto);

    boolean deletePerson(int personId);

}
