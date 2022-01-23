package reyes.romulo.poo;

public class Ev47_Alumno { 
	
	public Ev47_Alumno (Ev47_Colegio Colegio, String nombreAlumno, double notaAlumno) {
		
		this.Colegio=Colegio;
		this.nombreAlumno=nombreAlumno;
		this.notaAlumno=notaAlumno;
		
		nAlumno=numeroAlumno;
		numeroAlumno++;
	}
	public void setNotaMedia (double notaAlumno) {
		
		this.notaAlumno=notaAlumno;
		
	}
	
	public String toString() {
		
		return "Nombre Alumno: "+nombreAlumno+" \n"+
			   "Colegio: "+this.getNombreColegioAlumno()+"\n"+
			   "N° alumno: "+numeroAlumno+"\n"+
			   "Nota media: "+notaAlumno;
		
	}
	private String getNombreColegioAlumno() {
		
		return this.Colegio.getNombreColegio();
		
	}
	public String getNombreAlumno() {
		
		return nombreAlumno;
		
	}
	
	
	
	private int nAlumno;
	private static int numeroAlumno=1;
	private Ev47_Colegio Colegio;
	private String nombreAlumno;
	private double notaAlumno;
}
