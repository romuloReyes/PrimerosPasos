package interfacesGrafias;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class DibujandoEnJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoDibujo miMarco= new MarcoDibujo();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoDibujo extends JFrame {
	
	public MarcoDibujo () {
		
		setBounds (300,150,800,450);
		
		LaminaDibujo miLamina= new LaminaDibujo();
		
		miLamina.setBackground(new Color(150,160,245));
		
		add(miLamina);
		
		setVisible(true);
	}
	
}

class LaminaDibujo extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2= (Graphics2D)g;    //casting
		
		Rectangle2D rectangulo= new Rectangle2D.Double(100, 100, 200, 150);
		
		float midash[]= {10.0f};
		
		BasicStroke miLapiz= new BasicStroke (4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, midash, 0);
		
		g2.setPaint(Color.BLUE);
		
		g2.setStroke(miLapiz);
		
		g2.draw(rectangulo);
		
		//Color miColor= new Color(125, 188, 230);
		
		g2.setPaint(new Color(110, 220, 120));
		
		g2.fill(rectangulo);
	}
	
}