package org.generation.amenzon.repository;

import java.util.Optional;

import org.generation.amenzon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//JPQL
	Optional<Product> findByCode(String code);
}
