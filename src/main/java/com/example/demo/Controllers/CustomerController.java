package com.example.demo.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.repository.CustomerRepository ;
import com.example.demo.model.Customer;

@Controller
@RequestMapping("/api")
public class CustomerController {
    private final CustomerRepository repo;
    public CustomerController(CustomerRepository repo) { this.repo = repo; }
    @RequestMapping("/user")
        public String getuser(
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName,
        @RequestParam(required = false) String email,
        Model model
    ) {

    List<Customer> filteredUsers = repo.findAllcCustomers().stream()
        .filter(customer -> (firstName == null || customer.getFirstName().equalsIgnoreCase(firstName)) &&
                (lastName == null || customer.getLastName().equalsIgnoreCase(lastName)) &&
                (email == null || customer.getEmail().equalsIgnoreCase(email)))
        .collect(Collectors.toList());

    if (!filteredUsers.isEmpty()) {
        model.addAttribute("user", "logiado correctamente"); 
    } else {
        model.addAttribute("error", "credenciales incorrectas");
    }  
        return "userDetails"; 
    }
}