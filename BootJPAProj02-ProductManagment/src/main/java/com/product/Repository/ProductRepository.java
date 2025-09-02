package com.product.Repository;

import org.springframework.data.repository.CrudRepository;

import com.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
