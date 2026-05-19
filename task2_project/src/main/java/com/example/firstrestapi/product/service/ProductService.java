package com.example.firstrestapi.product.service;

import com.example.firstrestapi.product.api.request.ProductRequest;
import com.example.firstrestapi.product.api.response.ProductResponse;
import com.example.firstrestapi.product.domain.Product;
import com.example.firstrestapi.product.repository.ProductRepository;
import com.example.firstrestapi.product.support.ProductMapper;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository = new ProductRepository();

    public ProductResponse create(ProductRequest request) {
        Product product = ProductMapper.mapToProduct(request);
        return ProductMapper.mapToResponse(repository.save(product));
    }

    public List<ProductResponse> getAllProducts() {
        return repository.findAll().stream()
                .map(ProductMapper::mapToResponse)
                .toList();
    }

    public ProductResponse getById(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        return ProductMapper.mapToResponse(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public ProductResponse update(Long id, ProductRequest request) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(request.getName());
        product.setPrice(request.getPrice());

        return ProductMapper.mapToResponse(repository.save(product));
    }
}