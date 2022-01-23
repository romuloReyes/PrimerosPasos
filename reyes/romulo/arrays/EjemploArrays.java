package reyes.romulo.arrays;

public class EjemploArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] valores= new int [5];
		
		valores[0]= 15;
		valores[1]= 7;
		valores[2]= 1500;
		valores[3]= 9;
		valores[4]= -5;*/
		
		//int [] valores= {15, 7, 1500, 9, -5};
		
		String [] nombre_personas= {"Juan", "Maria", "Antonio", "Laura"};
		
		/*for(int i=0; i<nombre_personas.length; i++) {
			
			System.out.println(nombre_personas[i]);
		
		}*/
		
		for (String elemento:nombre_personas) {
			
			System.out.println(elemento);
			
		}
		
	}

}
