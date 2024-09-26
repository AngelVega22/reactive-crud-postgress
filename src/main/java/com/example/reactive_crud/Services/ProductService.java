package com.example.reactive_crud.Services;

import com.example.reactive_crud.models.Product;
import com.example.reactive_crud.repositories.ProductRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Flux<Product> findAll() {
        return productRepository.findAll();
    }

    public Mono<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public Mono<Product> save(Product product) {
        return productRepository.save(product);

    }

    public Mono<Void> deleteById(Long id) {
        return productRepository.deleteById(id);
    }

}
