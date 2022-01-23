package reyes.romulo.pooAbstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temporizador oyente= new Temporizador();
		
		Timer miTemporizador= new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

	}

}

class Temporizador implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Date horaActual=new Date();
		
		System.out.println(horaActual);
	}
	
	
}