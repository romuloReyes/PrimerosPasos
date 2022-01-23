package reyes.romulo.entradaSalida;

import java.util.Scanner;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce un numero:");
		
		double numero= entrada.nextInt();
				
		System.out.println("la raiz es " + Math.sqrt(numero));
		
		entrada.close();
		
		
	}

}
