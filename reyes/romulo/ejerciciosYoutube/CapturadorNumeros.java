package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;

public class CapturadorNumeros {
	/*Has un rograma para capturar numeros enteros, sumarlos y mostrar el resultado en consola. 
	 Debe finalizarse al introducir el cero. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=0, suma=0;
		Scanner sc= new Scanner(System.in);
		
		do {
			
			System.out.println("Introduce un numero: ");
			numero= sc.nextInt();
			suma= suma+numero;
			
		}while (numero!=0);
		
		sc.close();
		
		System.out.println("La suma de todos los numeros es: " + suma);

	}

}
