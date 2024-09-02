package com.devteria.identityservice.controller;

import com.devteria.identityservice.dto.request.ApiResponse;
import com.devteria.identityservice.dto.response.ProductResponse;
import com.devteria.identityservice.entity.Product;
import com.devteria.identityservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public ApiResponse<List<ProductResponse>> getProducts() {
        return  ApiResponse.<List<ProductResponse>>builder()
                .result(productService.getAllProducts())
                .build();
    }

    @GetMapping("/{productId}")
    public ApiResponse<ProductResponse> getProduct(@PathVariable("productId") Long productId) {
        return  ApiResponse.<ProductResponse>builder()
                .result(productService.getProductById(productId))
                .build();
    }

    @PostMapping("/{productId}")
    public ApiResponse<ProductResponse> editProduct(@PathVariable("productId") Long productId, Product product) {
        return  ApiResponse.<ProductResponse>builder()
                .result(productService.updateProduct(product))
                .build();
    }

    @PostMapping("/{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId) {
        productService.deleteProduct(productId);
    }

    @PostMapping("/{productId}")
    public ApiResponse<ProductResponse> createProduct(@PathVariable("productId") Long productId) {
        return  ApiResponse.<ProductResponse>builder()
                .result(productService.getProductById(productId))
                .build();
    }

    @GetMapping("/tag/{tagId}/products")
    public ApiResponse<ProductResponse> getProductsByTagId( @PathVariable Long tagId) {
        return  ApiResponse.<ProductResponse>builder()
                .result(productService.getProductById(1L))
                .build();
    }

    @GetMapping("/category/{categoryId}/products")
    public ApiResponse<ProductResponse> getProductsByTagName(@PathVariable Long categoryId) {
        return  ApiResponse.<ProductResponse>builder()
                .result(productService.getProductById(1L))
                .build();
    }

}
