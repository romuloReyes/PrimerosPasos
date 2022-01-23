package reyes.romulo.poo;

public class Ejercicio_v43ClaseSucursal {
	
	public Ejercicio_v43ClaseSucursal (int numeroSucursal, String direccion, String ciudad) {
		
		this.numeroSucursal=numeroSucursal;
		this.direccion=direccion;
		this.ciudad=ciudad;
		
	}
	public int getNumeroSucursal() {
		
		return numeroSucursal;
	}
	public String getCiudad () {
		
		return ciudad;
	}
	public String getDireccion() {
		
		return direccion;
	}
	public double PrecioEnvio(Ejercicio_v43ClasePaquete t) {
		
		double precio;
		
		precio=t.getPeso();
		if(t.getPrioridad()==1) precio+=10;
		if(t.getPrioridad()==2) precio+=20;
		
		return precio;
			
		/*if (peso<=10 && prioridad==0) precio=10;
		else if (peso<=10 && prioridad==1) precio=20;
		else if (peso<=10 && prioridad==2) precio=30;
		else if (peso>10 && peso<25 && prioridad==0) precio=20;
		else if (peso>10 && peso<25 && prioridad==1) precio=30;
		else if (peso>10 && peso<25 && prioridad==2) precio=40;
		else System.out.println("El paquete excede el peso maximo de envio");*/
		
	}
	
	
	
	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
}
