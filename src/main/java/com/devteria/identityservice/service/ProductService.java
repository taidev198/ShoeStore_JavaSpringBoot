package com.devteria.identityservice.service;

import com.devteria.identityservice.dto.response.ProductResponse;
import com.devteria.identityservice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product createProduct(Product product);

    ProductResponse getProductById(Long productId);

    List<Product> getProductsByCategoryName(String categoryName);

    List<Product> getProductsByTagName(String tagName);

    List<ProductResponse> getAllProducts();

    ProductResponse updateProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> searchProducts(String searchTerm); // search
}
