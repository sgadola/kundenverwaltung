package com.bharath.location.service;

import com.bharath.location.entities.Address;
import com.bharath.location.entities.Contact;
import com.bharath.location.entities.Costumer;

import java.util.List;

public interface LocationService {
    Costumer saveLocation(Costumer costumer);
    Costumer updateLocation(Costumer costumer);
    void deleteLocation(Costumer costumer);
    Costumer getLocationById(long id);
    List<Costumer> getAllLocations();


    Address saveAddress(Address address);
    Address updateAddress(Address address);
    void deleteAddress(Address address);
    Address getAddressById(long id);
    List<Address> getAllAddress();

    Contact saveContact(Contact contact);
    Contact updateContact(Contact contact);
    void deleteContact(Contact contact);
    Contact getContactById(long id);
    List<Contact> getAllContact();
}
