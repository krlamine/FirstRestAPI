package com.example.firstrestapi.product.support;

import com.example.firstrestapi.product.api.request.ProductRequest;
import com.example.firstrestapi.product.api.response.ProductResponse;
import com.example.firstrestapi.product.domain.Product;

public class ProductMapper {

    public static Product mapToProduct(ProductRequest request) {
        return new Product(null, request.getName(), request.getPrice());
    }

    public static ProductResponse mapToResponse(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getPrice()
        );
    }
}