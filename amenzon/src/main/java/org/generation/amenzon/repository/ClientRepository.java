package org.generation.amenzon.repository;

import java.util.Optional;

import org.generation.amenzon.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//En repository vivirá mi JpaRepository que me permitirá extender los métodos específicos de la JPA, así como anotaciones que me servirán para indicar acciones. El JpaRepository recibe dos argumentos, el modelo o lógica de negocio, es decir, la entidad (Java class model) y el tipo de datos que será mi entrada a la tabla de la DB.

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	//Método sin Optional para consultar el id
	@Query("SELECT u FROM Client u WHERE u.id=?1")
	Client getById (Long id);
	
	//Método sin Optional para consultar el email
	@Query("SELECT u FROM Client u WHERE u.email=?1")
	Client getByEmail (String email);
	
	
	//Declaramos método personalizado de consulta (query methods) en la interface
	Optional<Client> findByEmail (String email);
}
