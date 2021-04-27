package gr.codehub.inttrans.repository;

import gr.codehub.inttrans.model.AccountPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountPersonRepository
        extends JpaRepository<AccountPerson,Integer> {
}
