package com.bharath.location.repos;

import com.bharath.location.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface AdressRepository extends JpaRepository<Address, Long> {
}
