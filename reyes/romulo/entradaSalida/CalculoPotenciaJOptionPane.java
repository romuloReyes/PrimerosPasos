package reyes.romulo.entradaSalida;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String base= JOptionPane.showInputDialog("Introduce el valor de la base");
		
		double base2= Integer.parseInt(base);
		
		String exponente= JOptionPane.showInputDialog("Introduce el valor del exponente");
		
		double exponente2= Integer.parseInt(exponente);
		
		System.out.println("El resultado es " + Math.pow(base2, exponente2));
		
		
		

	}

}
