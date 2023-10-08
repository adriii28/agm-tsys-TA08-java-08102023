package Ej3;

import Ej3.Electrodomestico.colores;
import Ej3.Electrodomestico.consumo;

public class Ejercicio3App {
	public static void main(String[] args) {
		Electrodomestico e1 = new Electrodomestico();
		System.out.println(e1);
		
		Electrodomestico e2 = new Electrodomestico(200, 350);
		System.out.println(e2);
		
		Electrodomestico e3 = new Electrodomestico(400, colores.azul, consumo.B, 150);
		System.out.println(e3);

	}
}
