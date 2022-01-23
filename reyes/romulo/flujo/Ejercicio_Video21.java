package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Video21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura_cm=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm, por favor."));
		
		String sexo=JOptionPane.showInputDialog("Introduce tu genero, por favor.");
		
		if (sexo.equals("Hombre") || sexo.equals("hombre")) JOptionPane.showMessageDialog(null, "Tu peso idea es: " + (altura_cm - 110) + " kg");
			
		if (sexo.equals("Mujer") || sexo.equals("mujer")) JOptionPane.showMessageDialog(null, "Tu peso ideal es: " + (altura_cm - 120) + " kg");

	}

}
