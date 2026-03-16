package edu.jfs.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jfs.app.entity.Product;
import edu.jfs.app.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProduct(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name).orElse(null);
    }

    public Product getProductByCost(double cost) {
        return repository.findByCost(cost).orElse(null);
    }

    public Product addData(Product product) {
        return repository.save(product);
    }
}