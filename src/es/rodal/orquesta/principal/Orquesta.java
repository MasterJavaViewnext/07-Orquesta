package es.rodal.orquesta.principal;

import java.util.ArrayList;
import java.util.List;

import es.rodal.orquesta.clases.Flauta;
import es.rodal.orquesta.clases.Guitarra;
import es.rodal.orquesta.clases.GuitarraElectrica;
import es.rodal.orquesta.clases.Instrumento;
import es.rodal.orquesta.clases.Tambor;
import es.rodal.orquesta.clases.TipoInstrumento;

/**
 * Clase Orquesta que crea cada uno de los objetos y comprueba el 
 * el correcto funcionamiento del método tocar y aporrear tal y como 
 * se pide en el ejercicio 
 */
public class Orquesta {
	
	public static void main(String[] args) {

		//Creación de cada uno de los objetos almacenados en un array de Instrumentos
		List<Instrumento> instrumentos = new ArrayList<>();
		instrumentos.add(new Flauta());
		instrumentos.add(new Flauta("flauta", TipoInstrumento.Viento, "travesera"));
		instrumentos.add(new Guitarra());
		instrumentos.add(new Guitarra("guitarra", TipoInstrumento.Cuerda, 6));
		instrumentos.add(new GuitarraElectrica());
		instrumentos.add(new GuitarraElectrica("guitarra electrica", TipoInstrumento.Cuerda, 6, 20));
		instrumentos.add(new Tambor());
		instrumentos.add(new Tambor("tambor", TipoInstrumento.Percusion, 2));
		
		
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
