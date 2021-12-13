import java.util.Scanner;

public class showTruman {
    public static void main (String[] args){
        //Instanciación de la variable entrada
        Scanner entrada = new Scanner(System.in);
        
        //Solicitud por por teclado de la hora en valor numerico entero
        System.out.println("Introduzca la hora (sin minutos:)");
        int hora = entrada.nextInt();
        
        //Estructura condicional compuesta
        if (hora>=7 & hora<=11){
            System.out.println("Buenos días");
        }else if (hora>=12 & hora<=19){
            System.out.println("Buenas tardes");
        }else{
            System.out.println("Buenas noches");
        } 
    }
}