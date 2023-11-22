package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos el número que introduzca el usuario
		int num;
		
		// Le pedimos al usuario el número que quiere la tabla de multiplicar
		System.out.println("Dime que tabla de multiplicar quieres saber");
		num = sc.nextInt();
		
		// Mensaje antes de mostrar la tabla
		System.out.println("Tabla de multiplicar del " + num);
		
		// Mostramos la tabla
		TablaMultiplicar.tablaMultiplicar(num);
		
		// Cerramos el scanner 
		sc.close();

	}

}
