package com.cafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
