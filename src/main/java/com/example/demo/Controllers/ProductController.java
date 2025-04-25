package com.example.demo.Controllers;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.product;
import com.example.demo.repository.ProductRepository;

@Controller
@RequestMapping("/api")
public class ProductController {
    private final ProductRepository repo;
    public ProductController(ProductRepository repo) { this.repo = repo; }
    
    @RequestMapping("/products")
    public String getProducts(
        @RequestParam(required = false) Double minPrice,
        @RequestParam(required = false) Double maxPrice,
        @RequestParam(required = false) String category,
        Model model
    ) {
        List<product> listadoFiltrado = repo.findAll().stream()
            .filter(producto -> (minPrice == null || producto.getPrice() >= minPrice) &&
                                (maxPrice == null || producto.getPrice() <= maxPrice) &&
                                (category == null || producto.getCategory().equalsIgnoreCase(category)))
            .collect(Collectors.toList());

        model.addAttribute("productos", listadoFiltrado);
        DoubleSummaryStatistics stats = listadoFiltrado.stream()
            .collect(Collectors.summarizingDouble(product -> product.getPrice()));
        model.addAttribute("count", stats.getCount());
        model.addAttribute("avgPrice", stats.getAverage());
        model.addAttribute("minPrice", stats.getMin());
        model.addAttribute("maxPrice", stats.getMax());
        model.addAttribute("totalValue", stats.getSum());

        return "product";  
    }

}
