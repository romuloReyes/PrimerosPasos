package reyes.romulo.poo;

public class Ejercicio_v43ClasePaquete {
	
	public Ejercicio_v43ClasePaquete (String dni, double peso, int prioridad, int numeroReferencia) {
		
		this.dni=dni;
		this.peso=peso;
		this.prioridad=prioridad;
		this.numeroReferencia=numeroReferencia;
	}
	public void setPeso(double p) {
		
		peso=p;
	}
	public void setPrioridad(int p) {
		
		prioridad=p;
	}
	public double getPeso() {
		
		return peso;
	}
	public int getPrioridad() {
		
		return prioridad;
	}
	
	private int prioridad;
	private double peso;
	private int numeroReferencia;
	private String dni;

}
