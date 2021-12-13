import java.util.Scanner;
import java.lang.Math;
        
public class CajaFuerte {
    public static void main(String[] args){
        
        //Se genera un número aleatorio
        int combinacion = (int) (Math.random()*(999-1+1)+1);
        int cont=1, intento=0;
        boolean acierto = false;
        Scanner entrada = new Scanner(System.in);
        //System.out.print(combinacion);
        System.out.println("La combinacion: "+combinacion);
        //Estructura iterativa que permite 5 intentos
        do{
            System.out.println("\n\nIntroduzca la combinacion: ");
            intento = entrada.nextInt();
            System.out.println(cont);
            cont++;

            if(combinacion == intento){
                acierto=true;
                System.out.print("\nLa caja fuerte se ha abierto satisfactoriamente");
                //break;
            }else{
                System.out.print("\nLo siento, esa no es la combinación");
            }
            
      //  }while ((cont<=5)|(!acierto));
        }while ((!acierto)&&(cont<=5));
       // }while (!acierto);
        // System.out.print("\nTEST");
    }
}
