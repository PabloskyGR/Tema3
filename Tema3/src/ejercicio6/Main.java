package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int opc;
		
		double radio, altura;
		
		double resultado;
		
		System.out.println("Que quieres calcular, el área(1) o el volumen(2)");
		opc = sc.nextInt();
		
		System.out.println("Dime el radio");
		radio = sc.nextDouble();
		
		System.out.println("Dime la altura");
		altura = sc.nextDouble();
		
		resultado = Cilindro.areaVolumen(opc, radio, altura);
		
		System.out.println(resultado);
		
		sc.close();

	}

}
