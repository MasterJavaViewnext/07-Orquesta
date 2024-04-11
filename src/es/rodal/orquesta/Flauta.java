package es.rodal.orquesta;

/**
 * Clase Flauta que extiende de Instrumento y sobreescribe el método
 * tocar() añadiendo una linea
 */
public class Flauta extends Instrumento {
	
	private String modelo;
	
	public Flauta() {
	}
	
	public Flauta(String nombre, TipoInstrumento tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}
	
	/**
	 * Añado la palabra soplar en la siguiente linea a la que imprime 
	 * el método tocar() de la clase padre Instrumento
	 */
	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando");
	}
	
	
}
