package es.rodal.orquesta;

public class Tambor extends Instrumento {
 
	private int tamanho;
	/*
	public Tambor(String nombre, String tipo, int tamanho) {
		super(nombre, tipo);
		this.tamanho = tamanho;
	}
	*/
	
	public void aporrear() {
		System.out.println("Aporreando tambor "+ this.getClass().getSimpleName());
	}
}
