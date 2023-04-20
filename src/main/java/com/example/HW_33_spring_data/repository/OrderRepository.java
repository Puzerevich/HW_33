package com.example.HW_33_spring_data.repository;

import com.example.HW_33_spring_data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
