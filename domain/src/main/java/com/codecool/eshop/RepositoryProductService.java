package com.codecool.eshop;

import java.util.List;

class RepositoryProductService implements ProductService{
    ProductRepository productRepository;

    public RepositoryProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> all() {
        return productRepository.getAllProducts();
    }
}
