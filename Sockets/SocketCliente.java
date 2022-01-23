package Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.*;

public class SocketCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoJF marco1= new MarcoJF();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoJF extends JFrame{
	
	public MarcoJF() {
		setBounds(300, 150, 280, 350);
		LaminaJP lamina1= new LaminaJP();
		add(lamina1);
		setVisible(true);
		
		estableceConexionServidor();
		
	}
	
	void estableceConexionServidor() {
		try {
			Socket socket1= new Socket("192.168.0.22", 9999);
			
			EnvioPaqueteDatos datos= new EnvioPaqueteDatos();
			datos.setTextoCliente("online");
			
			ObjectOutputStream flujoSalidaPaquete= new ObjectOutputStream(socket1.getOutputStream());
			
			flujoSalidaPaquete.writeObject(datos);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class LaminaJP extends JPanel implements Runnable{
	
	public LaminaJP() {
		nick= new JLabel();
		nick.setText(JOptionPane.showInputDialog("Nick:"));
		add(nick);
		JLabel online= new JLabel("Online: ");
		add(online);
		ip= new JComboBox();
			/*ip.addItem("Juan");
			ip.addItem("Maria");
			ip.addItem("Pedro");*/
		add(ip);
		areaChat= new JTextArea(12, 20);
		add(areaChat);
		areaTexto= new JTextField(20);
		add(areaTexto);
		boton1= new JButton("Enviar");
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	System.out.println(areaTexto.getText());
				
				try {
					//Creacion de socket (via de comunicacion)
					Socket socket1= new Socket("192.168.0.22", 9999);
					
					EnvioPaqueteDatos datos= new EnvioPaqueteDatos();
					
					datos.setIp(ip.getSelectedItem().toString());
					datos.setNick(nick.getText());
					datos.setTextoCliente(areaTexto.getText());
					
					ObjectOutputStream flujoSalidaPaquete= new ObjectOutputStream(socket1.getOutputStream());
					flujoSalidaPaquete.writeObject(datos);
					
					socket1.close();
					
					/*//Creacion del flujo de datos
					DataOutputStream flujoDatosSalida= new DataOutputStream(socket1.getOutputStream());
					flujoDatosSalida.writeUTF(areaTexto.getText());
					flujoDatosSalida.close(); */
										
				} catch (UnknownHostException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		add(boton1);
		
		Thread miHilo= new Thread(this);
		miHilo.start();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			ServerSocket escuchaCliente= new ServerSocket(9090);
			
			Socket cliente;
			EnvioPaqueteDatos paqueteRecibido;
			
			while(true) {
				cliente= escuchaCliente.accept(); 
				
				ObjectInputStream flujoEntrada= new ObjectInputStream(cliente.getInputStream());
				paqueteRecibido= (EnvioPaqueteDatos) flujoEntrada.readObject();
				
				if(paqueteRecibido.getTextoCliente().equals(" online")) {
					//areaChat.append("\n"+paqueteRecibido.getIPs());
					ArrayList<String> jcomboIPs= new ArrayList<String>();
					jcomboIPs=paqueteRecibido.getIPs();
					
					ip.removeAllItems();
					
					for(String listaIPs: jcomboIPs) ip.addItem(listaIPs);
					
				}else{
					areaChat.append("\n"+paqueteRecibido.getNick()+": "+paqueteRecibido.getTextoCliente());
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private JTextField areaTexto;
	private JComboBox ip;
	private JLabel nick;
	private JButton boton1;
	private JTextArea areaChat;
}
class EnvioPaqueteDatos implements Serializable {
	
	
	
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getTextoCliente() {
		return textoCliente;
	}

	public void setTextoCliente(String textoCliente) {
		this.textoCliente = textoCliente;
	}

	public ArrayList<String> getIPs() {
		return IPs;
	}

	public void setIPs(ArrayList<String> iPs) {
		IPs = iPs;
	}

	private String ip, nick, textoCliente;
	private ArrayList<String> IPs;
}













