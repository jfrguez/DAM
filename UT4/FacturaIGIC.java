import java.util.Scanner;

public class FacturaIGIC {
    
    //Metodo para calcular el igic
    private static float calculaIgic(float base,int igic){
        float total=0;
        total=(base*igic)/100;
        return total;
    }
    
    public static void main(String[] args){
        
        String tipoIGIC;
        String prom;
        boolean errorIGIC =false, errorDesc = false;
        float base, igic=0, total_IGIC=0, descuento=0, total;
        
        //Instanciación de la variable entrada
        Scanner baseScan = new Scanner(System.in);
        Scanner tipoIGICScan = new Scanner(System.in);
        Scanner promScan = new Scanner(System.in);
        
        //Solicitud por por teclado de la base imponible
        //System.out.print("Introduzca la base imponible: ");
        System.out.println("Introduzca la base imponible: ");
        base = baseScan.nextFloat();
        
        //Solicitud por por teclado de tipo de IGIC
        System.out.println("Introduzca el tipo de IGIC (cero, reducido, general, incrementados, especiales): ");
        tipoIGIC = tipoIGICScan.nextLine();
       // System.out.println(tipoIGIC);
        //Solicitud por por teclado del codigo promocional
        System.out.println("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        prom = promScan.nextLine();
        
        //tipoIGIC=tipoIGIC.toLowerCase();
        
        
        //Se calcula el igic en base a el tipo introducido                
        
        if (tipoIGIC.equals("cero")||tipoIGIC.equals("reducido")||tipoIGIC.equals("general")||tipoIGIC.equals("incrementados")||tipoIGIC.equals("especiales")){        
            if (tipoIGIC.equals("cero")){
                total_IGIC=base;
                igic=0;
            }else if (tipoIGIC.equals("reducido")){
                //igic = (base*3)/100;
                igic = calculaIgic(base,3);
                total_IGIC=base + igic;
            }else if(tipoIGIC.equals("general")){
                igic = calculaIgic(base,7);
                total_IGIC=base + igic;
            }else if(tipoIGIC.equals("incrementados")){
                igic = calculaIgic(base,15);
                total_IGIC=base + igic;
            }else if(tipoIGIC.equals("especiales")){
                igic = calculaIgic(base,20);
                total_IGIC=base + igic;
            }
        }else{
            errorIGIC=true;
            //System.out.println("Tipo de IGIC incorrecto");
        }
       
        
        //Se calcula el importe del descuento                
        if(prom.equals("nopro")){
            descuento=0;
        }else if(prom.equals("mitad")){
            descuento=base / 2;
        }else if(prom.equals("meno5")){
            descuento=base - 5;
        }else if(prom.equals("5porc")){
            descuento=base*5/100;
        }        
       
       
        total = total_IGIC - descuento;
        System.out.println("");
        System.out.println("");
        System.out.println("Base imponible: "+ base);
        System.out.println("IGIC: " + igic);
        System.out.println("Precio con IGIC: " + total_IGIC);
        System.out.println("Cód. promo " + prom +" : " + descuento);
        System.out.println("TOTAL A PAGAR: "+ total);
        
    }
    
    
}