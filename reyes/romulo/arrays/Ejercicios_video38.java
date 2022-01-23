package reyes.romulo.arrays;

import java.util.Scanner;

public class Ejercicios_video38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros enteros");
		
		int [] numeros= new int [10];
		
		for(int i=0; i<10; i++) {
			
			numeros[i]= entrada.nextInt();
			
			
				
		}*/
		
		
		
	Scanner entrada= new Scanner(System.in);
	int negativos=0;
	int positivos=0;
	int ceros=0;
	
	
	int [] numeros= new int [10];
	
	System.out.println("Introduce dies numeros.");
	
	for(int i=0; i<10; i++) {
		numeros [i]= entrada.nextInt();
		}
	
	for(int valores:numeros) {
		if(valores<0) negativos++;
		else if(valores>0) positivos++;
		else ceros++;
	}
	entrada.close();
	
	System.out.println("En el array hay: \n"+negativos+" valores negativos. \n"
	+positivos+" valores positivos. \n"+ceros+" ceros.");
	
	/*System.out.println("Introduce el numero 1");
	numeros[0]= entrada.nextInt();
	
	System.out.println("Introduce el numero 2");
	numeros[1]= entrada.nextInt();
	
	System.out.println("Introduce el numero 3");
	numeros[2]= entrada.nextInt();
	
	System.out.println("Introduce el numero 4");
	numeros[3]= entrada.nextInt();
	
	System.out.println("Introduce el numero 5");
	numeros[4]= entrada.nextInt();
	
	System.out.println("Introduce el numero 6");
	numeros[5]= entrada.nextInt();
	
	System.out.println("Introduce el numero 7");
	numeros[6]= entrada.nextInt();
	
	System.out.println("Introduce el numero 8");
	numeros[7]= entrada.nextInt();
	
	System.out.println("Introduce el numero 9");
	numeros[8]= entrada.nextInt();
	
	System.out.println("Introduce el numero 10");
	numeros[9]= entrada.nextInt();*/
	
	
	/*numeros[0]= Integer.parseInt(JOptionPane.showInputDialog("introduce el numero 1"));
	numeros[1]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 2"));
	numeros[2]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 3"));
	numeros[3]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 4"));
	numeros[4]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 5"));
	numeros[5]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 6"));
	numeros[6]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 7"));
	numeros[7]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 8"));
	numeros[8]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 9"));
	numeros[9]= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero 10"));*/
	
	//entrada.close();
	
	/*for (int i=0; i<numeros.length; i++) {
		
		if(i<0) negativos++;
		if(i>0) positivos++;
		if(i==0) ceros++;
		
	}
	
System.out.println("Los numeros son: ");
	
	for(int i=0; i<numeros.length; i++) {
		
		System.out.print(numeros[i] + " ");
		
	}
	System.out.println();
	System.out.println("introdujiste " + negativos + " numeros negativos. \n" 
	+ "Introdujiste " + positivos + " numeros positivos.");*/
	
	
	
	/*System.out.println("Los numeros son: ");
	
	for(int i=0; i<numeros.length; i++) {
		
		System.out.println(numeros[i]);
	
	}*/
	}

}
