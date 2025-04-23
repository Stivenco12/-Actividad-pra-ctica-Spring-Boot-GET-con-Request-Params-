package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Product;

@Repository
public class ProductRepository {
    public List<Product> findAll() {
      List<Product> products = new ArrayList<>();
      products.add(new Product(1, "Laptop", "Electronics", 999.99, 10));
      products.add(new Product(2, "Smartphone", "Electronics", 499.99, 20));
      products.add(new Product(3, "Headphones", "Electronics", 199.99, 30));
      products.add(new Product(4, "Smartwatch", "Electronics", 299.99, 15));
      products.add(new Product(5, "Tablet", "phones", 399.99, 25));
      products.add(new Product(6, "Monitor", "Electronics", 249.99, 12));
      products.add(new Product(7, "Keyboard", "Electronics", 49.99, 50));
      products.add(new Product(8, "Mouse", "Electronics", 29.99, 60));
      products.add(new Product(9, "Printer", "Electronics", 149.99, 8));
      products.add(new Product(10, "Router", "Electronics", 89.99, 40));
      products.add(new Product(11, "Camera", "Electronics", 599.99, 5));
      products.add(new Product(12, "Speaker", "Electronics", 129.99, 18));
      products.add(new Product(13, "Projector", "Electronics", 399.99, 7));
      products.add(new Product(14, "External Hard Drive", "Electronics", 89.99, 22));
      products.add(new Product(15, "USB Flash Drive", "Electronics", 19.99, 100));
      products.add(new Product(16, "Webcam", "Electronics", 79.99, 15));
      products.add(new Product(17, "Microphone", "Electronics", 99.99, 20));
      products.add(new Product(18, "Graphics Card", "Electronics", 499.99, 3));
      products.add(new Product(19, "Motherboard", "Electronics", 199.99, 10));
      products.add(new Product(20, "Power Supply", "Electronics", 79.99, 25));
      products.add(new Product(21, "SSD", "Electronics", 129.99, 15));
      products.add(new Product(22, "HDD", "Electronics", 69.99, 30));
      products.add(new Product(23, "RAM", "Electronics", 89.99, 20));
      products.add(new Product(24, "CPU", "Electronics", 299.99, 8));
      products.add(new Product(25, "Cooling Fan", "Electronics", 39.99, 40));
      products.add(new Product(26, "Laptop Stand", "Electronics", 29.99, 50));
      products.add(new Product(27, "Mouse Pad", "Electronics", 9.99, 100));
      products.add(new Product(28, "Laptop Bag", "Electronics", 49.99, 20));
      products.add(new Product(29, "Phone Case", "Electronics", 19.99, 60));
      products.add(new Product(30, "Screen Protector", "Electronics", 14.99, 80));
      return products;
    }
}