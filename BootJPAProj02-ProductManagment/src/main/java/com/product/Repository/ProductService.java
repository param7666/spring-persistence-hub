package com.product.Repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.service.IProductService;
@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository repo;
	@Override
	public void insertProduct(Product product) {
		Product result=repo.save(product);
		if(result!=null) {
			int id=result.getId();
			System.out.println("Product Inserted with id"+id);
		}
		
	}

	@Override
	public Iterable<Product> getAllProducts() {
		return repo.findAll();
	}

	@Override
	public Optional<Product> findProductById(int id) {
		return repo.findById(id);
	}

	@Override
	public void deleteProductById(int id) {
		 repo.deleteById(id);
		 System.out.println("Product deleted");
		
	}

}
