package ejercicio3;

public class NumeroMaximo {
	
	// Función para calcular el número maximo
	public static int numeroMaximo(int num1, int num2) {
		
		int resultado = 0;
		
		if(num1 > num2) {
			resultado = num1;
		} else {
			resultado = num2;
		}
		
		return resultado;
	}

}
