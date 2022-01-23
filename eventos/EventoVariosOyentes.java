package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoVariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVariosOyentes marco= new MarcoVariosOyentes();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoVariosOyentes extends JFrame {
	
	public MarcoVariosOyentes(){
		setBounds(600,100,550,400);
		setTitle("Varios Oyentes");
		add(new LaminaVariosOyentes());
		setVisible(true);
	}
}
class LaminaVariosOyentes extends JPanel {
	
	public LaminaVariosOyentes(){
		JButton boton1= new JButton("Nuevo");
		add(boton1);
		Boton_cerrar=new JButton("Cerrar todo");
		add(Boton_cerrar);
		
		boton1.addActionListener(new CreaMarco());
	}
	private class CreaMarco implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			MarcoNuevo miMarco= new MarcoNuevo(Boton_cerrar);
			miMarco.setVisible(true);
		}
		
	}
	JButton Boton_cerrar;
}
class MarcoNuevo extends JFrame{
	
	public MarcoNuevo(JButton boton) {
		contador++;
		setTitle("Ventana "+contador);
		setBounds(50*contador,50*contador,350,200);
		boton.addActionListener(new CierraTodos());
		
	}
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
		}
		
	}
	private static int contador=0;
}


