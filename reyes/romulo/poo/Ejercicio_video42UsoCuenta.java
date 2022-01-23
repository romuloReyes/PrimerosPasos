package reyes.romulo.poo;

public class Ejercicio_video42UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio_video42CuentaCorriente Cuenta1= new Ejercicio_video42CuentaCorriente("Romulo Reyes", 10000.50);
		Ejercicio_video42CuentaCorriente Cuenta2= new Ejercicio_video42CuentaCorriente("Joel", 11000.50);
		
		Ejercicio_video42CuentaCorriente.Transferencia(Cuenta1, Cuenta2, 500);
		
		System.out.println(Cuenta1.getDatosGenerales());
		System.out.println(Cuenta2.getDatosGenerales());

	}

}
