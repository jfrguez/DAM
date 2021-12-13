/*
2º A continuación creamos varios objetos de esta clase. (4 al menos)
*/

/**
 * @author Juan Francisco Rodríguez García
 */
public class Peliculas{
    public static void main(String[] args){

	//Creación de los objetos de tipo Pelicula
	Pelicula peli1 = new Pelicula("2001: A Space Odyssey","Stanley Kubrick","Ciencia ficción", 142);
	Pelicula peli2 = new Pelicula("Blade Runner","Ridley Scott","Ciencia ficción", 117);
	Pelicula peli3 = new Pelicula("Spaceballs","Mel Brooks","Comedia", 96); 
	Pelicula peli4 = new Pelicula("El pianista","Roman Polanski","Drama", 151);
	
	//Se muestra en pantalla a modo de ejemplo el objeto peli1
	System.out.println(peli1);
    } 
}