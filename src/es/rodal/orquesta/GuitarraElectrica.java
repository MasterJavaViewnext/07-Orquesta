package es.rodal.orquesta;

public class GuitarraElectrica extends Guitarra {

	private int potencia;
	/*
	public GuitarraElectrica(String nombre, String tipo, int nCuerdas, int potencia) {
		super(nombre, tipo, nCuerdas);
		this.potencia = potencia;
	}
	*/

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra electrica");
	}
	
	
}
