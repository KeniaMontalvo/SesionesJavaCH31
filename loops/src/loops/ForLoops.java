package loops;

public class ForLoops {
	public static void main(String[] args) {
		/*
		 El ciclo for proporciona una forma compacta de iterar sobre valores.
		 
		 for (inicialización; condición; contador (incremento/decremento) {
		 //Bloque de código
		  }
		 */
		
		//for con variable local
		for (int numero = 1; numero <=10; numero++) {
			System.out.println("Número igual a " + numero);
		}
		
		//for con variable global
		int contador;
		for(contador = 1; contador <=5; contador++) {
			System.out.println("La cuenta es " + contador);
		}
		
		/*
		 Bucles anidados. Bucle dentro de otro bucle.
		 */
		
		//Imprimir una forma triangular de asteriscos
		int filas = 5;
		
		for (int i=0; i<filas; i++) {
			//Bloque de código que va a iterar sobre el primer bucle
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Java API - Math
		//Calcular 5 potencias del valor PI y mostrar en consola el valor de cada una de ellas
		//Output: PI elevado a la 1 potencia es igual a: 3.141592653589793
		//PI elevado a la 2 potencia es igual a ...
		System.out.println("El valor de PI es " + Math.PI);
		
		int potencias = 5;
		for (int base = 1; base <= potencias; base++) {
			double resultado = Math.pow(Math.PI, base);
			System.out.println("PI elevado a la " + base + " es igual a " + resultado);
		}
			
	}
}
