package reyes.romulo.accesoFicheros;

import java.io.*;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escritura creaEscribeFichero= new Escritura();
		creaEscribeFichero.escribiendo();

	}

}

class Escritura {
	
	public void escribiendo() {
		
		String texto="Esto es una prueba de lectura de fichero mediante stream con buffer.";
		
		try {
			FileWriter escritura= new FileWriter ("C:/Users/romulo/Desktop/primerStream.txt");
			for(int i=0;i<texto.length();i++) {
				escritura.write(texto.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}