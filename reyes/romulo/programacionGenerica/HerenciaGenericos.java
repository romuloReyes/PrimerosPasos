package reyes.romulo.programacionGenerica;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*  Empleado empleado15248;
		Jefe Sara= new Jefe("Sara", 27, 3750);
		
		empleado15248= Sara;*/
		
		VariosTipos<Empleado> empleado15248= new VariosTipos<Empleado>();
		VariosTipos<Jefe> Sara= new VariosTipos<Jefe>();
		
	//	empleado15248= Sara;

		VariosTipos.imprimirTrabajador(Sara);
		
		
	}

}
