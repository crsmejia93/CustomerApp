package com.example.customerapp;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
//    Iterable<Customer> findById(Long id);
    ArrayList<Customer> findByLastName(String name);
}
