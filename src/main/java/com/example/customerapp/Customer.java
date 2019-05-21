package com.example.customerapp;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @Column(name = "CustomerId")
    private long id;
    @Column(name = "Title")
    private String title;
    @Column(name = "Firstname")
    private String firstName;
    @Column(name = "Lastname")
    private String lastName;
    @Column(name = "Streetaddress")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Emailaddress")
    private String email;
    @Column(name = "Position")
    private String position;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
