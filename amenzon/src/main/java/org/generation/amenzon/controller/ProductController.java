package org.generation.amenzon.controller;

import java.util.List;
import java.util.Optional;

import org.generation.amenzon.model.Product;
import org.generation.amenzon.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store/products")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ProductController {
	private final ProductService productService;

	
	//Constructor
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	
	//Métodos desde Service (CRUD)
	//GET All
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	
	//GET byId
	@GetMapping(path = "/{id}")
	public Optional<Product> getProduct(@PathVariable("id")Long id) {
		return productService.getProduct(id);
	}
	
	//DELETE byId
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable("id")Long id) {
		productService.deleteProduct(id);
	}
	
	
	//POST
	@PostMapping
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	
	//PUT byId
	@PutMapping(path = "/{id}")
	public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		product.setId(id);
		return productService.updateProduct(product);
	}
	
	
	
	
	
	
	
}
