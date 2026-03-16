package edu.jfs.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.jfs.app.entity.Product;
import edu.jfs.app.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    // Get all products
    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // Get product by ID
    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    // Get product by name
    @GetMapping("/getProductByName/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // Get product by cost
    @GetMapping("/getProductByCost/{cost}")
    public Product getProductByCost(@PathVariable double cost) {
        return service.getProductByCost(cost);
    }

    // Add product
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.addData(product);
    }
}	