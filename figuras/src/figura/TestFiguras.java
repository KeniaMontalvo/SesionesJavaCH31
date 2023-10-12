package figura;

public class TestFiguras {

	public static void main(String[] args) {
		
		
		//Generar las instancias de nuestras clases
		
		//1. Instancia de la clase Figura
		//Figura Generica = new Figura();

		//2. Intancia de un rectángulo
		Figura Rectangulo = new Rectangulo(0.5,6.5);
		
		//3. Instancia de un círculo
		Figura Circulo = new Circulo(3.14, 3.0);
		
		//4. Instancia de un cuadrado
		Figura Cuadrado = new Cuadrado(5);
		
		//Invocación del método
		System.out.println(Rectangulo.calcularArea());
		System.out.println(Circulo.calcularArea());
		System.out.println(Cuadrado.calcularArea());
		
	}

}
