package ejercicio4;

public class CompruebaVocal {
	
	public static boolean compruebaVocal(String caracter) {
		boolean res = false;
		switch(caracter) {
		
		case "A","a","E","e","I","i","O","o","U","u":
			res = true;
		}
		return res;
	}

}
