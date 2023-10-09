package figura;

public class Cuadrado extends Figura {
	
	//Parámetros
		double lado;
		
		//Constructor
		Cuadrado(double lado){
			this.lado = lado;
		}
		
		//Métodos
		@Override
		public double calcularArea() {
			double formulaCuadrado = lado * lado;
			return formulaCuadrado;
		}
}
