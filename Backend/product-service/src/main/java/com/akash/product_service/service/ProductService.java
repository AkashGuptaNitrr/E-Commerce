package com.akash.product_service.service;

import com.akash.product_service.entity.Product;
import com.akash.product_service.entity.dto.ProductResponse;
import com.akash.product_service.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ProblemDetail;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public ProductResponse addProduct(Product product) {
        ProductResponse productResponse = new ProductResponse();
        Product saved = productRepo.save(product);
        productResponse.setId(saved.getId());
        productResponse.setName(saved.getName());
        productResponse.setPrice(saved.getPrice());
        return productResponse;
    }

    private Product mapToResponse(ProductResponse productResponse) {
        Product product = new Product();
        product.setId(productResponse.getId());
        product.setName(productResponse.getName());
        product.setPrice(productResponse.getPrice());
        return product;
    }
}
