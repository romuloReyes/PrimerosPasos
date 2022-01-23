package reyes.romulo.poo;

import java.util.Random;

public class Ejercicio_video42CuentaCorriente {
	
	public Ejercicio_video42CuentaCorriente(String nombreTitular, double saldo) {
		
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		Random rnd= new Random();
		numeroCuenta=Math.abs(rnd.nextLong());
		
	}
	
	public void setIngreso (double ingreso) {
		if(ingreso<0) System.out.println("No se permiten ingresos negativos.");
		else saldo+= ingreso;
	}
	
	public void setReintegro (double reintegro) {
		
		saldo-=reintegro;
	}
	
	public String getSaldo() {
		
		return "El saldo de la cuenta es: " + saldo;
	}
	
	public String getDatosGenerales() {
		
		return "Titular: " + nombreTitular + ".\n" + 
		"Saldo: " + saldo + "\n" + 
		"N° de cuenta: " + numeroCuenta;
	}
	
	public static void Transferencia(Ejercicio_video42CuentaCorriente titu1, Ejercicio_video42CuentaCorriente titu2, double cantidad) {
		
		titu1.saldo-=cantidad;
		titu2.saldo+=cantidad;
		
	}
	
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
}
