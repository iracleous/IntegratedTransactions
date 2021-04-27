package gr.codehub.inttrans.repository;

import gr.codehub.inttrans.model.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionRepository
        extends JpaRepository<AccountTransaction, Long> {
}
