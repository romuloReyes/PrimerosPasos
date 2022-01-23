package reyes.romulo.ejerciciosYoutube;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IngreseCalificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int calificacion=0;
		String numID=" ";
		boolean reprovado=false;
		String alumno= " ";
		
		for(int i=0; i<5; i++) {
			
			numID=JOptionPane.showInputDialog("Introduce el numero ID del alumno " + (i+1));
			calificacion=Integer.parseInt(JOptionPane.showInputDialog("Introduce su calificacion"));
			
			if(calificacion<6) {
				JOptionPane.showMessageDialog(null, "El alumno " + numID + " ha reprovado");
				
			}else JOptionPane.showMessageDialog(null, "El alumno " + numID + " ha aprovado");
		} */
		
		int array []= new int[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduzca un numero: ");
			array[i]= sc.nextInt();
		}
		System.out.println("Los numeros en orden inverso son: ");
		int j=4;
		while(j>=0) {
			System.out.print("| " + array[j] + " |");
			j--;
		}

	}

}
