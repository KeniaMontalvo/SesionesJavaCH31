package org.markpetplace.markpetplace.repository;

import java.util.Optional;

import org.markpetplace.markpetplace.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ClientRepository extends JpaRepository<Client, Long> {

	//Método sin Optional para consultar el id
		@Query("SELECT u FROM Client u WHERE u.id=?1")
		Client getById (Long id);
		
		//Método sin Optional para consultar el email
		@Query("SELECT u FROM Client u WHERE u.correo=?1")
		Client getByCorreo (String correo);
		
		
		//Declaramos método personalizado de consulta (query methods) en la interface
		Optional<Client> findByCorreo (String correo);
	
	
	
	
}
