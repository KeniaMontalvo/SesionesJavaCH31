package org.generation.amenzon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Nos permite establecer la java class como entidad para conectarnos con la DB
@Table(name = "clients") //Me indica a qué tabla de la DB se va a conectar
public class Client {
	@Id //Me define mi punto de entrada (Primary Key) para que Spring Boot sepa donde inicia la conexión de mi variable con la columna de la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Permite generar valores de manera automática
	@Column(name="id_client", unique=true, nullable=false)
	private Long id;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phone;
	
	
	//Constructor vacío
	public Client() {
		
	}
	
	
	//Constructor
	public Client(Long id, String firstName, String lastName, String address, String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
	//Getters y setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	
	//toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + "]";
	}

	
} //Finaliza clase Client
