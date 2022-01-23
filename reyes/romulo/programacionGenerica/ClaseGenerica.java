package reyes.romulo.programacionGenerica;

public class ClaseGenerica<T> {
	
	public ClaseGenerica() {
		objeto=null;
	}
	
	public void setObjeto(T nuevoValor) {
		objeto=nuevoValor;
	}
	
	public T getObjeto() {
		return objeto;
	}
	
	
	private T objeto;
}
