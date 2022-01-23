package interfacesGrafias;

import java.awt.*;
import javax.swing.*;

public class TipoLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoJFrame miMarco= new MarcoJFrame();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoJFrame extends JFrame {
	
	public MarcoJFrame () {
		
		setBounds (300, 150, 800, 450);
		
		MarcoJPanel lamina= new MarcoJPanel();
		add(lamina);
		
		setVisible(true);
	}
}

class MarcoJPanel extends JPanel {
	
	public MarcoJPanel () {
		
		fuenteElegida= JOptionPane.showInputDialog("Escribe la fuente que quieres utilizar");
		letraPresente=false;
		misFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		Font miLetra;
		
		for (String nombreFuente: misFuentes) {
			if(nombreFuente.equals(fuenteElegida)) letraPresente=true;
		}
		if (letraPresente) miLetra=new Font(fuenteElegida, Font.BOLD, 26);
		else {
			g2.setPaint(Color.RED);
			g2.drawString("No se encontro la fuente especificada, se escribira en Arial.", 10, 10);
			miLetra= new Font("Arial", Font.BOLD, 26);
			
		}
		
		g2.setFont(miLetra);
		g2.setPaint(Color.BLUE);
		g2.drawString("Hola alumnos de JAVA", 100, 100);
	}
	
	
	private String fuenteElegida;
	private boolean letraPresente;
	private String [] misFuentes;
}