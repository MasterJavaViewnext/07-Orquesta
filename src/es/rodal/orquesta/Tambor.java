package es.rodal.orquesta;

/**
 * Clase Tambor que añade una variable tamanho y un método aporrear()
 */
public class Tambor extends Instrumento {
 
	private int tamanho;
	
	public Tambor() {
	}
	
	public Tambor(String nombre, TipoInstrumento tipo, int tamanho) {
		super(nombre, tipo);
		this.tamanho = tamanho;
	}
	
	public void aporrear() {
		System.out.println("Aporreando tambor "+ this.nombre);
	}
}
