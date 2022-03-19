package com.codecool.eshop;

import java.util.List;

public class InMemoryProductRepository implements ProductRepository {
    public List<Product> getAllProducts(){
        return List.of(new Product(), new Product());
    };
}
