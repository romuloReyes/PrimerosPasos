package reyes.romulo.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleados Antonio= new Empleados("Antonio", 2300.5, 2005, 7, 15);
		Jefes Ana= new Jefes("Ana", 2900, 2008, 8, 9);
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());*/
		
		Jefes Juan= new Jefes("Juan", 8000, 2013,8,5);
		Juan.setIncentivo(200);
		
		Empleados[] losEmpleados= new Empleados[6];
		losEmpleados[0]= new Empleados("Antonio", 2300.5, 2005,7,5);
		losEmpleados[1]= new Empleados("Carlos", 5000.5, 2007,6,5);
		losEmpleados[2]= new Empleados("Maria", 2500.5, 2006,11,7);
		losEmpleados[3]= new Empleados("Ana", 7000, 2009,5,3);
		losEmpleados[4]=Juan;  //principio de sustitución, almacenamos un objeto jefes en un array empleados. Es posible porque jefes hereda de empleados.
		losEmpleados[5]= new Jefes("Isabel", 8000, 2007,4,2);
		
		Jefes Isabel= (Jefes)losEmpleados[5];
		Isabel.setIncentivo(500);
		
		/* Empleados Patricia= new Jefes ("Patricia", 2500, 2007, 5, 6);
		Jefes PatriciaDirectora=(Jefes)Patricia;  //Casting explicito */
		
		for(Empleados obj : losEmpleados) {
			System.out.println(obj.getDatosEmpleado()+" Salario: "+obj.getSueldo());
		}
		
	}

}

class Empleados {
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		calendario= new GregorianCalendar(agno, mes, dia);
		id=idSiguente;
		idSiguente++;
		
	}
	public String getDatosEmpleado() {
		
		return "El empleado " + nombre + " tiene el Id " + id + ".";
	}
	public double getSueldo() {
		
		return sueldo;
	}
	public GregorianCalendar getFechaAlta() {
		
		return calendario;
	}
	public static String getIdSiguente() { //Metodo static. Solo puede hacer referencias a campos de clase que 
											//taambien sean static, como es el caso de "idSiguente".
		
		return "El Id del siguente empleado sera: " + idSiguente;	
	}
	
	public void setSubeSueldo(double porcentaje) {
		
		double aumento= sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	
	private final String nombre; /*la palabra reservada "final" vuelve constante a una variable. Solo se le podra 
	 								asignar valor durante la costruccion del objeto y no podra ser modificada 
	 								posteriormente ni se podran hacer metodos setter para modificarla.*/
	private double sueldo;
	GregorianCalendar calendario;
	private int id;
	private static int idSiguente=1;
	
}

class Jefes extends Empleados{

	public Jefes(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		// TODO Auto-generated constructor stub
	}
	public void setIncentivo(double b) {
		
		incentivo=b;
		
	}
	public double getSueldo() {
		
		double sueldoJefe= super.getSueldo();
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
}



