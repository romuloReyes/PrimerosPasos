package reyes.romulo.accesoFicheros;

import java.io.*;

public class StreamBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int bytesImagen[]= new int [49523]; 
		try {
			FileInputStream lecturaArchivo= new FileInputStream("C:/Users/romulo/Desktop/pruebaStreamBytes/MANO2.PNG");
			boolean finalArchivo= false;
			
			while(!finalArchivo) {
				int byteImagenEntrada= lecturaArchivo.read();
				if(byteImagenEntrada!=-1) bytesImagen[contador]=byteImagenEntrada;
				else finalArchivo= true;
				System.out.println(bytesImagen[contador]);
				
				contador++;
			}
			lecturaArchivo.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//System.out.println(contador);
		CreaFichero(bytesImagen);
	}
	
	static void CreaFichero(int arrayExterno[]) {
		
		try {
			FileOutputStream ficheroExterno= new FileOutputStream("C:/Users/romulo/Desktop/pruebaStreamBytes/pruebaLecturaBytes/clonImagen.PNG");
			for(int i=0;i<arrayExterno.length;i++) {
				
				ficheroExterno.write(arrayExterno[i]);
				
			}
			ficheroExterno.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
