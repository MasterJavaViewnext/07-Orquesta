package es.rodal.orquesta;

/**
 * Clase Orquesta que crea cada uno de los objetos y comprueba el 
 * el correcto funcionamiento del método tocar y aporrear tal y como 
 * se pide en el ejercicio 
 */
public class Orquesta {
	
	public static void main(String[] args) {

		//Creación de cada uno de los objetos almacenados en un array de Instrumentos
		Instrumento[] instrumentos = {
				new Flauta(),
				new Guitarra(),
				new GuitarraElectrica(),
				new Tambor("tambor", TipoInstrumento.Percusion, 2)
		};
		
		//Bucle en el que llamo al metodo tocar() a menos que el instrumento sea un Tambor
		for (Instrumento instrumento : instrumentos) {
			System.out.println("-------------------------");

			//Comprobacion con API reflection
			if(instrumento.getClass() == Tambor.class) {
			//if (instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			} else {
				instrumento.tocar();
			}
		}
	}
}
