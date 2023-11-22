package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardar la fecha
		int dia, mes, anyo;
		
		// Variable en caso de que sea correcta
		boolean esCorrecta;
		
		// Pedimos al usuario la fecha
		System.out.println("Dime el dia, mes y año: ");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anyo = sc.nextInt();
		
		// Llamamos a la función de la otra clase para comprobar si es correcta la fecha
		esCorrecta = CompruebaFecha.esFechaCorrecta(dia, mes, anyo);
		
		// En caso de que sea true mostrmaos un mensaje de que es correcta
		if (esCorrecta) {
			System.out.println("La fecha es correcta");
		  // En caso de que sea false mostramos un mensaje de no es correcta
		} else {
			System.out.println("La fecha es incorrecta");
		}
		
		// Cerramos el scanner
		sc.close();

	}

}
