public class Pizza {
    private String size;
    private String type;
    private String state;
    private static int totalRequested; //al poner static no se puede modificar el valor fuera del método
    private static int totalServed;

    //CONSTRUCTOR
    public Pizza(String type, String size){
    	this.type = type;
    	this.size = size;
	this.state = "pedida";
	Pizza.totalRequested++; //Se indica la clase (Pizza), debido a que la variable es estática
    }

//METODOS
/*
El metodo toString formatea la salida a mostrar 
el objeto al solicitar el System.out.println(objeto)
*/
    public String toString(){
	return "pizza " + this.type + " " + this.size + ", " + this.state;
    }

    public void sirve(){
	if (this.state.equals("pedida")){
            this.state = "servida";
            Pizza.totalServed++;
	}
	else {
            System.out.println("La pizza ya se ha servido");
	}
	}

    public static int getTotalPedidas(){
        return Pizza.totalRequested;
    }
	
    public static int getTotalServidas(){
	return Pizza.totalServed;
    }

}
