package com.example.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springmvc.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

}
