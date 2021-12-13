/*
1.º Definir a la clase Película con los atributos título, director, categoría y duración.
*/

/**
 * @author Juan Francisco Rodríguez García
 */

//Creacion de la clase con los atributos pedidos
public class Pelicula{
    private String titulo;
    private String director;
    private String categoria;
    private int duracion;

    //Constructor de la clase pelicula
    public Pelicula(String titulo, String director, String categoria, int duracion){
    	this.titulo = titulo;
    	this.director = director;
    	this.categoria = categoria;
    	this.duracion = duracion;
    }
    
    //Metodo para mostrar el objeto de forma ordenada
    public String toString(){
    	return "Título: " + this.titulo + "\n" + "Director: " + this.director + "\n" + "Categoría: " + this.categoria + "\n" + "Duración: " + this.duracion + " minutos"; 
    }
}