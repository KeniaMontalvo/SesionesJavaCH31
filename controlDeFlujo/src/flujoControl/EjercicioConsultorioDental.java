package flujoControl;
import java.util.Scanner;

public class EjercicioConsultorioDental {
	public static void main(String[] args) {
		
		//Para que el usuario ingrese su información
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe tu edad");
		byte edadDelUsuario = scanner.nextByte();
		scanner.close();
		
		if (edadDelUsuario >= 18) {
			System.out.println("Eres mayor");
		} else {
			System.out.println("No eres mayor");
		}
		
				
		//Condición para determinar si el paciente es mayor o no de edad
		
		byte edad = 18;
		
		if (edad >= 18) {
			System.out.println("Felicidades, ya no necesitas que tu mamá te acompañe a hacer el trámite");
		} else {
			System.out.println("Dile a tu mamá que venga");
		}
		
				
		//Ternario: edad
		
		String resultado = (edad >= 18) ? "Es mayor de edad" : "No es mayor de edad";
		System.out.println("El paciente: " + resultado);
		
		
		//Ternario: pago
		
		boolean pago = true;
		
		String conceptoDePago = (pago) ? "Ya pagó" : "No ha realizado el pago";
		System.out.println("El paciente: " + conceptoDePago);
		
		
	}
}
