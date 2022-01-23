package reyes.romulo.flujo;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double salario_T1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del trabajador 1"));
		
		//double salario_T2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del trabajador 2"));
		
		//double salario_mayor;
		
		/*if (salario_T1>salario_T2) salario_mayor=salario_T1;
		
		else salario_mayor=salario_T2;*/
		
		//salario_mayor=(salario_T1>salario_T2)?salario_T1:salario_T2;
		
		//System.out.println("El salario mayor es: " + salario_mayor);
		
		int edad= Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor."));
		
		String mayor= (edad>18)?"Eres mayor de edad":"Eres menor de edad";
		
		System.out.println(mayor);
		

	}

}
