package com.kuerschner.kundendatenbank.service;

import com.kuerschner.kundendatenbank.entities.User;
import com.kuerschner.kundendatenbank.repos.KundenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundenServiceImpl implements KundenService{

    @Autowired
    private KundenRepository repository;

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(user);
    }

    @Override
    public User getUserById(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public KundenRepository getRepository(){
        return repository;
    }

    public void setRepository(KundenRepository repository){
        this.repository = repository;
    }

}
