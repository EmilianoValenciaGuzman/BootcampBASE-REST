package com.bancobase.bootcamp.repositories;

import com.bancobase.bootcamp.schemas.AccountSchema;
import com.bancobase.bootcamp.schemas.CurrencySchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
// nos va a servir para traer datos
@Repository
public interface AccountRepository extends JpaRepository<AccountSchema, String> {
    List<AccountSchema> findByCustomerCustomerId(Long customerId);
}
