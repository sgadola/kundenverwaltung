package com.bharath.location.repos;

import com.bharath.location.entities.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUD Funktionen

public interface CustomerRepository extends JpaRepository<Costumer, Long> {
}
