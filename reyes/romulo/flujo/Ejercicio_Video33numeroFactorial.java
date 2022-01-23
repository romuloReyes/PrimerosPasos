package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Video33numeroFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		long numero_factorial=numero;
		
		for (int i=numero-1; i>0;i--) {
			
			numero_factorial=numero_factorial*i;
			
		}
		
		System.out.println("El numero factorial es: " + numero_factorial);
		
	}

}
