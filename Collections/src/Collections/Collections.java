package Collections;

public class Collections {
	
	public static void main(String[] args) {
		
		//Array
		//Tipo de dato del array, nombre, instancia del objeto arreglo y los datos.
		String[] listaDeCompras = new String[] {"Leche", "Pan", "Huevos"};
		
		//Solo muestra espacio en memoria
		System.out.println(listaDeCompras);
		
		//Imprimir información de listaDeCompras con un forEach
		
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaDeCompras) {
			//Muestra información del array
			System.out.println(productoAImprimir);
		}
		
		
		
	}
}
	
	//Collections
	
	/*
	 Colecciones
	 
	 - Arrays (arreglos)
	 
	 Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma continua (uno al lado del otro) y se pueden acceder a ellos a través de un índice.
	 
	 Las principales características de un array son:
	 
	- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
	- La longitud de un array se establece al momento de crearlo y no cambia.
	- Podemos acceder a elementos por medio de un índice.
	- Los arrays pueden contener datos primitivos y objetos.
	- No proporciona métodos adicionales para agregar o eliminar elementos. 
	
	
	Un ejemplo de array es una lista de compras del supermercado. 
	 */


