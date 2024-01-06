package com.example.cafe.dao;

import com.example.cafe.Entity.Product;
import com.example.cafe.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();

    @Modifying
    @Transactional
    Integer updateStatus(@Param("status") String status, @Param("id") Integer id);

    List<ProductWrapper> getProductByCategory(@Param("id") Integer id);

    ProductWrapper getByIdProduct(@Param("id") Integer id);
}
