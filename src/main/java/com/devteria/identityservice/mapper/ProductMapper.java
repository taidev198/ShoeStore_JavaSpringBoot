package com.devteria.identityservice.mapper;

import com.devteria.identityservice.dto.response.ProductResponse;
import com.devteria.identityservice.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {


    ProductResponse toProductResponse(Product product);
}
