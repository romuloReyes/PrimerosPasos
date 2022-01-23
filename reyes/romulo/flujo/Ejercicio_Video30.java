package reyes.romulo.flujo;

import java.util.Scanner;

public class Ejercicio_Video30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero_aleatorio=(int)(Math.random()*100);
		int numero=0;
		int intentos=0;
		
		Scanner entrada= new Scanner(System.in);
		
		while (numero!=numero_aleatorio) {
			intentos++;
			
			System.out.println("Introduce un numero entero entre 1 y 100");
			
			numero=entrada.nextInt();
			
			if(numero>numero_aleatorio) System.out.println("El numero aleatorio es menor");
			if (numero<numero_aleatorio) System.out.println("El numero aleatorio es mayor");
			
		}
		
		System.out.println("¡Correcto!" + " lo intentaste " + intentos + " veces.");
		entrada.close();
		
		

	}

}
