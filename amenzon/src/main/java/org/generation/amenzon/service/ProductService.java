package org.generation.amenzon.service;

import java.util.List;
import java.util.Optional;

import org.generation.amenzon.model.Product;
import org.generation.amenzon.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public final ProductRepository productRepository;

	
	//Constructor
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	//CRUD
	//GET ALL
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	
	//GET byId
	public Optional<Product> getProduct(Long id) {
		return productRepository.findById(id);
	}
	
	
	//DELETE byId
	public void deleteProduct(Long id) {
		if (productRepository.existsById(id)){
			productRepository.deleteById(id);
		} else {
			//Exception
			throw new IllegalStateException("The product with the id doesn't exist");
		}
	}

	
	//POST
	public void addProduct(Product product) {
		Optional<Product> productByCode = productRepository.findByCode(product.getCode());
		if (productByCode.isPresent()) {
			//Exception
			throw new IllegalStateException("The product is already registered");
		} //Guardar producto
		productRepository.save(product);
		
	}
	
	
	//PUT byId
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}
	
	
	
	
}
