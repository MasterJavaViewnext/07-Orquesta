package es.rodal.orquesta.clases;

/**
 * Clase instrumento de la que heredarán el resto
 * Dejo comentado el constructor y la otra forma de expresar el metodo tocar()
 * decidí usar el nombre de la clase y no la variable ya que me parece mas interesante
 */
public abstract class Instrumento {
	
	protected String nombre;
	protected TipoInstrumento tipo;

	public Instrumento() {
	}
	
	public Instrumento(String nombre, TipoInstrumento tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public void tocar() {
		if (this.nombre != null) {
			System.out.println("Tocando el instrumento "+ this.nombre);	
		} else {
			System.out.println("Tocando el instrumento "+ this.getClass().getSimpleName());
		}
		
	}
	
	public void afinar() {
		System.out.println("Afinando el instrumento el instrumento "+ this.getClass().getSimpleName());
	}
}
