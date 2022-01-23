package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave= "Romulo";
		String acceso= "";
		
		while (!clave.equals(acceso)) {
			
			acceso=JOptionPane.showInputDialog("Introduce la clave de acceso");
			
			if(!clave.equals(acceso)) {
				System.out.println("La clave es incorrecta");
			}
		}
		
		System.out.println("Bienvenido a area de usuario");
	}

}
