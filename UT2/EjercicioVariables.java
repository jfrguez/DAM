/**
 * Modificaciones al programa PROG02_Ejer02
 * @author Juan Francisco Rodríguez García
 */
public class EjercicioVariables {
    //c. Día de la semana
    //public enum diasem {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domigo};
    
    public static void main(String args[]) {
        //a. Si un empleado está casado o no.
	boolean casado = true;
       
        // b. Valor máximo no modificable: 999999.
        int MAXIMO = 999999;

	//c. Dia de la semana
        short diasem = 1;

        //d. Día del año.
	short diaanual = 300;

	//e. Sexo: con dos valores posibles 'V' o 'M'
	char sexo = 'M';

        //f. Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
        long miliseg = 1298332800000; //1,2983×10¹²

        //g. Almacenar el total de una factura
        float totalFactura = 10350.678;

        //h. Población mundial del planeta tierra. 
        int poblacion = 6775235741;
        
        System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.println("El valor de la variable casado es" + casado);
        System.out.println("El valor de la variable MAXIMO es" + MAXIMO);
        System.out.println("El valor de la variable diasem es" + diasem);
        System.out.println("El valor de la variable diaanual es" + diaanual);
        System.out.println("El valor de la variable miliseg es" + miliseg);
        System.out.println("El valor de la variable totalfactura es" + totalFactura);
        System.out.println("El valor de la variable poblacion es" + poblacion);
        System.out.println("El valor de la variable sexo es" + sexo);
        
        
        System.out.print("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.print("\n El valor de la variable casado es" + casado);
        System.out.print("\n El valor de la variable MAXIMO es" + MAXIMO);
        System.out.print("\n El valor de la variable diasem es" + diasem);
        System.out.print("\n El valor de la variable diaanual es" + diaanual);
        System.out.print("\n El valor de la variable miliseg es" + miliseg);
        System.out.print("\n El valor de la variable totalfactura es" + totalFactura);
        System.out.print("\n El valor de la variable poblacion es" + poblacion);
        System.out.print("\n El valor de la variable sexo es" + sexo);
        
        
        System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
        System.out.printf("El valor de la variable casado es %b%nd", casado);
        System.out.printf("El valor de la variable MAXIMO es %d", MAXIMO);
        System.out.printf("El valor de la variable diasem es %d", diasem);
        System.out.printf("El valor de la variable diaanual es %d", diaanual);
        System.out.printf("El valor de la variable miliseg es %d", miliseg);
        System.out.printf("El valor de la variable totalfactura es %f", totalFactura);
        System.out.printf("El valor de la variable poblacion es %d", poblacion);
        System.out.printf("El valor de la variable sexo es %c", sexo);
    }
}
