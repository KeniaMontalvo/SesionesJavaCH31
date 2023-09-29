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
		
		
		
			
	}

}
