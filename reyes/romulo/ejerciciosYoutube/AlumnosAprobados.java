package reyes.romulo.ejerciciosYoutube;
import java.util.Scanner;

public class AlumnosAprobados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aprobados=0;
		int reprobados=0;
		int excelentes=0;
		float calif=0;
		int i=1;
		Scanner sc= new Scanner(System.in);
		
		while(i<=6) {
			
			System.out.println("Introdusca la calificaicon del alumno "+i+": ");
			calif=sc.nextFloat();
			
			if(calif>=9 && calif<=10) excelentes++;
			else if(calif>=6) aprobados++;
			else reprobados++;
			
			i++;
		}
		
		System.out.println("Cantidad de alumnos excelentes: "+excelentes+".");
		System.out.println("Cantidad de alumnos regulares: "+aprobados+".");
		System.out.println("Cantidad de alumnos reprobados: "+reprobados+".");

	}

}
