package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class EventoVariasFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVariasFuentes marco= new MarcoVariasFuentes();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoVariasFuentes extends JFrame{
	
	public MarcoVariasFuentes () {
		setBounds(600,150,600,450);
		setTitle("Eventos Varias Fuentes");
		add(new LaminaVariasFuentes());
		setVisible(true);
	}
}
class LaminaVariasFuentes extends JPanel{
	
	public LaminaVariasFuentes() {
		/*JButton botonAzul= new JButton("Azul");
		JButton botonRojo= new JButton("rojo");
		JButton botonVerde= new JButton("verde");
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);*/
		EventoAccion colorAzul= new EventoAccion("Azul", Color.BLUE);
		EventoAccion colorRojo= new EventoAccion("Rojo", Color.RED);
		EventoAccion colorVerde= new EventoAccion("Verde", Color.GREEN);
		add(new JButton(colorAzul));
		add(new JButton(colorRojo));
		add(new JButton(colorVerde));
		
		InputMap mapaEntrada= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAzul= KeyStroke.getKeyStroke("ctrl A");
		KeyStroke teclaRojo= KeyStroke.getKeyStroke("ctrl R");
		KeyStroke teclaVerde= KeyStroke.getKeyStroke("ctrl V");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo azul");
		mapaEntrada.put(teclaRojo, "fondo rojo");
		mapaEntrada.put(teclaVerde, "fondo verde");
		
		ActionMap mapaAccion= getActionMap();
		
		mapaAccion.put("fondo azul", colorAzul);
		mapaAccion.put("fondo rojo", colorRojo);
		mapaAccion.put("fondo verde", colorVerde);
	}
	private class EventoAccion extends AbstractAction {
		
		public EventoAccion(String nombre, Color color_fondo) {
			putValue(Action.NAME, nombre);
			putValue(Action.SHORT_DESCRIPTION, "Cambia el color de fondo de la lamina JPanel a "+nombre);
			putValue("colorFondoJPanel", color_fondo);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("colorFondoJPanel");
			setBackground(c);
			System.out.println("Nombre: "+getValue(Action.NAME)+". Descripcion: "+getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
}

