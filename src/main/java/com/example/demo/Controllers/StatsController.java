package com.example.demo.Controllers;

import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.StatsRepositorys;

@Controller
public class StatsController {
    private final ProductRepository repo;
    private final StatsRepositorys statsRepo;

    public StatsController(ProductRepository repo, StatsRepositorys statsRepo) {
        this.repo = repo;
        this.statsRepo = statsRepo;
    }

    @GetMapping("/products/stats")
    public Map<String, Double> getStats(@RequestParam(required = false) String category) {

        DoubleSummaryStatistics stats = repo.findAll().stream()
            .filter(product -> category == null || product.getCategory().equalsIgnoreCase(category))
            .collect(Collectors.summarizingDouble(product::getPrice));

 
        return Map.of(
            "count", (double) stats.getCount(),
            "avgPrice", stats.getAverage(),
            "minPrice", stats.getMin(),
            "maxPrice", stats.getMax(),
            "totalValue", stats.getSum()
        );
    }
}
