package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTeclado marcoTeclas= new MarcoTeclado();
		
		marcoTeclas.addKeyListener(new ClaseQueImplementaKeyListener());
		
		marcoTeclas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoTeclado extends JFrame {
	public MarcoTeclado() {
		setBounds(300,150,600,450);
		setTitle("Eventos teclado");
		setVisible(true);
	}
}
class ClaseQueImplementaKeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Se presiono una tecla");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has pulsado la tecla: "+ e.getKeyChar());
		System.out.println("Has pulsado la tecla: "+ e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Has soltado la tecla.");
	}
	
	
}