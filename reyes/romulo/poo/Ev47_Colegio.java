package reyes.romulo.poo;

public class Ev47_Colegio {
	
	public Ev47_Colegio (String nombreColegio, int numeroAlumnos) {
		
		this.nombreColegio=nombreColegio;
		
		arrayAlumnos= new Ev47_Alumno[numeroAlumnos];
		
	}
	public String getNombreColegio() {
		
		return nombreColegio;
		
	}
	private Ev47_Alumno getAlumno(int nAlumno) {
		
		return arrayAlumnos[nAlumno];
		
	}
	public void nuevoAlumno (String nombreAlumno, double notaAlumno) {
		
		Ev47_Alumno nuevoAlumno= new Ev47_Alumno (this, nombreAlumno, notaAlumno);
		arrayAlumnos[posicionArray]=nuevoAlumno;
		posicionArray++;
		
	}
	public void expulsaAlumno(String nombreAlumno) {
		
		for(int i=0; i<arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i]=null;
				}
			}
		}
		
	}
	public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		
		for (int i=0; i<arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				}
			}
		}
			
	}
	public void getTodosAlumnos() {
		
		for(int i=0; i<arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				System.out.println(this.getAlumno(i));
				System.out.println();
			}
		}
		
	}
	public void getDatosAlumno (String nombreAlumno) {
		
		for (int i=0; i<arrayAlumnos.length; i++) {
			if(this.getAlumno(i)!=null) {
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					System.out.println(this.getAlumno(i));
					System.out.println();
				}
			}
		}
		
	}

	
	
	
	private Ev47_Alumno arrayAlumnos[];
	private String nombreColegio;
	private int numeroAlumnos;
	private int posicionArray=0;
}
