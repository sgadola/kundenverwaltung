package com.bharath.location.service;

import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Customer;
import com.bharath.location.repos.AdressRepository;
import com.bharath.location.repos.ContactRepository;
import com.bharath.location.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    // Customer
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AdressRepository repositoryAddress;

    @Autowired
    private ContactRepository repositoryContact;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //Address
    @Override
    public Address saveAddress(Address address) {
        return repositoryAddress.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        return repositoryAddress.save(address);
    }

    @Override
    public void deleteAddress(Address address) {
        repositoryAddress.delete(address);
    }

    @Override
    public Address getAddressById(long id) {
        return repositoryAddress.getOne(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return repositoryAddress.findAll();
    }

    @Override
    public Address getAddressByFk(long fk) {
        List<Address> addresses = repositoryAddress.findAll();
        for (Address address : addresses) {
            if (address.getFk_customer() == fk) {
                return address;
            }
        }
        return null;
    }

    //Contact
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

    @Override
    public Contact getContactByFk(long fk) {
        List<Contact> contacts = repositoryContact.findAll();
        for (Contact contact : contacts) {
            if (contact.getFk_customer() == fk) {
                return contact;
            }
        }
        return null;
    }
}