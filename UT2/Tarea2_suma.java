
import java.util.Scanner;

/**
Repite el ejercicio pero leyendo desde teclado mediante el método nextLine().
a. Usa Integer.parseInt( nombreDeVariable) para cambiar el tipo de variable.
b. Prueba a sumar 7 y 3
c. Prueba a sumar 7 y 2.5
d. Prueba a sumar 7 y la letra “F” 
 * 
 * @author Juan Francisco Rodríguez García 
 */
public class Tarea2_suma {

    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in); //Declaración del objeto entrada
        
        System.out.println("Introduzca el primer número entero:");
        String num1 = entrada.nextLine(); //Almacena el primer valor en la variable
        
        System.out.println("Introduzca el segundo número entero:");
        String num2 = entrada.nextLine(); //Almacena el segundo valor en la variable
        
        int suma =  Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.printf("La suma es: %d", suma);
    }
}
