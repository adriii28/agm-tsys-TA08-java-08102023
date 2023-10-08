package Ej3;

public class Electrodomestico {
	
	final double PRECIO_BASE = 100;
	final colores COLOR_BASE = colores.blanco;
	final consumo CONSUMO_BASE = consumo.F;
	final double PESO_BASE = 5;

	
	private double precio;
	private colores color;
	private consumo consumoEnergetico;
	private double peso;
	
	public enum consumo {
		A,B,C,D,E,F
	}
	
	public enum colores {
		blanco,negro,rojo,azul,gris
	}

	public Electrodomestico() {
		this.precio = PRECIO_BASE;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.peso = PESO_BASE;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.peso = peso;
	}

	public Electrodomestico(double precio, colores color, consumo consumoEnergetico, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico
				+ ", peso=" + peso + "]";
	}

	
}
