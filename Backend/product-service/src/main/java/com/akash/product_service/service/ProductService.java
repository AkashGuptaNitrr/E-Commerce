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
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setPrice(product.getPrice());
        Product saved = productRepo.save(mapToResponse(productResponse));
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
