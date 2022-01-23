package reyes.rom.lambda;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empleado> arrayEmpleados= new ArrayList<Empleado>();
		arrayEmpleados.add(new Empleado("Juan", 2000));
		arrayEmpleados.add(new Empleado("Ramon", 2200));
		arrayEmpleados.add(new Empleado("Javier", 1800));
		arrayEmpleados.add(new Empleado("Elena", 2500));
		
	//	Collections.sort(arrayEmpleados);
	//	Collections.sort(arrayEmpleados, (Empleado e1, Empleado e2)->e1.getSalario().compareTo(e2.getSalario()));
		arrayEmpleados
			.stream()
			.sorted((e1, e2)->e1.getSalario().compareTo(e2.getSalario()))
			.filter((Empleado e)-> e.getSalario()<=2400)
			.forEach((Empleado) -> System.out.println(Empleado.getNombre()+" "+Empleado.getSalario()));
		
	//	for(Empleado e: arrayEmpleados)System.out.println(e.getNombre()+" Salario: "+e.getSalario());
	//	arrayEmpleados.forEach((Empleado)->System.out.println(Empleado.getNombre()+" "+Empleado.getSalario()));
		
		
	}

}
