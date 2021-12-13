/*
    Crear un objeto de la clase e inicializarlo.
    Invocar al método volar.
    Imprimir por pantalla la distancia recorrida.
 */

/**
 *
 * @author Juan Francisco Rodriguez Garcia
 */
public class Pajaros {
    public static void main(String[] args){
        double distancia;
        //Instanciación del objeto e inicialización
        Pajaro ave1 = new Pajaro("Gorrion",20,300);
        
        //Se invoca al metodo volar
        distancia = ave1.volar(ave1.posX,ave1.posY);
        
        //Se muestra con un mensaje en pantalla la distacia recorrida con un redondeo al alza.
        System.out.print("La distancia recorrida por el " + ave1.nombre + " es: " + Math.ceil(distancia) + " metros");
    }
}
