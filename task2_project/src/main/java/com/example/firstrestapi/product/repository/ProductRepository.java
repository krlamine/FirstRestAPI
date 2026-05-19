package com.example.firstrestapi.product.repository;

import com.example.firstrestapi.product.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private final List<Product> products = new ArrayList<>();
    private Long idCounter = 1L;

    public Product save(Product product) {
        if (product.getId() == null) {
            product.setId(idCounter++);
            products.add(product);
        } else {
            deleteById(product.getId());
            products.add(product);
        }
        return product;
    }

    public List<Product> findAll() {
        return products;
    }

    public java.util.Optional<Product> findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}