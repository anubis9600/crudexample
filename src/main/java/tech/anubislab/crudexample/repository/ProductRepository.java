package tech.anubislab.crudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.anubislab.crudexample.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);

}