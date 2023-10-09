/*
 Vamos a usar clases abstractas para evitar la instanciación de objetos que no necesito (generalmente son objetos muy abstractos, como Persona, Figura, Transporte, Animal, Comida, Arte, Operaciones Matemáticas, Lecturas, Ropa, Plantas
*/

package figura;

//Utilizando clases abstractas, evitamos las instancias no necesarias

//Para que una clase se vuelva abstracta, usamos la palabra reservada "abstract" antes de class
public abstract class Figura {
	
	//Declaramos un método abstracto (no tiene cuerpo)
	//Método abstracto que nos dice QUÉ TENEMOS QUE HACER pero NO NOS DICE EL CÓMO
	public abstract double calcularArea();


}
/*
 NOTA: Las clases abstractas pierden la capacidad de instancias.
 Una clase abstracta, necesita sí o sí, métodos abstractos.
 Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los métodos abstractos.
 */
