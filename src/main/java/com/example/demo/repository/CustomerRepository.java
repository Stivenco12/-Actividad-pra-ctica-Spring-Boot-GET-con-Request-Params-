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
        customers.add(new Customer(6, "David", "Wilson", "DavidWilsom@gmail.com"));
        customers.add(new Customer(7, "Eve", "Garcia", "EveGarcua@gmail.com"));
        customers.add(new Customer(8, "Frank", "Martinez", "FrankMartinez@gmail.com"));
        customers.add(new Customer(9, "Grace", "Hernandez", "GraceHernandez@gmail.com"));
        customers.add(new Customer(10, "Hank", "Lopez", "HankLopez@gmail.com"));
        customers.add(new Customer(11, "Ivy", "Gonzalez", "IvyGonzales@gmail.com"));
        customers.add(new Customer(12, "Jack", "Perez", "JackPerez@gmail.com"));
        customers.add(new Customer(13, "Kathy", "Wilson", "KathyPerez@gmail.com"));
        customers.add(new Customer(14, "Leo", "Anderson", "LeoAnderson@gmail.com"));
        customers.add(new Customer(15, "Mia", "Thomas", "MiaThomas@gmail.com"));
        customers.add(new Customer(16, "Nina", "Taylor", "NinaTaylos@gmail.com"));
        customers.add(new Customer(17, "Oscar", "Moore", "OscarMoore@gmail.com"));
        customers.add(new Customer(18, "Paul", "Jackson", "PaulJackson@gmail.com"));
        customers.add(new Customer(19, "Quinn", "Martin", "Quinn@gmail.com"));
        customers.add(new Customer(20, "Rita", "Lee", "rita@gmail.com"));
        return customers;   
    }
}
