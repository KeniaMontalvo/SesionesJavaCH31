package Persona;

public class Usuario {
	
	//Atributos
	private String tipoUsuario;
	private String username;
	private String password;
	
	//Crear un nuevo usuario (constructor)
	public Usuario(String tipoUsuario, String username, String password) {
		this.tipoUsuario = tipoUsuario;
		this.username = username;
		this.password = password;
	}
	
	//Recuperar contraseña (getter)
	public String getPassword() {
		//Si el usuario registrado coincide con el usuario que paso como parámetro, entonces obtengo la contraseña
		return password;
	}
	
	
	//Cambiar contraseña (setter)
	public void setPassword(String newPassword) {
		//Si la contraseña es diferente a una cadena vacía y es diferente a la contraseña anterior...
		if (newPassword != "" && newPassword != password && newPassword.length()>8) {
			//entonces reemplazo la contraseña anterior
			password = newPassword;
			System.out.println("Contraseña cambiada correctamente");
		} else {
			System.out.println("Lo siento, no puedo cambiar la contraseña");
		}
	}
	
	
	//Cambiar la contraseña de un objeto del tipo usuario
	
	//Felipe.setPassword (una donde la contraseña esté vacía)
	//Felipe.setPassword (una donde la contraseña no esté vacía pero sea igual a la anterior)
	//Felipe.setPassword (se cumplen ambas condiciones)
	
	
	

}
