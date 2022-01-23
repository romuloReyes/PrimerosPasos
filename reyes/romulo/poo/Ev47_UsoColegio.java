package reyes.romulo.poo;

public class Ev47_UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ev47_Colegio SanJavier= new Ev47_Colegio("San Javier", 200);
		Ev47_Colegio Cervantes= new Ev47_Colegio("Cervantes", 300);
		
		SanJavier.nuevoAlumno("Juan", 8.5);
		SanJavier.nuevoAlumno("Sara", 9);
		Cervantes.nuevoAlumno("Ana", 5);
		Cervantes.nuevoAlumno("Antonio", 7);
		Cervantes.nuevoAlumno("Maria", 3);
		Cervantes.expulsaAlumno("Antonio");
		Cervantes.setNotaMedia("Maria", 8);
		Cervantes.getTodosAlumnos();
		
		
		

	}

}
