package ru.geekbrains.repository;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.geekbrains.dto.Product;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>();
        productList.add(new Product(1, "молоко", 15));
        productList.add(new Product(2, "кофе",50));
        productList.add(new Product(3, "сахар",5));
    }

    public List<Product> getAll() {
        return null;
    }

    public void save (Product product){
        productList.add(product);
    }

    public Product findById(int id) {
        return productList.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
