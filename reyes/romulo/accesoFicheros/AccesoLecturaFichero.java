package reyes.romulo.accesoFicheros;

import java.io.*;

public class AccesoLecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeerFichero inicioLecturaFichero= new LeerFichero();
		
		inicioLecturaFichero.leeDatos();

	}

}
class LeerFichero {
	
	public void leeDatos() {
		
		try {
			
			FileReader entrada= new FileReader("C:/Users/romulo/Desktop/primerStream.txt");
			
			BufferedReader buffer1= new BufferedReader(entrada);
			
			String linea= "";
						
			while(linea!=null) {
				
				linea= buffer1.readLine();
				if(linea!=null)System.out.println(linea);
				
			}
			
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		}
		
	}
	
}