package org.generation.amenzon.repository;

import java.util.Optional;

import org.generation.amenzon.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

//En repository vivirá mi JpaRepository que me permitirá extender los métodos específicos de la JPA, así como anotaciones que me servirán para indicar acciones. El JpaRepository recibe dos argumentos, el modelo o lógica de negocio, es decir, la entidad (Java class model) y el tipo de datos que será mi entrada a la tabla de la DB.

public interface ClientRepository extends JpaRepository<Client, Long> {
	
	//Declaramos método personalizado de consulta (query methods) en la interface
	Optional<Client> findByEmail (String email);
}
