package eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoRaton marco= new MarcoRaton();
		
		marco.addMouseListener(new EventosRaton());
		marco.addMouseMotionListener(new EventosRaton2());
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoRaton extends JFrame {
	public MarcoRaton(){
		setBounds(600,30,600,450);
		setTitle("Eventos de Raton");
		setVisible(true);
	}
}
class EventosRaton extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked on: "+e.getX()+", "+e.getY());
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) System.out.println("Has presionado el boton izq del raton.");
		//if else(e.getModifiersEx()==)
	}

	/*@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse realeased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse exited");
	}*/
	
}
class EventosRaton2 implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse moved");
	}
	
}
