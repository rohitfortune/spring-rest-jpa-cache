package com.example.cache.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cache.entities.ProductCategory;
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

	ProductCategory findByName(String name);

}
