package figura;

//Clase concreta que implementa métodos de una interfaz llamada Calculable
public class Esfera implements Calculable {
	
	//Atributos
	double radio;
	double pi = 3.14;

	@Override
	public double calcularArea() {
		//Área
		double area = (4* pi)*(radio*radio);
		return area;
	}

	@Override
	public double calcularVolumen() {
		//Volumen
		return 0;
	}

	@Override
	public double calcularPerimetro() {
		//Perímetro
		return 0;
	}

}
