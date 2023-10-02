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
		
	}
}
