package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		
		
		System.out.println("*****ArrayList*****");
		//Implementación de un arrayList
		//Clase General (Interfaz), tipo de dato que usaré, nombre de mi estructura de dato, instancia de dicha clase general.
		
		List<String> listaDeContactos = new ArrayList<>();
		
		//Agrego elementos del tipo String a mi ArrayList llamado listaDeContactos
		listaDeContactos.add("Felipe");
		listaDeContactos.add("Roberto");
		listaDeContactos.add("Alicia");
		listaDeContactos.add("Fátima");
		
		//Obtener un elemento de la lista - asignarlo a una variable
		String datosFelipe = listaDeContactos.get(0);
		System.out.println(datosFelipe);
		
		//Borrar un elemento de la lista
		listaDeContactos.remove(1);
		System.out.println(listaDeContactos);
		
		
		
		System.out.println("*****HashSet*****");
		//Implentación de un conjunto (SET)
		//Sintaxis
		//Interface de donde implemento, tipo de dato que usaré, nombre que le doy al conjunto, instancia de la clase específica
		Set<String> cartasDeJuego = new HashSet<>();
		
		//Agregar elementos
		cartasDeJuego.add("As de Corazones");
		cartasDeJuego.add("2 de picas");
		cartasDeJuego.add("Reina de Treboles");
		
		//No puedo saber posiciones, solo saber si lo contiene
		if(cartasDeJuego.contains("Reina de Treboles")) {
		System.out.println("La Reina de Treboles sí está en el conjunto");
		} else {
			System.out.println("No encuentro el elemento solicitado");
		}
		
		
		
		System.out.println("*****HashMap*****");
		//Implementación de un mapa (HashMap)
		
		Map<String, String> libretaDirecciones = new HashMap<>();
		
		//Agregar elementos a mi libreta de direcciones, donde mi K = nombre y mi V = dirección
		libretaDirecciones.put("Felipe", "Tlalnepantla");
		libretaDirecciones.put("Dr. Simi", "CDMX");
		libretaDirecciones.put("Konoha", "Naruto");
		
		System.out.println(libretaDirecciones);
		
		//Método para sacar información de la libreta
		String direccionDeFelipe = libretaDirecciones.get("Felipe");
		String direccionDeNaruto = libretaDirecciones.get("Naruto");
		
		//Impresión
		System.out.println(direccionDeFelipe);
		System.out.println(direccionDeNaruto);
		
		
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
	
	
	- ArrayList
		Es una implementación de una lista (List), es decir, que está en un nivel abajo de las listas. Utiliza un array dinámico que permite almacenar datos.
		
		Sus principales características son:
		- Tamaño dinámico, a diferencia de los arrays tradicionales, el tamaño de un ArrayList sí se puede modificar.
		- Acceso rápido, podemos acceder a un elemento del arrayList por su posición o índice.
		- Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demás elementos.
		
		
		
	- Set
	
		Estructura de datos que almacena datos únicos sin orden específico. Las principales características de un set son:
		
		- No hay elementos duplicados, ya que los conjuntos no los pueden contener. Si se intenta agregar un elemento ya existente, la operación se ignora.
		- No hay orden específico, los elementos se almacenan sin orden específico.
		- La búsqueda es más sencilla, ya que al no tener elementos duplicados se usa una función hash para encontrar el elemento deseado.
		
		
		
	- Map (mapas)
	
		Un mapa es una estructura de datos que almacena pares de clave-valor.
		
		- Almacenamiento con pares K-V
		- Sin orden específico (similar a un Set)
		- Búsqueda rápida. La búsqueda se hace por medio de un valor (key) y usa una función interna hash para buscar elementos.
		
		
	Agenda telefónica (agregar, modificar, eliminar)
	
		
	 */


