package com.bharath.location.service;

import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Costumer;
import com.bharath.location.repos.AdressRepository;
import com.bharath.location.repos.ContactRepository;
import com.bharath.location.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AdressRepository repositoryAdress;

    @Autowired
    private ContactRepository repositoryContact;

    @Override
    public Costumer saveLocation(Costumer costumer) {
        return customerRepository.save(costumer);
    }

    @Override
    public Costumer updateLocation(Costumer costumer) {
        return customerRepository.save(costumer);
    }

    @Override
    public void deleteLocation(Costumer costumer) {
        customerRepository.delete(costumer);
    }

    @Override
    public Costumer getLocationById(long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Costumer> getAllLocations() {
        return customerRepository.findAll();
    }

    public CustomerRepository getCustomerRepository(){
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public Address saveAddress(Address address) {
        return repositoryAdress.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return repositoryAdress.save(address);
    }

    @Override
    public void deleteAddress(Address address) {
        repositoryAdress.delete(address);
    }

    @Override
    public Address getAddressById(long id) {
        return repositoryAdress.getOne(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return repositoryAdress.findAll();
    }

    @Override
    public Contact saveContact(Contact contact) {
        return repositoryContact.save(contact);
    }

    @Override
    public Contact updateContact(Contact contact) {
        return repositoryContact.save(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        repositoryContact.delete(contact);
    }

    @Override
    public Contact getContactById(long id) {
        return repositoryContact.getOne(id);
    }

    @Override
    public List<Contact> getAllContact() {
        return repositoryContact.findAll();
    }
}
