package ejercicio6;

public class Cilindro {
	
	// Función donde calcularemos el area y el volumen
	public static double areaVolumen (int opc, double radio, double altura) {
		// Variable donde inicializaremos el resultado
		double res = 0;
		
		// Usamos un switch para hacer el area o el volumen
		switch(opc) {
		case 1: res = 2 * Math.PI * radio * (altura + radio);
		case 2: res = Math.PI * Math.pow(radio, 2) * altura;
		}
		
		// Devolvemos la solución
		return res;
	}

}
