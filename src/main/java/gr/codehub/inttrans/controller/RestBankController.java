package gr.codehub.inttrans.controller;


import gr.codehub.inttrans.customexception.PersonCreationException;
import gr.codehub.inttrans.dto.PersonDto;
import gr.codehub.inttrans.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestBankController {


    private PersonService personService;

    public RestBankController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping("insertPerson")
    public PersonDto addPerson(@RequestBody PersonDto personDto)
            throws PersonCreationException {
        return personService.addPerson(personDto) ;
    }

    @GetMapping("getPerson")
    public List<PersonDto> getPersons(){
        return personService.getPersons();
    }




}
