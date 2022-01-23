package reyes.romulo.programacionGenerica;

import java.util.*;

/*public class UsoEmpleadosPG {

}*/
public class UsoEmpleadosPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleados Antonio= new Empleados("Antonio", 2300.5, 2005, 7, 15);
		Jefes Ana= new Jefes("Ana", 2900, 2008, 8, 9);
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());*/
		
		Jefes Juan= new Jefes("Juan", 8000, 2013,8,5);
		Juan.setIncentivo(200);
		
		/* Empleados[] losEmpleados= new Empleados[6];
		losEmpleados[0]= new Empleados("Antonio", 2300.5, 2005,7,5);
		losEmpleados[1]= new Empleados("Carlos", 5000.5, 2007,6,5);
		losEmpleados[2]= new Empleados("Maria", 2500.5, 2006,11,7);
		losEmpleados[3]= new Empleados("Ana", 7000, 2009,5,3);
		losEmpleados[4]=Juan;  //principio de sustitución, almacenamos un objeto jefes en un array empleados. Es posible porque jefes hereda de empleados.
		losEmpleados[5]= new Jefes("Isabel", 8000, 2007,4,2); */
		
		
		ArrayList <Empleados> listaEmpleados=new ArrayList<Empleados>();
		//listaEmpleados.ensureCapacity(12);
		listaEmpleados.add(new Empleados("Antonio", 2300.5, 2005,7,5));
		listaEmpleados.add(new Empleados("Sara", 2300.5, 2005,7,5));
		listaEmpleados.add(new Empleados("Pedro", 2300.5, 2005,7,5));
		listaEmpleados.add(new Empleados("Carlos", 1700, 2008, 6, 6));
		//listaEmpleados.trimToSize();
		//System.out.println(listaEmpleados.size());
		
		//reemplazo del elemento en la posicion 1 del arraylist, metodo set
		listaEmpleados.set(1, new Empleados("George", 1990, 2006, 1, 12));		
		
		
		/* Empleados Patricia= new Jefes ("Patricia", 2500, 2007, 5, 6);
		Jefes PatriciaDirectora=(Jefes)Patricia;  //Casting explicito */
		
		/* for(Empleados obj : listaEmpleados) {
			System.out.println(obj.getDatosEmpleado()+" Salario: "+obj.getSueldo()); 
		} */
		
		//System.out.println(listaEmpleados.get(3).getDatosEmpleado());
		
		/* for(int i=0; i<listaEmpleados.size(); i++) {
			Empleados e= listaEmpleados.get(i);
			System.out.println(e.getDatosEmpleado()+" Salario: "+e.getSueldo() );
		} */
		
		/*Empleados ArrayEmpleados[]=new Empleados[listaEmpleados.size()];
		listaEmpleados.toArray(ArrayEmpleados);
		
		for(int i=0; i<ArrayEmpleados.length; i++) {
			System.out.println(ArrayEmpleados[i].getDatosEmpleado());
		}*/
		
		Iterator<Empleados> IteradorEmpleados= listaEmpleados.iterator();
		
		while(IteradorEmpleados.hasNext()) System.out.println(IteradorEmpleados.next().getDatosEmpleado());
		
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
