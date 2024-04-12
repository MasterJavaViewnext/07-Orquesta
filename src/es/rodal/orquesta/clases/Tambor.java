package es.rodal.orquesta.clases;

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
		if (this.nombre != null) {
			System.out.println("Aporreando tambor "+ this.nombre);
		} else {

			System.out.println("Aporreando tambor "+ this.getClass().getSimpleName());
		}
	}
}
