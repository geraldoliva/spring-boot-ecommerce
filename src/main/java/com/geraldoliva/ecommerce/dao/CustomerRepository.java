package com.geraldoliva.ecommerce.dao;

import com.geraldoliva.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
