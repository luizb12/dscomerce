package com.dscommerce.devsuperior.repositories;

import com.dscommerce.devsuperior.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
