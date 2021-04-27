package gr.codehub.inttrans.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(unique = true)
    private String email;

    private LocalDateTime dateOfBirth;
    private LocalDateTime registrationDate;

    @OneToMany(mappedBy="person")
    private List<AccountPerson> accountPersons;

}
