package com.kuerschner.kundendatenbank.repos;

import com.kuerschner.kundendatenbank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundenRepository extends JpaRepository<User, Integer> {

}
