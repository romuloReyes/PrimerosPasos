package eventos;
/*En este ejercicio debes crear un marco con un panel en su interior. Al hacer clic con el ratón en 
el panel, debe salir un mensaje de texto en consola. El mensaje puede ser el que quieras.*/
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TareaEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTarea marco= new MarcoTarea();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoTarea extends JFrame {
	
	public MarcoTarea() {
		setBounds(600, 30, 600, 450);
		setTitle("Saludo");
		LaminaTarea lamina1= new LaminaTarea();
		lamina1.addMouseListener(new FocusTarea());
		add(lamina1);
		setVisible(true);
	}
}
class LaminaTarea extends JPanel {
	
	//public LaminaTarea() {
		//FocusTarea focoLamina= new FocusTarea();
		//this.addFocusListener(focoLamina);
	//}
	
	//public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		
	//}
	
}
class FocusTarea implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
