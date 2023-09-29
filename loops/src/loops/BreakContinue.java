package loops;

public class BreakContinue {
	public static void main(String[] args) {
		/*
		 Sentencias utilizadas en loops:
		 - Break. Para salir de un bucle en un punto específico.
		 - Continue. Interrumpe la iteración de un bucle si se produce una condición específica y continua con la siguiente.
		 */
		
		
		//Súper ozzito va a realizar una rifa en la cual el cliente número 5 se ganará una coca-cola de bolsita.
		//Con break finalizando el bucle antes de llegar a la condición final
		for (int cliente = 1; cliente <=20; cliente++) {
			if (cliente == 5) {
				System.out.println("Cliente número " + cliente + " ¡GANASTE!");
				break; 
			} System.out.println(cliente);
		} 
		
		
		//Con continue, ejecutando la sentencia condicional pero cumpliendo la condición del bucle
		for (int cliente = 1; cliente <=20; cliente++) {
			if (cliente == 5) {
				System.out.println("Cliente número " + cliente + " ¡GANASTE!");
				continue; 
			} System.out.println(cliente);
		} 
		
		
		
	}
}
