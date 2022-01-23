package reyes.romulo.programacionGenerica;

import java.io.File;

public class UsoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiArrayList archivos= new MiArrayList(5);
		
		/*archivos.agregaElemento("Maria");
		archivos.agregaElemento("Antonia");
		archivos.agregaElemento("Ana");
		archivos.agregaElemento("Juan");
		archivos.agregaElemento("Pedro");
		
		String nombrePersona= (String)archivos.getObjeto(2);*/
		
		archivos.agregaElemento(new File("ejemplo.xlsx"));
		
		File nombrePersona= (File)archivos.getObjeto(0);
		
		System.out.println(nombrePersona);
		
	}

}
