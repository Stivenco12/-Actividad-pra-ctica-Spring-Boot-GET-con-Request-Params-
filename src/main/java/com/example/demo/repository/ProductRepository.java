package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.example.demo.model.product;


@Repository
public class ProductRepository {
    public List<product> findAll() {
      List<product> products = new ArrayList<>();
      products.add(new product(1, "Laptop", "Electronics", 999.99, 10));
      products.add(new product(2, "Smartphone", "phones", 499.99, 20));
      products.add(new product(3, "Headphones", "phones", 199.99, 30));
      products.add(new product(4, "Smartwatch", "Electronics", 299.99, 15));
      products.add(new product(5, "Tablet", "phones", 399.99, 25));
      products.add(new product(6, "Monitor", "Electronics", 249.99, 12));
      products.add(new product(7, "Keyboard", "Electronics", 49.99, 50));
      products.add(new product(8, "Mouse", "Electronics", 29.99, 60));
      products.add(new product(9, "Printer", "Electronics", 149.99, 8));
      products.add(new product(10, "Router", "Electronics", 89.99, 40));
      products.add(new product(11, "Camera", "phones", 599.99, 5));
      products.add(new product(12, "Speaker", "Electronics", 129.99, 18));
      products.add(new product(13, "Projector", "Electronics", 399.99, 7));
      products.add(new product(14, "External Hard Drive", "Electronics", 89.99, 22));
      products.add(new product(15, "USB Flash Drive", "Electronics", 19.99, 100));
      products.add(new product(16, "Webcam", "Electronics", 79.99, 15));
      products.add(new product(17, "Microphone", "Electronics", 99.99, 20));
      products.add(new product(18, "Graphics Card", "Electronics", 499.99, 3));
      products.add(new product(19, "Motherboard", "Electronics", 199.99, 10));
      products.add(new product(20, "Power Supply", "Electronics", 79.99, 25));
      products.add(new product(21, "SSD", "Electronics", 129.99, 15));
      products.add(new product(22, "HDD", "Electronics", 69.99, 30));
      products.add(new product(23, "RAM", "Electronics", 89.99, 20));
      products.add(new product(24, "CPU", "Electronics", 299.99, 8));
      products.add(new product(25, "Cooling Fan", "Electronics", 39.99, 40));
      products.add(new product(26, "Laptop Stand", "Electronics", 29.99, 50));
      products.add(new product(27, "Mouse Pad", "Electronics", 9.99, 100));
      products.add(new product(28, "Laptop Bag", "Electronics", 49.99, 20));
      products.add(new product(29, "Phone Case", "phones", 19.99, 60));
      products.add(new product(30, "Screen Protector", "Electronics", 14.99, 80));
      return products;
    }
    
}

