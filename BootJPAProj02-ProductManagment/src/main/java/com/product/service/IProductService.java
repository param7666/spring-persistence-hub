package com.product.service;

import java.util.Optional;

import com.product.entity.Product;

public interface IProductService {
	void insertProduct(Product product);
	Iterable<Product> getAllProducts();
	Optional<Product> findProductById(int id);
	void deleteProductById(int id);
}
