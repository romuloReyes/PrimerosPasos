package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;
/* Programa para la gestion de facturas de una empresa que se dedica a la venta de azucar.
 * En cada factura se ingresara el codigo del producto vendido, cantidad de kilos vendida y 
 * el total a pagar. Se pedira introducir 5 facturas y se devolveran los siguentes datos: 
 * Facturacion total, cantidad de kilos vendidos y cuantas facturas se emitieron por mas de 
 * 1000. */

public class GestionFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String codigo=" ";
		int kilos=0;
		float precio=0;
		float importeFactura=0;
		float facturacionTotal=0;
		int contador=0;
		int totalKilos=0;
		Scanner sc= new Scanner(System.in);
		
		for (int i=1; i<=5; i++){
			
			System.out.println("Factura N° "+i);
			System.out.println("Codigo del producto: ");
			codigo= sc.next();
			System.out.println("Cantidad en kilos: ");
			kilos=sc.nextInt();
			System.out.println("Precio: ");
			precio=sc.nextFloat();
			importeFactura=kilos*precio;
			facturacionTotal=importeFactura+facturacionTotal;
			totalKilos= kilos + totalKilos;
			
			if(importeFactura>=1000) contador++;
			
		}sc.close();
		
		System.out.println("Detalles de la venta: ");
		System.out.println("Facturacion total: $"+facturacionTotal);
		System.out.println("Total de kilos vendidos: "+totalKilos);

	}

}
