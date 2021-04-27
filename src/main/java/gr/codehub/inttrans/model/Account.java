package gr.codehub.inttrans.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date registrationDate;

    @OneToMany(mappedBy = "account")
    private List<AccountPerson> accountPersons;

}
