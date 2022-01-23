package reyes.romulo.pooAbstractas;

public class UsoTarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TareaVehiculos vehiculos[]= new TareaVehiculos [3];
		vehiculos[0]= new TareaMoto(20);
		vehiculos[1]= new TareaCoche(20);
		vehiculos[2]= new TareaMoto(20);
		
		
		System.out.println(vehiculos[1].acelerar(50));

	}

}
