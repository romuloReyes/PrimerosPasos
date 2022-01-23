package reyes.romulo.accesoFicheros;

import java.io.*;

public class accesoRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File carpeta= new File("C:\\Users\\romulo\\Desktop\\usb rom\\TBA 8 120\\Peróx + Sterile System");
		
		System.out.println(carpeta.getAbsolutePath());
		//System.out.println(archivo.exists());
		
		String [] nombres= carpeta.list();
		
		for(int i=0; i<nombres.length; i++) {
			
			System.out.println(nombres[i]);
			
			File f= new File(carpeta.getAbsoluteFile(), nombres[i]);
			if(f.isDirectory()) {
				String [] archivosSubcarpeta= f.list();
				
				for(int j=0; j<archivosSubcarpeta.length; j++) {
					System.out.println(archivosSubcarpeta[j]);
				}
			}
			
		}
	}

}
