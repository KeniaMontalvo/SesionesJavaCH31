package Persona;

public class Dentista extends Persona {
	
	
	/*
	 Ya no creo valores como nombre, edad, apellido, etc., porque estos valores los voy a heredar de la clase Persona
	 */
	
	//1 Atributos
	String especialidad;
	String cedula;
	String consultorioAsignado;
	String experiencia;
	String turno;
	int salario = 500;

	
	
	//2 Constructor
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,String cedula, String consultorioAsignado, String experiencia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //informacion de la clase Persona
		//informacion de la clase Dentista
		this.especialidad = especialidad;
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiencia;
		this.turno = turno;
		this.salario = salario;
	}//constructor Dentista con informacion heredada
	
	// 3. Métodos (para calcular salario basado en la experiencia)
	
	// Experiencia. básico, intermedio, avanzado.
	
	//Si el dentista está en rango básico, gana 30,000. Si es intermedio, gana 40,000, si es avanzado gana 50,000
	
	void calcularSalario() {
		//Logica de programacion
		if (experiencia.equals("basico")) {
			salario = 30000;
		} else if (experiencia.equals("intermedio")) {
			salario = 40000;
		}else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}
	
	void imprimirDentista() {
		System.out.println("La especialidad es: " + especialidad);
		System.out.println("El salario es: " + salario);
	}
	
	
}//cierre de Dentista