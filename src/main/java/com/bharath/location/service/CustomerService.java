package com.bharath.location.service;

import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    Customer getCustomerById(long id);
    List<Customer> getAllCustomers();


    Address saveAddress(Address address);
    Address updateAddress(Address address);
    void deleteAddress(Address address);
    Address getAddressById(long id);
    Address getAddressByFk(long fk);
    List<Address> getAllAddress();


    Contact saveContact(Contact contact);
    Contact updateContact(Contact contact);
    void deleteContact(Contact contact);
    Contact getContactById(long id);
    Contact getContactByFk(long fk);
    List<Contact> getAllContact();
}
