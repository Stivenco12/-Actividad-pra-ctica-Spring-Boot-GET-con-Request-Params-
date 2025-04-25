package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.product;
import com.example.demo.model.stats;

@Repository
public class StatsRepositorys {
    private final ProductRepository repo;
    public StatsRepositorys(ProductRepository repo) { this.repo = repo; }
    public List<stats> FillStats() {
        List<product> products = repo.findAll();
        for (product p : products) {
            double count = products.stream().mapToDouble(product::getStock).count();
            double minPrice = products.stream().mapToDouble(product::getPrice).min().orElse(0.0);
            double maxPrice = products.stream().mapToDouble(product::getPrice).max().orElse(0.0);
            double avgPrice = products.stream().mapToDouble(product::getPrice).average().orElse(0.0);
            double sumPrice = products.stream().mapToDouble(product::getPrice).sum();

            List<stats> stats = new ArrayList<>();
        
            stats.add(new stats(products.size(), avgPrice, minPrice, maxPrice, sumPrice));
        }

        List<stats> stats = new ArrayList<>();
              


        return stats;
    }
}
