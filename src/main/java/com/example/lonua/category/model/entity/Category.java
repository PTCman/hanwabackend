package com.example.lonua.category.model.entity;

import com.example.lonua.product.model.entity.Product;
import io.swagger.models.auth.In;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryIdx;

    @OneToMany(mappedBy = "category")
    private List<Product> productList = new ArrayList<>();

    @Column(nullable = false, length = 45)
    private String categoryName;

    @Column(nullable = false)
    private Date createdAt;

    @Column(nullable = false)
    private Date updatedAt;

    @Column(nullable = false)
    private Integer status;

}
