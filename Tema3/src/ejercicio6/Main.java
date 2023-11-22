package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);
		
		// Variable donde guardaremos la opción que quiera hacer el usuario
		int opc;
		
		// Variable donde guardaremos el radio y la altura del cilindro
		double radio, altura;
		
		// variable donde guardaremos el resultado del área o del volumen
		double resultado;
		
		// Le pedimos al usuario que quiere calcular
		System.out.println("Que quieres calcular, el área(1) o el volumen(2)");
		opc = sc.nextInt();
		
		// Le pedimos al usuario el radio del cilindro
		System.out.println("Dime el radio");
		radio = sc.nextDouble();
		
		// Le pedimos al usuario la altura del cilindro
		System.out.println("Dime la altura");
		altura = sc.nextDouble();
		
		// Llamamos a la función para calcular el área o el volumen
		resultado = Cilindro.areaVolumen(opc, radio, altura);
		
		// Mostramos el resultado
		System.out.println(resultado);
		
		// Cerramos el scanner
		sc.close();

	}

}
