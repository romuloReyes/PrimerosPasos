package reyes.romulo.programacionGenerica;

public class Empleado {
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "El empleado se llama"+nombre+" tiene "+edad+" a�os. "+"Y un salario de "+salario;
	}
	
private String nombre;
private int edad;
private double salario;
}
