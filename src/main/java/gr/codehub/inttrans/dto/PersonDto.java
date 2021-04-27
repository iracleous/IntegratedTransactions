package gr.codehub.inttrans.dto;

import gr.codehub.inttrans.model.AccountPerson;
import gr.codehub.inttrans.model.Person;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonDto {

    private int id;
    private String name;
    private String email;
    private LocalDateTime dateOfBirth;
    private LocalDateTime registrationDate;


    public Person getPerson(){
        Person person = new Person();
        person.setName(name);
        person.setEmail(email);
        person.setDateOfBirth(dateOfBirth);
        person.setRegistrationDate(registrationDate);
        return person;
    }

    public PersonDto(Person person){
        id= person.getId();
        name= person.getName();
        email= person.getEmail();
        dateOfBirth=person.getDateOfBirth();
        registrationDate = person.getRegistrationDate();
    }

}


