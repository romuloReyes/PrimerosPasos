package reyes.rom.serealizando;

import java.io.*;

public class Recuperando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ObjectInputStream flujoEntrada= new ObjectInputStream(new FileInputStream("C:/Users/romulo/Desktop/pruebaStreamBytes/externoJava/objetoSerializado.dat"));
			
			Empleado[] entradaObjeto= (Empleado[])flujoEntrada.readObject();
			
			flujoEntrada.close();
			
			for(Empleado e: entradaObjeto) {
				System.out.println(e);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
