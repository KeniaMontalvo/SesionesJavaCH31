package org.generation.amenzon.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity //Nos permite establecer la java class como entidad para conectarnos con la DB
@Table(name = "clients") //Me indica a qué tabla de la DB se va a conectar
public class Client {
	private Long id;
	private String first_name;
	private String last_name;
	private String address;
	private String email;
	private String phone;
	
	//Constructor
	public Client(Long id, String first_name, String last_name, String address, String email, String phone) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
		return "Client [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", address=" + address
				+ ", email=" + email + ", phone=" + phone + "]";
	}
	
	

	
} //Finaliza clase Client
