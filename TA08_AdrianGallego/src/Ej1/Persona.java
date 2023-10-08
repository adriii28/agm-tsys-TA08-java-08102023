package Ej1;

public class Persona {
	
	
	private String nombre;
	private int edad;
	private String dni;
	private sexo sexo;
	private double peso;
	private double altura;
	
	public enum sexo {H,M}

	final sexo SEXO_POR_DEFECTO = sexo.H;
	
	public Persona () {
		
	}
	
	

	public Persona(String nombre, int edad, Persona.sexo sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = "111222333B";
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}



	public Persona(String nombre, int edad, String dni, Ej1.Persona.sexo sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	

}
