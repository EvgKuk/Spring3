package ru.geekbrains.service;

import ru.geekbrains.dto.Product;
import ru.geekbrains.repository.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public void save(Product product){
        productRepository.save(product);
    }

    public Product findById(int id){
        return productRepository.findById(id);
    }
}
