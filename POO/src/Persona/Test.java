package Persona;

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
	
	}
}
