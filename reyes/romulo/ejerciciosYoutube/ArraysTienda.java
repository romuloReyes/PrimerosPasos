package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;
public class ArraysTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		double [] ventas= new double [12];
		
		System.out.println("Ingrese las 12 ventas del mes:");
		
		for(int i=0; i<ventas.length; i++) {
			
			System.out.println("venta " + (i+1));
			ventas[i]=sc.nextDouble();
			
		}sc.close();
		
		System.out.println("ventas mayores o iguales a 2000: ");
		int k=0;
		int total=0;
		
		while (k<12) {
			
			if(ventas[k]>=2000) {
				System.out.println(ventas[k]);
			
				total++;
			
			}
			
			k++;
		}
		
		System.out.println("El total de ventas mayores a 2000 es: " + total);

	}

}
