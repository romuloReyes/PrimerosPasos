package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;
//Programa que pide capturar numeros positivos y calcular la media. El programa finaliza al 
//introducir un numero negativo.

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0, suma=0, cantidadNum=0;
		double media=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero(positivo)");
		numero=sc.nextInt();
		while(numero>0) {
			suma=suma+numero;
			cantidadNum++;
			
			System.out.println("introduce el siguente numero");
			numero=sc.nextInt();
		}sc.close();
		
		if(numero<0) {
			media=suma/cantidadNum;
			System.out.println("La media de los numeros introducidos es: " + media + ".");
		}

	}

}
