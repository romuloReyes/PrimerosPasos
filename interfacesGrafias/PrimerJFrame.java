package interfacesGrafias;

import java.awt.*;

import javax.swing.*;

public class PrimerJFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*JFrame miVentana= new JFrame ();
		
		miVentana.setSize(600, 350);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setLocation(600, 350);
		miVentana.setVisible(true);*/
		
		MiJFrame miVentana= new MiJFrame ();
		
	}

}

class MiJFrame extends JFrame {
	
	public MiJFrame () {
		
		//setSize(600, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(600, 350);
		//setLocationRelativeTo(null);
		setBounds(300, 150, 500, 300);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		setResizable(true);
		setTitle("VEntana de Pruebas");
		Toolkit miSistema= Toolkit.getDefaultToolkit();
		Image miIcono= miSistema.getImage("Captura.PNG");
		setIconImage(miIcono);
		setVisible(true);
		
	}
	
}