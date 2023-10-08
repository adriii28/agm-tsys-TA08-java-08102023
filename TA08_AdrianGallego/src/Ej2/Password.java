package Ej2;

public class Password {

	private int longitud;
	private String contrasena;
	
	public Password() {
		this.longitud = 8;
		this.contrasena = "";
	}
	

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}

	public static String generarContrasena(int longitud2) {
		//Genera una contraseña con numeros aleatorios
		String contra = "";
		for (int i = 0; i < longitud2; i++) {
			double numRandom = Math.random() * (10 - 1 + 1) + 1;
			numRandom = Math.floor(numRandom);
			contra+= (int)numRandom;
		}
		return contra;
		
	}
	

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasena=" + contrasena + "]";
	}

	
}
