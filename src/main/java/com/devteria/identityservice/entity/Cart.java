package com.devteria.identityservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "product_id")
    Long productId;

    @OneToMany(mappedBy = "cart")
    List<Product> products;

    @Column(name = "user_id")
    String userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "color_id")
    Color color;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "size_id")
    Size size;

    @Column(name = "quantity")
    Integer quantity;
}
