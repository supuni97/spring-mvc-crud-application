package com.example.springmvc.boot;

import com.example.springmvc.model.Product;
import com.example.springmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Product product1 = new Product();
        product1.setName("Milky bar");
        product1.setDescription("Milky bar with choco and hazelnut");
        product1.setPrice(1.99);
        product1.setCategory("BARS");
        product1.setType("candies");

        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("Almond bar");
        product2.setDescription("Almond bar with choco and honey");
        product2.setPrice(2.99);
        product2.setCategory("BARS");
        product2.setType("candies");

        productRepository.save(product2);
    }
}
