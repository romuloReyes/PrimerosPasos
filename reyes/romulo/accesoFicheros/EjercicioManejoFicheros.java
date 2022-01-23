package reyes.romulo.accesoFicheros;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class EjercicioManejoFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nDirectorio= JOptionPane.showInputDialog("Introduce el nombre del directorio nuevo");
		String nArchivo= JOptionPane.showInputDialog("Introduce el nombre del archivo nuevo");
		String nFrase= JOptionPane.showInputDialog("Introduce una frace para escribir en el archivo");
		
		File rutaDirectorio= new File("C:"+File.separator+"Users"+File.separator+"romulo"+File.separator+ "Desktop"+File.separator+"usb rom"+File.separator+nDirectorio);
		
		
		
		//Creacion Directorio
		rutaDirectorio.mkdir();
		
		File rutaArchivo= new File("C:"+File.separator+"Users"+File.separator+"romulo"+File.separator+"Desktop"+File.separator+"usb rom"+File.separator+nDirectorio +File.separator+nArchivo+".txt");
		
		//Creacion archivo .txt / escritura de una frase de ejemplo 
		try {
			
			rutaArchivo.createNewFile();
			
			//Escritura frase de ejemplo
			FileWriter escritura=new FileWriter("C:"+File.separator+"Users"+File.separator+"romulo"+File.separator+"Desktop"+File.separator+"usb rom"+File.separator+nDirectorio +File.separator+nArchivo+".txt",true);
			for(int i=0;i<nFrase.length();i++) {
				
				escritura.write(nFrase.charAt(i));
				
			}
			escritura.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
