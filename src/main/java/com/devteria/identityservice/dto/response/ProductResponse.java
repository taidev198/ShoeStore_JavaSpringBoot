package com.devteria.identityservice.dto.response;

import com.devteria.identityservice.entity.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponse {
    Long id;
    String title;
    int price;
    int discount;
    int quantity;
    String description;
    String shortDescription;
    Set<Category> categories = new HashSet<>();
    Set<Gallery> galleries = new HashSet<>();
    Set<Tag> tags = new HashSet<>();
    Color colors;
    Size sizes;
}
