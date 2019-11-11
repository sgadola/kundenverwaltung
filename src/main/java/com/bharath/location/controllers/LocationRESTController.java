package com.bharath.location.controllers;

import com.bharath.location.entities.Costumer;
import com.bharath.location.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Costumer> getLocation(){
       return customerRepository.findAll();
    }

    @PostMapping
    public Costumer createLocation(@RequestBody Costumer costumer){
        return customerRepository.save(costumer);
    }

    @PutMapping
    public Costumer updateLocation(@RequestBody Costumer costumer){
        return customerRepository.save(costumer);
    }

    @DeleteMapping
    public void deleteLocation(@RequestBody Costumer costumer){
        customerRepository.delete(costumer);
    }

    @GetMapping("/{id}")
    public Optional<Costumer> getLocation(@PathVariable("id") long id){
        return customerRepository.findById(id);
    }
}
