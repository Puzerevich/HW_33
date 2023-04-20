package com.example.HW_33_spring_data.repository;

import com.example.HW_33_spring_data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
