package interfacesGrafias;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManejoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoImagenes marcoUno= new MarcoImagenes();
		
		marcoUno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoImagenes extends JFrame {
	
	public MarcoImagenes () {
		setBounds (300, 150, 800, 500);
		LaminaImagenes laminaUno= new LaminaImagenes();
		add(laminaUno);
		setVisible(true);
	}
	
}

class LaminaImagenes extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		File miImagen= new File("src/interfacesGrafias/Captura2.PNG");
		try {
			imagen= ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Imagen no encontrada.");
		}
		g.drawImage(imagen, 50, 50, null);
		g.copyArea(50, 50, 100, 100, 500, 200);
	}
	
	private Image imagen;
}