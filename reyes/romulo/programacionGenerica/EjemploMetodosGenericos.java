package reyes.romulo.programacionGenerica;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombresPersonas[]= {"Sara", "Antonio", "Maria"};
		System.out.println(ExaminaArrays.getElemento2(nombresPersonas));
		
		/*Empleados[] losEmpleados= new Empleados[5];
		losEmpleados[0]= new Empleados("Antonio", 2300.5, 2005,7,5);
		losEmpleados[1]= new Empleados("Carlos", 5000.5, 2007,6,5);
		losEmpleados[2]= new Empleados("Maria", 2500.5, 2006,11,7);
		losEmpleados[3]= new Empleados("Ana", 7000, 2009,5,3);
		losEmpleados[4]= new Jefes("Isabel", 8000, 2007,4,2);
		
		System.out.println(ExaminaArrays.getElementos(losEmpleados));*/

	}

}
class ExaminaArrays{
	
	public static <T> String getElementos(T[]nombreArray) {
		return "El array tiene: "+nombreArray.length+" elementos.";
	}
	
	public static <T extends Comparable> T getElemento2(T[]nombreArray) {
		T objeto1=nombreArray[0];
		
		for(int i=1; i<nombreArray.length; i++) {
			if(objeto1.compareTo(nombreArray[i])>0) {
				objeto1=nombreArray[i];	
			}
		}
		
		return objeto1;
	}
	
}
