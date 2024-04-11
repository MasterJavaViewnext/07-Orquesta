package es.rodal.orquesta;

public class Instrumento {
	protected String nombre;
	private String tipo;
	/*
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	*/
	public void tocar() {
		System.out.println("Tocando el instrumento "+ this.getClass().getSimpleName());
	}
	
	public void afinar() {
		System.out.println("Afinando el instrumento el instrumento "+ this.getClass().getSimpleName());
	}
}
