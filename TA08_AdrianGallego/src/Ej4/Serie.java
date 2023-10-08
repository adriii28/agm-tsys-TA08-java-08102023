package Ej4;

public class Serie {
	
	final int NUM_TEMPORADAS_BASE = 3;
	final boolean ENTREGADO_BASE = false;
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}


	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = creador;
	}


	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = ENTREGADO_BASE;
		this.genero = genero;
		this.creador = creador;
	}


	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}
	
	
	
	

}
