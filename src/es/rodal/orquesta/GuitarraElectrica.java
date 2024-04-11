package es.rodal.orquesta;

/**
 * Clase GuitarraElectrica que extiende de Guitarra que a su vez extiende 
 * de Instrumento. Esta clase añade una variable potencia y sobrescribe 
 * el método tocar sustituyendo la linea por otra diferente
 */
public class GuitarraElectrica extends Guitarra {

	private int potencia;
	
	public GuitarraElectrica() {
	}
	
	public GuitarraElectrica(String nombre, TipoInstrumento tipo, int nCuerdas, int potencia) {
		super(nombre, tipo, nCuerdas);
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra electrica");
	}
	
	
}
