package es.rodal.orquesta.clases;

/**
 * Clase Guitarra que extiende de Instrumento y de la que hereda 
 * GuitarraElectrica, solo añade una variable nCuerdas
 */
public class Guitarra extends Instrumento {
	
	protected int nCuerdas;
	
	public Guitarra() {
	}
	
	public Guitarra(String nombre, TipoInstrumento tipo, int nCuerdas) {
		super(nombre, tipo);
		this.nCuerdas = nCuerdas;
	}

}
