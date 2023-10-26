package org.markpetplace.controller;

import java.util.List;

import org.markpetplace.model.Client;
import org.markpetplace.service.ClientService;
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

@RestController
@RequestMapping(path = "/usuario")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})

public class ClientController {
	
	private final ClientService clientService;
	
	@Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	@GetMapping
	public List<Client> getClients(){
		return clientService.getClients();
	}
	
	@GetMapping(path = "/id")
	public ResponseEntity<Client> getClientById (@RequestParam Long id){
		Client client = clientService.getClientById(id);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	
	
	@GetMapping(path = "/byEmail")
	public ResponseEntity<Client> getClientByEmail (@RequestParam String correo){
		Client client = clientService.getClientByEmail(correo);
		return new ResponseEntity<>(client, HttpStatus.OK);
	}
	
	
	@DeleteMapping(path = "{id}")
	public void deleteClient(@PathVariable("id") Long id) {
		clientService.deleteClient(id);
	}
	
	
	@PostMapping
	public void postClient(@RequestBody Client client) {
		clientService.addClient(client);
	}
	
	
	@PutMapping(path = "{id}")
	public Client updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
		client.setId(id);
		return clientService.updateClient(client);
	}
	
	

}
