package Sockets;

import java.awt.BorderLayout;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

import javax.swing.*;

public class SocketServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoServidorChat mimarco=new MarcoServidorChat();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidorChat extends JFrame implements Runnable{
	
	public MarcoServidorChat(){
		
		setBounds(600,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);	
		
		Thread hilo1= new Thread(this);
		hilo1.start();
	
		
		}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Ejecutando..");
		try {
			
			ServerSocket servidor1= new ServerSocket(9999); //Puerto a la escucha
			
			String nick, ip, mensaje;
			EnvioPaqueteDatos paqueteRecibido;
			
			ArrayList<String> listaIpConectados= new ArrayList<String>();
			
			while(true) {
			
				Socket socket2= servidor1.accept(); //Este metodo acepta todos las conexiones que viajen por el socket		
				
			//	flujo de entrada de datos
				ObjectInputStream flujoDatosEntrada= new ObjectInputStream(socket2.getInputStream());
				paqueteRecibido= (EnvioPaqueteDatos)flujoDatosEntrada.readObject();
				
				nick= paqueteRecibido.getNick();
				ip= paqueteRecibido.getIp();
				mensaje= paqueteRecibido.getTextoCliente();
				
				
				
				/*DataInputStream flujoDatosEntrada= new DataInputStream(socket2.getInputStream()); //Flujo de entrada de datos
			
				String mentajeEntrante= flujoDatosEntrada.readUTF();
			
				areatexto.append(mentajeEntrante+"\n");*/
				
				if(!mensaje.equals("online")) {
					
					areatexto.append("\n"+"nick: "+nick+"\n"+"IP: "+ip+"\n"+"Mensaje: "+mensaje);
				
					Socket reenvioDestinatario= new Socket(ip, 9090);
					ObjectOutputStream paqueteReenvio= new ObjectOutputStream(reenvioDestinatario.getOutputStream());
					paqueteReenvio.writeObject(paqueteRecibido);
				
					reenvioDestinatario.close();			
					socket2.close();
				}else {
				
					InetAddress dirClientes= socket2.getInetAddress();
					String ipClientesConectados= dirClientes.getHostAddress();
					System.out.println("Direccion remota conectada:"+ipClientesConectados);
					
					listaIpConectados.add(ipClientesConectados);
					
					paqueteRecibido.setIPs(listaIpConectados);
					
					for(String nuevaIp: listaIpConectados) {
						System.out.println("ArrayList:"+nuevaIp);
						
						Socket reenvioDestinatario= new Socket(nuevaIp, 9090);
						ObjectOutputStream paqueteReenvio= new ObjectOutputStream(reenvioDestinatario.getOutputStream());
						paqueteReenvio.writeObject(paqueteRecibido);
					
						reenvioDestinatario.close();			
						socket2.close();
					}
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
	
	private	JTextArea areatexto;
	
}
