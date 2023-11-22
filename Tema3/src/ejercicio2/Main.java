package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dime dos números:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("Los numeros entre los dos números son: ");
		MostrarNumeros.mostrarNumeros(num1, num2);
		
		sc.close();

	}

}
