package com.kuerschner.kundendatenbank.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private int iduser;
    private String username;
    private String firsname;
    private String lastname;
    private String email;
    private int fkort;
    private int fkadress;
    private int fkcustomer;
    private String password;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFkort() {
        return fkort;
    }

    public void setFkort(int fkort) {
        this.fkort = fkort;
    }

    public int getFkadress() {
        return fkadress;
    }

    public void setFkadress(int fkadress) {
        this.fkadress = fkadress;
    }

    public int getFkcustomer() {
        return fkcustomer;
    }

    public void setFkcustomer(int fkcustomer) {
        this.fkcustomer = fkcustomer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "iduser=" + iduser +
                ", username='" + username + '\'' +
                ", firsname='" + firsname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", fkort=" + fkort +
                ", fkadress=" + fkadress +
                ", fkcustomer=" + fkcustomer +
                ", password='" + password + '\'' +
                '}';
    }
}
