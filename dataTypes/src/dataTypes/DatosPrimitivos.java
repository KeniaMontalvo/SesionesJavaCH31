package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos.
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, double, boolean, char 
		 */
		//byte age = 28;
		//System.out.println(age); //sysout + ctrl + space
		//System.out.println(); //syso + ctrl + space
		
		//byte. VMin y VMax
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);
		
		//short. VMin y VMax
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//char. VMin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
		
		//long
		long isbn = 9788499169019L; 
		System.out.println(isbn);
		//VMin y VMax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de Long es: " + minLong);
		System.out.println("El valor máximo de Long es: " + maxLong);
		
		//float
		float salary = 15000f;
		System.out.println(salary);
		//VMin y VMax
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de Float es: " + minFloat);
		System.out.println("El valor máximo de Float es: " + maxFloat);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		//VMin y VMax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de Double es: " + minDouble);
		System.out.println("El valor máximo de Double es: " + maxDouble);
		
		//int. VMin y VMax
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de Integer es: " + minInt);
		System.out.println("El valor máximo de Integer es: " + maxInt);
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		//Casteo (Conversión de tipos en Java)
		/*
		 - Automático (dato más pequeño a un dato más grande) 
		 - Manual (tipo de dato más grande a tipo de dato más pequeño)
		 */
		
		//-- Automático
		int myNumber = 125;
		System.out.println(myNumber);
		// int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		System.out.println(edad);
		//short < int
		int valorEdad = edad;
		System.out.println(valorEdad);
		
		//-- Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversión
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat); //los valores se redondean hacia abajo
		
		//Convertir de char a int
		//char < int = automático
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
		
	};
	
}
