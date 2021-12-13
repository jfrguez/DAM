class CAritmetica_3operandos
{
/*
*Operaciones aritméticas
*/
public static void main(String[] args)
{
	/*
	Definimos tres variables (cajas) llamadas dato1, dato2, resultado
	que es donde vamos a guardar los valores con los que vamos a trabajar
	int nos idica que esas variables (cajas) solo pueden entrar números enteros
	*/
	int dato1, dato2, dato3, resultado;

	// Una vez definidas las variables les asignamos un valor
	dato1 = 20;
	dato2 = 10;
	dato3 = 10;

	//Definimos la suma
	resultado = dato1 + dato2 + dato3; 

	/* Sacamos por pantalla el mensaje. Fíjarte como podemos mostrar por
	pantalla tanto los valores de las variables
	como las letras y simbolos. Y fíjate como puedes concatenar ese mensaje con el +
	Otro detalle a tener en cuenta es el uso de comillas dobles para los
	caracteres y letras*/
	System.out.println(dato1 + " + " + dato2 + " + " + dato3 + " = " + resultado);

	//Realiza la resta de la misma forma que la suma
	resultado = dato1 - dato2 - dato3;
	System.out.println (dato1 + " - " + dato2 + " - " + dato3 + " = " + resultado);

	//Realiza el producto
	resultado = dato1 * dato2 * dato3;
	System.out.println (dato1 + " * " + dato2 + " * " + dato3 + " = " + resultado);

	//Realiza el cociente
	resultado = dato1 / dato2 / dato3;
	System.out.println (dato1 + " / " + dato2 + " / " + dato3 + " = " + resultado);
	}
}