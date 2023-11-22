package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variables donde guardaremos el num1 y num2 que introduzca el usuario
		int num1, num2;
		
		// variable dinde guardaremos el resultado de la función "NumeroMaximo"
		int resultado;
		
		// Le pedimos al usuario los dos números
		System.out.println("Dime dos números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Calculamos que número es el máximo y se lo asignamos ala variable "resultado"
		resultado = NumeroMaximo.numeroMaximo(num1, num2);
		
		// Mostramos un mensaje con el número máximo de los 2
		System.out.println("El numero mayor entre " + num1 + " y " + num2 + " es --> " + resultado);
		
		// Cerramos el scanner
		sc.close();

	}

}
