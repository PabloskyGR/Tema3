package ejercicio2;

public class MostrarNumeros {
	
	public static void mostrarNumeros(int num1, int num2) {
		
		if (num1 < num2) {
		for (int i = num1 + 1; i < num2; i++ ) {
			System.out.println(i);
		}
		} else {
			for (int i = num2 + 1; i < num1; i++ ) {
				System.out.println(i);
			}
		}
	}

}
