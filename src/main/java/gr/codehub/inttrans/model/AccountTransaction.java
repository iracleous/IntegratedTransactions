package gr.codehub.inttrans.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
public class AccountTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date timestamp;
    private double amount;

    @ManyToOne
    private Account account;
 }
