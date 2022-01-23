package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Condicional_Switch_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hijos= Integer.parseInt(JOptionPane.showInputDialog("Introduce n° de hijos"));
		
		switch (hijos) {
		
		case 0:
			
			System.out.println("tranquilo, tener hijos no es una obligacion");
			break;
			
		case 1:
			
			System.out.println("Preparate para que puedas educarlo bien");
			break;
			
		case 2:
			
			System.out.println("¿quieres tener otro?");
			break;
			
		case 3:
			
			System.out.println("ya con esos esta bien");
			break;
			
		case 4:
			
			System.out.println("familia numerosa");
			break;
		
		default: 
			
			System.out.println("ya parale");
		}

	}

}
