package loops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		/*
		 Do-While. Evalúa su expresion en la parte inferior del ciclo. Por lo tanto, las declaraciones dentro del bloque "do" siempre se ejecutan al menos una vez.
		 */
		
		//Cuenta del 1 al 10
		int cuenta = 1;
		do {
			System.out.println(cuenta);
			cuenta++;
		} while(cuenta < 0); //Output:1 /ya que se ejecutó al menos una vez
		
		
		/*
		 Crear un programa para un cajero bancario
		 - El programa me mostrará 3 opciones:
		 1. Consultar saldo
		 2. Ingresar dineros
		 3. Retirar dineros
		 4. Salir
		 
		 - Mostrar mensaje de bienvenida al usuario, darle contexto y solicitar que elija una opción (número)
		 
		 - Mostrar al usuario la opción que eligió y permitir que elija otra opción.
		 - El usuario puede salir del programa escribiendo 4 (salir)
		 */
		
		System.out.println("Bienvenido al Banco Generation, elije cualquiera de las opciones, escribe el número que corresponda");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Ingresar dineros");
		System.out.println("3. Retirar dineros");
		System.out.println("4. Salir");
		
		Scanner skner = new Scanner(System.in);
		
		int opcionSeleccionada;
		
		do {
			switch(opcionSeleccionada = skner.nextInt()) {
			case 1:
				System.out.println("Consultar saldo");
				break;
			case 2:
				System.out.println("Ingresar dineros");
				break;
			case 3:
				System.out.println("Retirar dineros");
				break;
			case 4:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Elige una opción válida");
				break;
			}
		} while(opcionSeleccionada != 4);
		
		
		skner.close();
	}
}
