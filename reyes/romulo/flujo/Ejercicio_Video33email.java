package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class Ejercicio_Video33email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean valid=false;
		
		int arroba=0;
		
		boolean punto=false;
		
		do {
			String correo=JOptionPane.showInputDialog("introduce tu correo");
			
			for(int i=0;i<correo.length();i++) {
				
				if(correo.charAt(i)=='@')arroba++;
				if(correo.charAt(i)=='.')punto=true;
				
			}
			
			if(arroba== 1 && punto== true && correo.length()>=4) valid=true;
			else {JOptionPane.showMessageDialog(null, "El correo no es valido");}
			
		}while (valid==false);
		
		System.out.println("el correo es correcto");

	}

}
