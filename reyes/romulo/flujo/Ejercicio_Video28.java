package reyes.romulo.flujo;

import java.util.Scanner;

public class Ejercicio_Video28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		double base=0;
		double altura=0;
		double radio=0;
		
		System.out.println("¿Que figura geometrica desea calcular el area?");
		System.out.println("cuadrado= 1, rectangulo= 2, triangulo= 3, circulo= 4");
		
		int figura= Integer.parseInt(entrada.next());
		
		switch(figura) {
		
		case 1: 
			System.out.println("introdusca el valor de la base");
			base= Integer.parseInt(entrada.next());
			System.out.println("El area del cuadrado es: " + (base*base));
			break;
			
		case 2:
			System.out.println("introdusca el valor de la base");
			base= Integer.parseInt(entrada.next());
			System.out.println("introdusca el valor de la altura");
			altura= Integer.parseInt(entrada.next());
			System.out.println("El area del rectangulo es: " + (base*altura));
			break;
		
		case 3:
			System.out.println("introdusca el valor de la base");
			base= Double.parseDouble(entrada.next());
			System.out.println("introdusca el valor de la altura");
			altura= Integer.parseInt(entrada.next());
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
			
		case 4:
			System.out.println("introdusca el valor del radio");
			radio= Double.parseDouble(entrada.next());
			System.out.println("El area del circulo es: " + (3.1416*radio*radio));
			break;
			
		}
		
		entrada.close();
		
		
	}

}
