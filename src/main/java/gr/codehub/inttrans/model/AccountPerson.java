package gr.codehub.inttrans.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class AccountPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime registrationDate;

    @ManyToOne
    private Person person;
    @ManyToOne
    private Account account;

}
