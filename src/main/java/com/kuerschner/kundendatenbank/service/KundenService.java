package com.kuerschner.kundendatenbank.service;

import com.kuerschner.kundendatenbank.entities.User;
import java.util.List;


public interface KundenService {
    User saveUser(User use);
    User updateUser(User user);
    void deleteUser(User user);
    User getUserById(int id);
    List<User> getAllUsers();

}
