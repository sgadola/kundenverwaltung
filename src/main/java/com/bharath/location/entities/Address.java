package com.bharath.location.entities;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaddress")
    private long idaddress;
    private String street;
    private String number;
    private String city;
    private int plz;
    private long fk_customer;


    public long getIdaddress() {
        return idaddress;
    }

    public void setIdaddress(long idaddress) {
        this.idaddress = idaddress;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public long getFk_customer() {
        return fk_customer;
    }

    public void setFk_customer(long fkcustomer) {
        this.fk_customer = fkcustomer;
    }

    @Override
    public String toString() {
        return "Address{" +
                "idaddress=" + idaddress +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", plz=" + plz +
                ", fk_customer=" + fk_customer +
                '}';
    }
}