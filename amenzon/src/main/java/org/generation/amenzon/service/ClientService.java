package org.generation.amenzon.service;

import java.util.List;
import java.util.Optional;

import org.generation.amenzon.model.Client;
import org.generation.amenzon.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	//Instanciamos un objeto de repository, para poder "heredar" métodos de JPA
	private final ClientRepository clientRepository;
	
	//Crear un constructor que será la entrada a nuestra inyección de dependencias y para ello necesitamos establecer que en dicho constructor se inyectarán las dependencias con la anotación @Autowired
	@Autowired
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	//Crear método que me permita leer a todos los clientes de mi DB
	//Método GET para traer a todos los registros de clientes
	public List<Client> getClients() {
		return clientRepository.findAll();
	}
	
	
	//Método GET para traer un solo cliente por su id
	//Se convierte en método de tipo Optional para no terminar con el proceso del servidor, sino que permite la ejecución aún cuando el resultado es false
	public Optional<Client> getClient(Long id) {
		return clientRepository.findById(id);
	}
	
	
	//Método GET para traer un solo cliente por su id
	//Se maneja una excepción personalizada para no recurrir a un método de tipo Optional
	/*public Client getClient(Long id) {
		return clientRepository.findById(id).orElseThrow(
				() -> new IllegalStateException("The Client with the request ID doesn't exist")
				);
	}*/
	
	
	
	//Método DELETE. Se eliminan registros por id
	//Revisar si mi usuario con el id indicado, existe dentro de mi table (sentencia condicional if-else). En caso de que exista, se elimina. En caso de que no exista, mandamos una excepción
	public void deleteClient(Long id) {
		if(clientRepository.existsById(id)) { //Mediante método Jpa evalúo si el cliente existe por id
			clientRepository.deleteById(id); //Si es true, ejecuto un método Jpa para eliminar el cliente existente por id
		} else { //Si es false (no existe ese id), lanzo una excepción
			throw new IllegalStateException("The client with the request Id doesn't exist");
		}
	}
	
	
	//Método POST. Me permite crear registros en la tabla de mi DB.
	//JPQL. Java Persistence Query Language, me permite crear consultas como si fuera SQL (Queries) pero de manera nativa (método Jpa) o de manera personalizada
	public void addClient(Client client) {
		
		//Como necesito recurrir a una evaluación true o false, utilizo un Optional en el Objeto a evaluar y asigno una variable. Dentro de esta variable de tipo Optional invoco el método de Repository para encontrar el usuario por email y hacer mi sentencia condicional
		//PERO como no tengo un método "findByEmail" que provenga de manera nativa de JpaRepository, tengo que crearlo en Repository...
		Optional<Client> clientByEmail = clientRepository.findByEmail(client.getEmail()); //Usando la Query personalizada de Repository puedo acceder al valor de email del Client (getter)
		if(clientByEmail.isPresent()) {
			throw new IllegalStateException("El cliente ya se encuentra registrado");
		}
		clientRepository.save(client);
	}

	
	//Método PUT. Permite actualizar la información de un cliente, lo haremos mediante actualización de cualquier atributo.
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}
	
	
	
}
