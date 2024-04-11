package es.rodal.orquesta;

public class Flauta extends Instrumento {
	
	private String modelo;
	/*
	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}
	*/
	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando");
	}
	
	
}
