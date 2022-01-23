package reyes.romulo.programacionGenerica;

public class UsoClaseGenerica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseGenerica<String> miObjeto1=new ClaseGenerica<String>();
		
		miObjeto1.setObjeto("Rómulo R.");
		System.out.println(miObjeto1.getObjeto());
		
		ClaseGenerica<Persona> miObjeto2=new ClaseGenerica<Persona>();
		
		Persona individuo1=new Persona("Jose");
		
		miObjeto2.setObjeto(individuo1);
		
		System.out.println(miObjeto2.getObjeto());
	

	}

}
class Persona{
	
	public Persona(String nombre){
		this.nombre=nombre;
	}
	
	public String toString() {
		return nombre;
	}
	
	
	
	private String nombre;
}