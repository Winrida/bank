package com.wibank.bank.repo;

import com.wibank.bank.models.Amount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AmountRepository extends CrudRepository<Amount, Long> {
    //@Query("from Amount order by money")
    //List<Amount> findByAmount();
}
