package Animal;

public class Perro extends Animal { //Herencia de la clase superior Animal
		
		/*
		 "Polimorfear" o sobreescribir el método heredaod. 
		 */
	
		@Override //con la anotación @Override, le decimos a Java que el método hacerSonido será sobreescrito
		public void hacerSonido() {
			System.out.println("El perrito ladra y hace guau");
		} //método hacerSonido heredado de Animal
		
		
		
		public static void main(String[] args) {
			
			//Aquí NO hay polimorfismo, ya que instancio un Animal genérico y utilizo su método hacerSonido
			Animal Generico = new Animal(); //Genera un animal genérico (abstracto)
			Generico.hacerSonido(); //antes de la ejecución
			
			
			
			//Generar la instancia de mi perrito
			//SÍ hay polimorfismo porque es el equivalente a decir "instancio un animal que es un perrito"
			//Referencias primero la clase general y luego la instancia particular, permite el polimorfismo
			Animal Chilaquil = new Perro();
			Chilaquil.hacerSonido(); //Polimorfismo en tiempo de ejecución
			
		} //método main

}
