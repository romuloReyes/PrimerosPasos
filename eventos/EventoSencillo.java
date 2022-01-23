package eventos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEvento miMarco= new MarcoEvento();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoEvento extends JFrame {
	
	public MarcoEvento () {
		setTitle ("Botones y Eventos");
		setBounds (150,150,600,400);
		LaminaEvento laminaUno= new LaminaEvento();
		add(laminaUno);
		setVisible(true);
	}
	
}
/*class LaminaEvento extends JPanel implements ActionListener{
	
	public LaminaEvento() {
		add(botonColor);
		add(botonRojo);
		add(botonVerde);
		botonColor.addActionListener(this);
		botonRojo.addActionListener(this);
		botonVerde.addActionListener(this);
	}
	
	JButton botonColor= new JButton("Azul");
	JButton botonRojo= new JButton("Rojo");
	JButton botonVerde= new JButton("Verde");

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object botonPulsado= e.getSource();
		if(botonPulsado==botonColor) setBackground(Color.BLUE);
		else if(botonPulsado==botonRojo) setBackground(Color.RED);
		else setBackground (Color.GREEN);
	}
}*/
class LaminaEvento extends JPanel{
	
	public LaminaEvento() {
		add(botonColor);
		add(botonRojo);
		add(botonVerde);
		
		ColorFondo azul= new ColorFondo(Color.BLUE);
		ColorFondo rojo= new ColorFondo(Color.RED);
		ColorFondo verde= new ColorFondo(Color.GREEN);
		
		botonColor.addActionListener(azul);
		botonRojo.addActionListener(rojo);
		botonVerde.addActionListener(verde);
	}
	
	JButton botonColor= new JButton("Azul");
	JButton botonRojo= new JButton("Rojo");
	JButton botonVerde= new JButton("Verde");
	
	private class ColorFondo implements ActionListener {
		public ColorFondo(Color c) {
			colorDeFondo=c;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
	}

}

