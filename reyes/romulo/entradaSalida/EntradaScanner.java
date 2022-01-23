package reyes.romulo.entradaSalida;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad= entrada.nextInt();
		
		System.out.println("Introduce tu nombre, por favor.");
		
		entrada.nextLine();
		
		String nombre= entrada.nextLine();
		
		
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");
		
		entrada.close();
		
		

	}

}
