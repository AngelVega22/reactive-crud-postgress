package com.example.reactive_crud.repositories;

  import com.example.reactive_crud.models.Product;
 import org.springframework.data.repository.reactive.ReactiveCrudRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product,Long> {
}
