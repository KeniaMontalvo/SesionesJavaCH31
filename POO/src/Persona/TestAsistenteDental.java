package Persona;

public class TestAsistenteDental {

	public static void main(String[] args) {
		
		//Instancia de nuestro asistente
		
		AsistenteDental Francisca = new AsistenteDental("05/10/2023", 875.40d);
		
		//Impresión de la información de nuestro asistente
	Francisca.mostrarDatosAsistente();
		
		//El salario de Francisca no es de 875.4, sino de 87.54
	//Cambio de salario
	//Francisca.salario = 87.54;
	
	//Mostrar solo el sueldo (antes del getter)
	//System.out.println(Francisca.salario);
	
	//Mostrar el salario (después del getter)
	System.out.println(Francisca.getSalario());
		
	//Modificar salario con setter
	Francisca.setSalario(300.00); //No cumple condición
	Francisca.setSalario(30.00); //Sí cumple condición
	
	//Imprimir nuevo salario de Francisca
	System.out.println(Francisca.getSalario());
		
		
	}
	
}
