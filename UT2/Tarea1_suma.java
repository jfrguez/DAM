
import java.util.Scanner;

/**
 * Nuestra siguiente aplicación lee (o recibe como entrada) dos enteros que el
usuario tiene que introducir mediante el teclado y guardar en sus variables
correspondientes.
b. Después calcula la suma de los valores en su variable correspondiente.
c. Muestra el resultado mediante printf. 
 * 
 * @author juan
 */
public class Tarea1_suma {

    public static void main(String args[]) {

        // Creación de las variables
        int num1=0;
        int num2=0;
        int suma=0;

        System.out.println("Introduzca el primer número entero:");
        Scanner entrada = new Scanner(System.in); //Declaración del objeto entrada
        num1 = entrada.nextInt(); //Almacena el valor del primer número en la variable
        
        System.out.println("Introduzca el segundo número entero:");
        num2 = entrada.nextInt(); //Almacena el valor del primer número en la variable
        
        suma = num1 + num2;
        System.out.printf("La suma de los enteros %d y %d es: %d", num1, num2, suma);
    }
}
