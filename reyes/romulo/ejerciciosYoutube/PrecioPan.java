package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;

public class PrecioPan {
/*Cada pieza de pan tendra un precio de $5.
  si el cliente compra mas de 50 piezas, le costara $4.50 cada una.
  si el cliente compra mas de 100 piezas, le costara $4 cada una.
  el programa debe pedir la cantidad de piezas que el cliente va a comprar y cuanto debe pagar.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int piezas=0;
		double pagoTotal=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("¿Cuantas piezas de pan va a comprar el cliente? ");
		piezas=sc.nextInt();
		
		sc.close();
		
		if(piezas>=50 && piezas<100) pagoTotal=piezas*4.5;
		else if(piezas>=100) pagoTotal=piezas*4;
		else pagoTotal=piezas*5;
		
		System.out.println("El pago total por "+ piezas +" piezas es: " +"$" +pagoTotal);

	}

}
