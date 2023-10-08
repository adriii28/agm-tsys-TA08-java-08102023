package Ej1;

import Ej1.Persona.sexo;

public class Ejercicio1App {
	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		System.out.println(p1);

		Persona p2 = new Persona("Paco",33,sexo.H);
		System.out.println(p2);
		
		Persona p3 = new Persona("Adri",20,"123123123A",sexo.H,70,1.75);
		System.out.println(p3);

		
	}
}
