package figura;

//Herencia de la clase abstracta Figura
public class Circulo extends Figura{

	//1. Atributos
	double pi;
	double radio;
	
	//2. Constructor
	Circulo(double pi, double radio){
		this.pi = pi;
		this.radio = radio;
	}
	
	//3. Métodos (método abstracto heredado de Figura)
	@Override
	public double calcularArea() {
		double areaCirculo = pi * (radio*radio);
		return areaCirculo;
	}
	
}
