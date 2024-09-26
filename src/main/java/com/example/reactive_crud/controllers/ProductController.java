package com.example.reactive_crud.controllers;

import com.example.reactive_crud.Services.ProductService;
import com.example.reactive_crud.models.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public Flux<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PostMapping
    public Mono<Product> createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteProduct(@PathVariable Long id) {
        return productService.deleteById(id);
    }
}
