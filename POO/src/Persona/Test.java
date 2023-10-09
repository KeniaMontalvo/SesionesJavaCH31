package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	//Método principal para instanciar mis clases
	public static void main(String[] args) {
		
		//Instancia de Persona
		Persona Kenia = new Persona("Kenia", "Montalvo", (byte)24, "12345678", "kenia@hera.com");
		
		System.out.println(Kenia);
		Kenia.imprimirInfo();
		Kenia.saludar();
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500);
		System.out.println("****************");
		Simi.calcularSalario();
		Simi.imprimirDentista();
		
		
		//Instancia de Paciente con todos los datos
		Paciente Chencho = new Paciente("CHNCH1234", "RH Positivo", true, true, "05/Oct/2023", "Doc. Simi Lares", false);
		System.out.println("****************");
		System.out.println(Chencho);
		
		//Instancia de Paciente con datos obligatorios
		Paciente Masiosare = new Paciente("MASI12345", false, false);
		System.out.println("****************");
		System.out.println(Masiosare);
		
		//Cambiar el false de seguroMedico a true
		Masiosare.seguroGastosMedicos= true;
		System.out.println("****************");
		System.out.println(Masiosare);
		
		
		
		System.out.println("*****ArrayList*****");
		//Implementación de ArrayList de Dentistas
		List<Dentista> listaDentistaArrayList = new ArrayList<>();
		
		//Primero genero una instancia de Dentista
		Dentista DrChapatin = new Dentista("Dr. Chapatín", "Sin Apellido", (byte)45, "112233445", "chapatin@mail.com", "General", "12345678", "Consultorio 200", "avanzado", "matutino", 450);
		
		//Luego la agrego a la lista
		listaDentistaArrayList.add(DrChapatin);
		System.out.println(listaDentistaArrayList);
		
		//Si agrego la instancia a una variable, puedo imprimir su información usando un toString, o un método mostrarInfo(); 
		
		
		//Hago una instancia y la agrego directamente a la lista
		listaDentistaArrayList.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
		System.out.println(listaDentistaArrayList);
		//Si genero la instancia y la agrego directamente al ArrayList, para sacar el dato tendré que utilizar un forEach o algún ciclo para imprimir dato por dato
		
		System.out.println("*****HashSet*****");
		//Implementación de lista de Dentistas con un HashSet
		Set<Dentista> conjuntoDentistas = new HashSet<>();
		
		//Agregando Dentista a mi Conjunto
		conjuntoDentistas.add(new Dentista("Dr. Simi", "Lares", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
		System.out.println(conjuntoDentistas);
		
		
		System.out.println("*****HashMap*****");
		//Implementación de un HashMap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<>();
		
		//Agregar un dentista a mi mapa
		mapaDentistas.put("Dr. House", new Dentista ("Gregory", "House", (byte)50, "12345678", "simi@lares.com", "Odontología", "55113344", "Consultorio 500", "avanzado", "matutino", 500));
		
		//Imprimir el objeto Dr. House
		Dentista DoctorBuscado = mapaDentistas.get("Dr. House");
		System.out.println(DoctorBuscado);
		
	
	}
}
