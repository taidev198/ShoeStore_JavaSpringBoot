package com.devteria.identityservice.service.impl;

import com.devteria.identityservice.dto.request.ApiResponse;
import com.devteria.identityservice.dto.response.ProductResponse;
import com.devteria.identityservice.entity.Product;
import com.devteria.identityservice.exception.AppException;
import com.devteria.identityservice.exception.ErrorCode;
import com.devteria.identityservice.mapper.ProductMapper;
import com.devteria.identityservice.repository.ProductRepository;
import com.devteria.identityservice.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    ProductMapper productMapper;


    @Override
    public Product createProduct(Product product) {



        return null;
    }

    @Override
    public ProductResponse getProductById(Long productId) {
        return productMapper.toProductResponse(productRepository
                .findById(productId).orElseThrow(()  -> new AppException(ErrorCode.PRODUCT_DOESNT_EXIST)));
    }

    @Override
    public List<Product> getProductsByCategoryName(String categoryName) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByTagName(String tagName) {
        return List.of();
    }

    @Override
    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll().stream().map(productMapper::toProductResponse).toList();
    }

    @Override
    public ProductResponse updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }

    @Override
    public List<Product> searchProducts(String searchTerm) {
        return List.of();
    }
}
