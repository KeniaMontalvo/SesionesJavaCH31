package Persona;

public class TestUsuario {
	
	public static void main(String[] args) {
		
		//Instancia de usuario
		
		Usuario Felipe = new Usuario ("Doctor", "DoctorFelipe", "paracetamol");
		
		//Cambiar la contraseña
		Felipe.setPassword("");//error
		Felipe.setPassword("paracetamol");//error
		Felipe.setPassword("ibuprofeno");//funciona
		Felipe.setPassword("aspirina");//error
		
		
	}
}
