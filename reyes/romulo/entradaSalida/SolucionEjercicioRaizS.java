package reyes.romulo.entradaSalida;

import javax.swing.*;

public class SolucionEjercicioRaizS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double resultado= Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Introduce una base")), 
				Integer.parseInt(JOptionPane.showInputDialog("Introduce un exponente")));
		
		System.out.println("El resultado es: " + resultado);
		

	}

}
