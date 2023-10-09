//En esta clase vamos a heredar el atributo de la clase abstracta Figura y lo vamos a sobreescribir

package figura;

//1. Aplicamos herencia

public class Rectangulo extends Figura{
	
	//Parámetros
	double base;
	double altura;
	
	//Constructor
	Rectangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	//Métodos
	@Override
	public double calcularArea() {
		double formulaRectangulo = base * altura;
		return formulaRectangulo;
	}

	
	
}
