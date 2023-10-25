package org.generation.amenzon.controller;

import java.util.List;

import org.generation.amenzon.model.Client;
import org.generation.amenzon.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //Decimos que es una API Rest que trabaja con métodos GET, PUT, POST y DELETE
@RequestMapping(path = "/users/clients") //Aquí defino la ruta de nuestra API, es decir, el endpoint... http://localhost:8080/users/clients
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}) //Mediante origen cruzado, puedo manejar problemas de seguridad. Me permite acceder desde cualquier origina (dominio) a los métodos HTTP


public class ClientController {
	//Instanciamos una clase de Service para acceder a los métodos de Service y no tener que realizar varias conexiones
	private final ClientService clientService;

	//Constructor que toma el objeto Service y luego indica que aquí se llevará a cabo la inyección de dependencias
	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	//Conecto mi Controller con mi Service mediante Autowired (inyección de dependencias) y solo necesito traer lo que Service puede hacer
	//Para conectar el método Get de Service con el GetMapping, tengo que crear un método que venga de lo que hace Service
	@GetMapping
	public List<Client> getClients(){
		return clientService.getClients();
	}
	
	/*
	//Conectar mi Service y Controller para buscar un cliente por Id
	//Debo indicar el URI específico del Id
	//Debo indicar cuál será el PathVariable y el tipo de dato
	@GetMapping(path = "{id}")
	public Optional<Client> getClient(@PathVariable("id") Long id){
		return clientService.getClient(id);
	}
	*/
	
	
	//-----------------------------------------------//
	//Crear un método Get by Id utilizando una query personalizada que incluye parámetros de consulta
	@GetMapping(path = "/id")
	public ResponseEntity<Client> getClientById (@RequestParam Long id){
		Client client = clientService.getClientById(id);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	//-----------------------------------------------//
		

		
	//-----------------------------------------------//
	//Crear un método Get by Email utilizando una query personalizada que incluye parámetros de consulta
	@GetMapping(path = "/byEmail")
	public ResponseEntity<Client> getClientByEmail (@RequestParam String email){
		Client client = clientService.getClientByEmail(email);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	//-----------------------------------------------//

		
		
	//Método para eliminar clientes por Id. Necesito definir la URI correspondiente al Id, el @PathVariable y el tipo de dato sobre el cual actúa
	@DeleteMapping(path = "{id}")
	public void deleteClient(@PathVariable("id") Long id) {
		clientService.deleteClient(id);
	}
	
	//Método para crear nuevos usuarios desde el Service
	@PostMapping
	public void postClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	
	//Método para controlar el Service y actualizar clientes
	@PutMapping(path = "{id}")
	public Client updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
		client.setId(id);
		return clientService.updateClient(client);
	}
	
	
	
	
	
	
	
}
