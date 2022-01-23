package reyes.romulo.accesoFicheros;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File rutaDocumento= new File("C:"+File.separator+"Users"+File.separator+"romulo"+File.separator+"Desktop"+File.separator+"usb rom"+File.separator+"TBA 8 120"+File.separator+"Peróx + Sterile System"+File.separator+"CreaDirectorio"+File.separator+"nuevoExcel.xlsx");
		//directorio.mkdir();
		
		try {
			rutaDocumento.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
