/*Deberás crear una clase Aparcamiento. Que lleve el control del número de plazas disponibles mediante el número de "totalocupados".

La clase aparcamiento además tendrá un estado que será libre u ocupado

El constructor debrá tener como única entrada el número máximo de plazas de aparcamiento (numplazas)

Como métodos generaras :

    un método toString que devolverá el texto (Garage, numero de plazas , ocupado o libre) por ejemplo (Garage 3 , ocupado)
    gettotalGarages que nos dirá el número de plazas totales del garage
    getTotalocupados que nos dirá el número de plazas ocupadas del garage
    entraCoche que cambiará el número de plazas ocupadas, cambiará el estado si es necesario e indicará si el aparcamiento está lleno.

Probar con un aparcamiento de 3 plazas y meter 3 y 4 coches.


Entregar el código correspondiente en la caja detexto de entrada y/o en archivo de texto adjunto de este ejercicio.

Aunque no lo creas ya hiciste un ejercicio muy muy parecido.*/


public class Aparcamiento{
	//Declaracion de variables
	private static int numplazas = 0;
	private static int totalocupados = 0;
	private String estado;
	
	//constructor
	public Aparcamiento(int numplazas){ 
		this.numplazas = numplazas;
		this.estado = "Libre";
    }
	
	public String toString(){
		return "(Garaje " + this.numplazas + " , " + this.estado + ")";	
	}
	
	//Metodo que devuelve el número de plazas totales.
	public static int gettotalGarages(){
		return Aparcamiento.numplazas;
	}
	//Metodo que devuelve el total de plazas ocupadas.
	public static int getTotalocupados(){
		return Aparcamiento.totalocupados;
	}
	
	//Metodo que incrementa el total ocupados cuando entra coche y controla el aforo total
	public void entraCoche(){
		Aparcamiento.totalocupados++;
		if (Aparcamiento.totalocupados == numplazas){
			this.estado = "Ocupado";
		}
	}
}