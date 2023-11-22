package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el caracter que introduzca el usuario
		String caracter;
		
		// Variabel donde guardaremos un tipo boolean donde diremos si es true o false
		boolean esVocal;
		
		// Le pedimos al usuario un carácter
		System.out.println("Introduce un carácter: ");
		caracter = sc.next();

		// Llamamos a la función para comprobar si es una vocal o no
		esVocal = CompruebaVocal.compruebaVocal(caracter);
		
		// En caso de que la vocal sea true mostramos un mensaje de que es una vocal
		if(esVocal) {
			System.out.println("Es una vocal");
		  // En caso de que la vocal sea false mostramos un mensaje de que no es una vocal
		} else {
			System.out.println("No es una vocal");
		}
		
		// Cerramso el scanner
		sc.close();
		
	}

}
