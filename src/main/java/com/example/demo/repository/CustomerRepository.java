package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.Customer;

public class CustomerRepository {
    public List<Customer> findAllcCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", "Doe", "jhonDoe@gmail.com"));
        customers.add(new Customer(2, "Jane", "Smith", "JaneSmith@gmail.com"));
        customers.add(new Customer(3, "Alice", "Johnson", "AliceJohonson@gmail.com"));
        customers.add(new Customer(4, "Bob", "Brown", "BobBrown@gmail.com"));
        customers.add(new Customer(5, "Charlie", "Davis", "CharlieDavies@gmail.com"));
        return customers;   
    }
}
