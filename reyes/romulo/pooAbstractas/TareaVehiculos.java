package reyes.romulo.pooAbstractas;

public interface TareaVehiculos {
	
	public abstract String acelerar(int aceleracion);

	public abstract String frenar (int frenar);
	
	public abstract int plazas ();
	
	
	final int velocidad_maxima=120;
}
