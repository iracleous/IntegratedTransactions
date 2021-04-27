package gr.codehub.inttrans.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDto {

    private int id;
    private LocalDateTime registrationDate;


}
