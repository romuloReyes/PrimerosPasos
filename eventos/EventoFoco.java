package eventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFoco marco=new MarcoFoco();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoFoco extends JFrame {
	
	public MarcoFoco() {
		setBounds(600,30,600,450);
		setTitle("Eventos de Foco");
		setVisible(true);
		add(new LaminaMarco());
	}
	
}
class LaminaMarco extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		campoTexto1= new JTextField();
		campoTexto2= new JTextField();
		campoTexto3= new JTextField();
		campoTexto1.setBounds(150, 30, 300, 30);
		campoTexto2.setBounds(150, 80, 300, 30);
		campoTexto3.setBounds(150, 130, 300, 30);
		
		etiq1= new JLabel("usuario");
		etiq2= new JLabel("contraseña");
		etiq3= new JLabel("correo");
		etiq1.setBounds(100, 30, 100, 30);
		etiq2.setBounds(80, 80, 100, 30);
		etiq3.setBounds(100, 130, 100, 30);
		
		add(campoTexto1);
		add(campoTexto2);
		add(campoTexto3);
		add(etiq1);
		add(etiq2);
		add(etiq3);
		
		EventosDeFoco foco=new EventosDeFoco();
		campoTexto1.addFocusListener(foco);
		campoTexto2.addFocusListener(foco);
		campoTexto3.addFocusListener(foco);
	}
	private class EventosDeFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource()==campoTexto1) System.out.println("El cuadro 1 a perdido el foco");
			else System.out.println("El cuadro 2 a perdido el foco");
		}
		
	}	
	private JTextField campoTexto1, campoTexto2, campoTexto3;
	private JLabel etiq1, etiq2, etiq3;
}
