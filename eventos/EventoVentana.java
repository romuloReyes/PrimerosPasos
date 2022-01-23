package eventos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana marcoUno= new MarcoVentana();
		
		EventosVentana minimizar= new EventosVentana();
		marcoUno.addWindowStateListener(minimizar);
		
		marcoUno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		setBounds(300,150,600,450);
		setVisible(true);
	}
}
class EventosVentana implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana ha cambiado de estado.");
		//System.out.println(e.getNewState());
		if(e.getNewState()==JFrame.MAXIMIZED_BOTH)System.out.println("has maximizado la ventana");
		else if(e.getNewState()==JFrame.ICONIFIED)System.out.println("has minimizado la ventana");
		else System.out.println("cambio no especificado");
	}

	/*@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Cerrando ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana restaurada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana activa");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana en segundo plano");
	}*/
	
}