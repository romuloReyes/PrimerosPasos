package reyes.romulo.ejerciciosYoutube;
/*Programa que pide 10 numeros, muestra el promedio de los positivos y negativos he indica cuantos ceros fueron
 ingresados*/

import java.util.Scanner;
public class PromedioPositivosNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=0, cantidadNegativos=0, cantidadPositivos=0;
		double ceros=0, sumaPositivos=0, sumaNegativos=0; 
		double promedioPositivos=0, promedioNegativos=0;
		int k=0;
		
		while(k<10) {
		
			System.out.println("Introduce un numero ");
			num=sc.nextInt();
			
			if(num==0)ceros++;
			else if(num>0) {
				sumaPositivos=sumaPositivos+num;
				cantidadPositivos++;
			}
			else {
				sumaNegativos=sumaNegativos+num;
				cantidadNegativos++;
			}
			k++;
		
		}sc.close();
		
		System.out.println("Se ingresaron "+ceros+"ceros.");
		if(cantidadPositivos==0) System.out.println("no se ingresaron numeros positivos.");
		else {
			promedioPositivos=(sumaPositivos/cantidadPositivos);
			System.out.println("Se ingresaron "+cantidadPositivos+" numeros positivos y su promedio es: "+
			promedioPositivos);
		}
		if(cantidadNegativos==0) System.out.println("No se ingresaron numeros negativos.");
		else {
		promedioNegativos=sumaNegativos/cantidadNegativos;
		System.out.println("Se ingresaron "+cantidadNegativos+" numeros negativos y su promedio es: "+
		promedioNegativos);
		}	
	}

}
