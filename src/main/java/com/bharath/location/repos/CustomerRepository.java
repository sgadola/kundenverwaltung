package com.bharath.location.repos;

import com.bharath.location.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//CRUD Funktionen
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
