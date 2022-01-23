package reyes.romulo.ejerciciosYoutube;

import java.util.Scanner;

public class ArraysDatoMayor {
	
	public static void main (String[]args) {
		
		int [] numeros= new int[5];
		
		int numeroMayor= numeros[0];
		
		System.out.println("Ingrese los 5 numeros: ");
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<numeros.length; i++) {
			
			numeros[i]=sc.nextInt();
			
			if (numeros[i]>numeroMayor) numeroMayor=numeros[i];
				
		}sc.close();
		
		System.out.println("El numero mayor es: " + numeroMayor);
		
	}

}
