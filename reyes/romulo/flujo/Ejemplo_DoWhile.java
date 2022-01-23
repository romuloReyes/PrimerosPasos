package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra introducida \n" 
				+ "Para salir escribe salir");
		
		String texto="";
		
		do {
			
			texto= JOptionPane.showInputDialog("Introduce el texto");
			
			JOptionPane.showMessageDialog(null, "el texto tiene " + texto.length() + " caracteres.");
			
		} while (!texto.equals("salir"));
		
		System.out.println("has salido del programa");
	
	}

}
