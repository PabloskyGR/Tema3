package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Dime un número:");
		num = sc.nextInt();
		
		Eco.eco(num);
		
		sc.close();
		

	}

}
