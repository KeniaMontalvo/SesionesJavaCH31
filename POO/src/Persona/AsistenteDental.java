package Persona;

public class AsistenteDental {
	
	// 1. Atributos privados
	private String fechaIngreso;
	private double salario;
	
	// 2. Constructor (público para poder acceder a él de forma sencilla)
	public AsistenteDental(String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	}
	
	// 3. Métodos
	
	//Método para imprimir información
	public void mostrarDatosAsistente() {
		System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
		System.out.println("El salario del asistente es: " + salario);
	}
	
	//Generalmente, el constructor siempre va en publico para evitar errores al momento de la instancia
	
	
	
	//Getters y setters para poder acceder a mis datos privados y poder realizar operaciones con ellos
	//Sin getters, la información me aparece en null
	//Sin setters, no puedo cambiar la información
	
	public String getFechaIngreso() {
		return fechaIngreso;
	} //getFechaIngreso
	
	public double getSalario() {
		return salario;
	} //getSalario
	
	
	//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}
		}//cierre setter
	
	
	
} //Cierre AsistenteDental
