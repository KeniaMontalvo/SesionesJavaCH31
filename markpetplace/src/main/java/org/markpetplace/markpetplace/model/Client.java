package org.markpetplace.markpetplace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario", unique=true, nullable=false)
	private Long id;
	private String nombreUsuario;
	private String contrasenia;
	private String apellido;
	private String telefono;
	private String correo;
	
	
	//Constructor vacío
	public Client() {
	}

	
	//Constructor
	public Client(Long id, String nombreUsuario, String contrasenia, String apellido, String telefono, String correo) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}


	//Getters y setters
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getContrasenia() {
		return contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}

	
	
	//toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrasenia=" + contrasenia + ", apellido="
				+ apellido + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
	

}
