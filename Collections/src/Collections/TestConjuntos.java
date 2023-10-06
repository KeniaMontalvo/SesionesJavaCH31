package Collections;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestConjuntos {
	
	public static void main(String[] args) {
		
		/*
		 SET.
		 
		 Estructura de datos que representa una colección de elementos únicos.
		 */
		
		//HashSet: Conjunto de datos que no almacena en orden específico, garantiza que no hay duplicados.
		
		//Consultorio Dental. Se registran correos electrónicos de pacientes.
		
		System.out.println("HashSet");
		System.out.println("Correos electrónicos registrados de pacientes inscritos a promociones");
		
		Set<String> correosHash = new HashSet<>();
		
		correosHash.add("zoro@gmail.com");
		correosHash.add("sanji@hotmail.com");
		correosHash.add("luffy@outlook.com");
		correosHash.add("nami@gmail.com");
		correosHash.add("nami@gmail.com"); //No acepta correos repetidos
		correosHash.add("zoro@hotmail.com");
		
		for(String correosRegistrados : correosHash) {
			System.out.println("Correo electrónico registrado " + correosRegistrados);
		}
		
		
		//TreeSet: Los elementos del conjunto se almacenan de menor a mayor y tampoco duplica elementos.
		
		System.out.println("*************");
		System.out.println("TreeSet");
		System.out.println("Pacientes ordenados por apellido");
		
		Set<String> nombresTree = new TreeSet<>();
		
		nombresTree.add("Monkey D. Luffy");
		nombresTree.add("Roronoa Zoro");
		nombresTree.add("Vinsmoke Sanji");
		nombresTree.add("Nico Robin");
		nombresTree.add("Tony Tony Chopper");
		nombresTree.add("Monkey D. Garp");
		
		for(String nombresPacientes : nombresTree) {
			System.out.println("Paciente " + nombresPacientes);
		}
		
		//LinkedHashSet. Los elementos del conjunto se encuentran en el orden que se insertan, similar a una lista pero sin dejar ingresar valores repetidos. 
		
		//Consultorio Dental. Se unen horarios y fechas para realizar una cita.
		
		System.out.println("*************");
		System.out.println("LinkedHashSet");
		System.out.println("Horarios y fechas para citas");
		
		Set<String> citasLinkedHash = new LinkedHashSet<>();
		
		citasLinkedHash.add("11:00 6/Oct/2023");
		citasLinkedHash.add("11:00 6/Oct/2023"); //No acepta doble cita a la misma hora y día
		citasLinkedHash.add("15:00 6/Oct/2023");
		citasLinkedHash.add("11:00 7/Oct/2023");
		citasLinkedHash.add("13:00 7/Oct/2023");
		citasLinkedHash.add("15:00 8/Oct/2023");
		
		for(String citasRegistradas : citasLinkedHash) {
			System.out.println("Las citas registradas son " + citasRegistradas);
		}
		
	}
	
	
}
