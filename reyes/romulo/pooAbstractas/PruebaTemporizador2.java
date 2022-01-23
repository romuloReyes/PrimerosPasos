package reyes.romulo.pooAbstractas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj mireloj= new Reloj(3000, true);
		mireloj.ejecutarTemporizador();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");

	}

}

class Reloj {
	
	public Reloj (int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void ejecutarTemporizador() {
		
		ActionListener oyente= new DameLaHora();
		Timer miTemporizador= new Timer(intervalo, oyente);
		miTemporizador.start();
		
	}
	
	
	private int intervalo;
	private boolean sonido;
	private class DameLaHora implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date ahora= new Date();
			System.out.println("Te pongo la hora cada 3 segundos: "+ahora);
			if(sonido) Toolkit.getDefaultToolkit().beep();
			
		}
		
	}
}
