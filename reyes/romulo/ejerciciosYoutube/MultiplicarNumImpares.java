package reyes.romulo.ejerciciosYoutube;
//Programa que muestre el resultado de multiplicar los primeros 19 numeros impares que existen.

public class MultiplicarNumImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long productoImpares=1;
		for(int i=1; i<20;i+=2) productoImpares=productoImpares*i;
		
		System.out.println("El resultado de multiplicar los primeros 10 numeros impares que existen es: "+
		productoImpares);
		

	}

}
