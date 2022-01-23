package interfacesGrafias;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTexto miMarco= new MarcoTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoTexto extends JFrame {
	
	public MarcoTexto () {
		
		setBounds(400,200,600,450);
		setTitle("Escritura en JFrame");
		setVisible(true);
		
		PrimerPanel miLamina= new PrimerPanel();
		add(miLamina);
		
	}
	
}

class PrimerPanel extends JPanel {
	
	public PrimerPanel () {
		
		setBackground(new Color (70));
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Color miColor= new Color (0, 50, 95);
		g.setColor(miColor);
		Font miLetra= new Font ("Edwardian Script ITC", Font.BOLD, 30);
		g.setFont(miLetra);
		g.drawString("Primer Panel", 120, 220);
		
	}
	
}



