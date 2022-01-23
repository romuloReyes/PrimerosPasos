package reyes.romulo.pooAbstractas;

public class TareaCoche implements TareaVehiculos{
	
	public TareaCoche (int velocidadActual) {
		
		this.velocidadActual=velocidadActual;
		
	}

	@Override
	public String acelerar(int aceleracion) {
		// TODO Auto-generated method stub
		velocidadActual+=aceleracion;
		if(velocidadActual>velocidad_maxima) {
			return "La velocidad Maxima fue excedida";
		}else 
			
		return "La velocidad actual es "+velocidadActual ;
	}

	public String frenar(int frenar) {
		// TODO Auto-generated method stub
		velocidadActual-=frenar;
		return "La velocidad actua es:"+velocidadActual;
	}

	public int plazas() {
		// TODO Auto-generated method stub
		return 5;
	}

	
	
	private int velocidadActual=0;
	private int velocidad_maxima=120;
}
