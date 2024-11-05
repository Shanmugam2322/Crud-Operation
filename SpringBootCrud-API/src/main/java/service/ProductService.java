package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	/*
	public Product saveProduct(Product product) {
		return productRepository.saveAll(product);
	}
	*/
	

}
