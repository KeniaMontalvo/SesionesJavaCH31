package org.markpetplace.markpetplace.service;

import java.util.List;
import java.util.Optional;

import org.markpetplace.markpetplace.model.Client;
import org.markpetplace.markpetplace.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	private final ClientRepository clientRepository;
	
	
	@Autowired
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public List<Client> getClients() {
		return clientRepository.findAll();
	}
	
	//Crear un método Get by Id utilizando una query personalizada que incluye parámetros de consulta
	public Client getClientById(Long id) {
		return clientRepository.getById(id);
	}
	
		
	public Client getClientByCorreo(String correo) {
		return clientRepository.getByCorreo(correo);
	}
	
	
	//Método DELETE. Se eliminan registros por id
		//Revisar si mi usuario con el id indicado, existe dentro de mi table (sentencia condicional if-else). En caso de que exista, se elimina. En caso de que no exista, mandamos una excepción
		public void deleteClient(Long id) {
			if(clientRepository.existsById(id)) { //Mediante método Jpa evalúo si el cliente existe por id
				clientRepository.deleteById(id); //Si es true, ejecuto un método Jpa para eliminar el cliente existente por id
			} else { //Si es false (no existe ese id), lanzo una excepción
				throw new IllegalStateException("The client with the request Id doesn't exist");
			}
		}
		
		
		
		public void addClient(Client client) {
			
			//Como necesito recurrir a una evaluación true o false, utilizo un Optional en el Objeto a evaluar y asigno una variable. Dentro de esta variable de tipo Optional invoco el método de Repository para encontrar el usuario por email y hacer mi sentencia condicional
			//PERO como no tengo un método "findByEmail" que provenga de manera nativa de JpaRepository, tengo que crearlo en Repository...
			Optional<Client> clientByCorreo = clientRepository.findByCorreo(client.getCorreo()); //Usando la Query personalizada de Repository puedo acceder al valor de email del Client (getter)
			if(clientByCorreo.isPresent()) {
				throw new IllegalStateException("El cliente ya se encuentra registrado");
			}
			clientRepository.save(client);
		}

		
		//Método PUT. Permite actualizar la información de un cliente, lo haremos mediante actualización de cualquier atributo.
		public Client updateClient(Client client) {
			return clientRepository.save(client);
		}
	
	

}
