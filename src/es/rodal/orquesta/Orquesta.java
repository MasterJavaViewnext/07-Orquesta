package es.rodal.orquesta;

public class Orquesta {
	
	public static void main(String[] args) {

		Instrumento[] instrumentos = {
				new Flauta(),
				new Guitarra(),
				new GuitarraElectrica(),
				new Tambor()
		};
		
		for (Instrumento instrumento : instrumentos) {
			System.out.println("-------------------------");
			if (instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			} else {
				instrumento.tocar();
			}
		}
	}
}
