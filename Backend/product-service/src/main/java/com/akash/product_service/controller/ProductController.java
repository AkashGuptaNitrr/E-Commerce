package com.akash.product_service.controller;

import com.akash.product_service.entity.Product;
import com.akash.product_service.entity.dto.ProductResponse;
import com.akash.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping()
    public ResponseEntity<ProductResponse> addProduct(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product));
    }
}
