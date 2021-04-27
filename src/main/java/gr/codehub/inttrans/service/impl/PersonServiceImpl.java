package gr.codehub.inttrans.service.impl;


import gr.codehub.inttrans.dto.PersonDto;
import gr.codehub.inttrans.model.Person;
import gr.codehub.inttrans.repository.PersonRepository;
import gr.codehub.inttrans.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {


    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<PersonDto> getPersons() {
        List<Person> persons = personRepository.findAll();
        List<PersonDto> personDtos = persons
                .stream()
                .map(PersonDto::new)
                .collect(Collectors.toList());
        return personDtos;
    }

    @Override
    public PersonDto getPerson(int id) {
        return null;
    }

    @Override
    public PersonDto addPerson(PersonDto personDto) {
        Person person = personDto.getPerson();
        personRepository.save(person);
        PersonDto personDto1 = new PersonDto(person);
        return personDto1;
    }

    @Override
    public PersonDto updatePerson(int personId, PersonDto personDto) {
        return null;
    }

    @Override
    public boolean deletePerson(int personId) {
        return false;
    }
}
