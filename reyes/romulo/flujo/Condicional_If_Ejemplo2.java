package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Condicional_If_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor."));
		
		if (edad<18) {
			
			System.out.println("Eres un jamoncito");
		}else if(edad<40) {
			
			System.out.println("eres joven");
			
		}else if(edad<65) {
			
			System.out.println("eres mayor");
			
		}else {
			
			System.out.println("eres adulto mayor");
		}

	}

}
