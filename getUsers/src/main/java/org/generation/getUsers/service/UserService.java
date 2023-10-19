package org.generation.getUsers.service;

import java.util.ArrayList;

import org.generation.getUsers.model.User;
import org.springframework.stereotype.Service;

/*
	Haremos dos cosas:
	1. Emular la base de datos mediante un ArrayList, el cual nos servirá para realizar la consulta.
	2. Definir las operaciones del CRUD (Create, Read, Update y Delete). En este caso, solo usaremos Read (GET).
	
	Para definir que una clase es un Servicio, utilizamos la anotación @Service e importamos desde JPA
	*/

@Service
public class UserService {
	//1. Crear una lista de objetos y debe contener los atributos definidos en model. Para ello inicializo una variable de tipo constante.
	
	public final ArrayList<User> listaUsuarios = new ArrayList<User>();
	
	//Instanciando usuarios y agregándolas a mi lista en un método
	public UserService() {
		listaUsuarios.add(new User(1L, "Daniel", "Maldonado", "Tabasco", "daniel@gmail.com", "9933333333"));
		listaUsuarios.add(new User(2L, "Kenia", "Montalvo", "Nuevo León", "kenia@gmail.com", "1234569878"));
		listaUsuarios.add(new User(3L, "Brandon", "Palacios", "Hidalgo", "brandon@mail.com", "7751234567"));
		listaUsuarios.add(new User(4L, "Antonio", "Salcido", "Guadalajara, Jal", "antonio@mail.com", "7755664411"));
		listaUsuarios.add(new User(5L, "Alejandra", "Piedra", "Yucatán", "ale@gatito.com", "9933720000"));
		listaUsuarios.add( new User(6L, "Alicia", "Diaz", "Guadalajara", "alicia@mail.com", "3411234567"));
		listaUsuarios.add(new User (7L, "Ernesto", "Santillan", "Guadalajara", "neto@mail.com", "5534756976"));
		listaUsuarios.add( new User(8L, "Carolina", "Herrera", "Michoacan", "ankareta@gmail.com", "3531234567"));
		listaUsuarios.add( new User(9L, "Luffy", "Monkey", "East Blue", "luffy@gmail.com", "3691237845"));
		listaUsuarios.add( new User(10L, "Sanji", "Vinsmoke", "North Blue", "sanji@gmail.com", "9637895623"));
	}
	
	//Métodos CRUD para poder iterar sobre nuestros usuarios.
	/*
	 *CRUD. Operaciones que permiten manipular la información.
	 C (Create). Crear algo.	POST para mandarlo al servidor.
	 R (Read). Leer algo.	GET para recibirlo desde el servidor.
	 U (Update). Actualizar.	PUT para modificar/actualizar lo que ya existe.
	 D (Delete). Borrar algo.	DELETE para borrar algo de nuestro servidor. 
	 */
	
	
	//Método que me permita retornar (enviar) todos los usuarios al controller.
	public ArrayList<User> enviarUsuarios(){
		return listaUsuarios;
	}
	
	
}
