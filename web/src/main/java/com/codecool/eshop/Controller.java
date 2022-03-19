package com.codecool.eshop;

import java.util.*;

public class Controller {

    private final ProductService service;

    public Controller(ProductService service) {
        this.service = service;
    }

    public static void main(String[] args) throws Exception {
        Class<?> repoClass = Class.forName("com.codecool.eshop.InMemoryProductRepository");
        Object productRepository = repoClass.getConstructor().newInstance();
        Class<?> serviceClass = Class.forName("com.codecool.eshop.RepositoryProductService");

        ProductService service = (ProductService) serviceClass.getConstructor(Class.forName("com.codecool.eshop.ProductRepository")).newInstance(productRepository);

        System.out.println(service);

        Controller controller = new Controller(service);
        System.out.println(controller.listOfProducts());
    }

    public List<Product> listOfProducts() {
        return service.all();
    }
}
