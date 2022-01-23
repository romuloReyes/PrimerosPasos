package reyes.romulo.arrays;

import java.util.Scanner;

public class Ejercicios_video38_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int media=0;
		int pares=0;
		
		System.out.println("Introduce 10 numeros enteros");
		Scanner entrada= new Scanner(System.in);
		
		int[] numeros= new int[10];
		
		for(int i=0; i<10; i++) {
			
			numeros[i]=entrada.nextInt();
			
		}
		
		for(int z=0; z<10; z++) {
			
			if(z%2==0 && z!=0) {
				pares++;
				media=media+numeros[z];
			}
		}
		entrada.close();
		
		System.out.println("la media de las posiciones pares del array es: " + media/pares);

	}

}
