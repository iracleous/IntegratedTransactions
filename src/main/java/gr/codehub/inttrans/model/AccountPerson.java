package gr.codehub.inttrans.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class AccountPerson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date registrationDate;

    @ManyToOne
    private Person person;
    @ManyToOne
    private Account account;

}
