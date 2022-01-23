package reyes.romulo.poo;

import java.util.*;

public class Ejercicio_v43ClaseusoSucursal_y_Paquetes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		int numeroSucursal;
		String direccion, ciudad;
		
		System.out.println("Introdusca el numero de sucursal:");
		numeroSucursal=entrada.nextInt();
		
		System.out.println("Introdusca la direccion: ");
		direccion=entrada.next();
		entrada.nextLine();
		System.out.println("Introdusca la ciudad: ");
		ciudad=entrada.next();
		
		Ejercicio_v43ClaseSucursal sucursal1= new Ejercicio_v43ClaseSucursal(numeroSucursal, direccion, ciudad);
		
		
		double peso;
		String dni;
		int prioridad, numeroReferencia, nPaquetes;
		
		System.out.println("introdusca el numero de paquetes a enviar: ");
		nPaquetes=entrada.nextInt();
		
		Ejercicio_v43ClasePaquete [] paquetes= new Ejercicio_v43ClasePaquete [nPaquetes];
		
		System.out.println("Introdusca los datos de cada paquete \n");
		
		for(int i=0; i<nPaquetes; i++) {
			
			System.out.println("introdusca los datos del paquete " + (i+1));
			
			System.out.println("Referencia: ");
			numeroReferencia=entrada.nextInt();
			System.out.println("DNI del remitente: ");
			dni=entrada.next();
			System.out.println("Peso del paquete: ");
			peso=entrada.nextDouble();
			System.out.println("Prioridad: ");
			prioridad=entrada.nextInt();
			
			paquetes [i]= new Ejercicio_v43ClasePaquete (dni, peso, prioridad, numeroReferencia);
			
		}
		entrada.close();
		
		System.out.println("\nLos datos de la sucursal son: ");
		System.out.println("Sucursal: " + sucursal1.getNumeroSucursal());
		System.out.println("Situada en: " + sucursal1.getDireccion() + " de " + sucursal1.getCiudad());
		System.out.println("\n\nLos datos de los paquetes son: ");
		
		for(int i=0; i<nPaquetes; i++) {
			
			System.out.println("Paquete: " + (i+1));
			System.out.println("Precio: " + sucursal1.PrecioEnvio(paquetes[i]));
			System.out.println("Peso: " + paquetes[i].getPeso());
		}
		
		
		
		/*do {
			
			System.out.println("introdusca el peso del paquete " + paquetes);
			peso=entrada.nextDouble();
		
			System.out.println("Introdusca el DNI del remitente: ");
			dni_remitente=entrada.nextInt();
		
			System.out.println("Introdusca la prioridad del envio del paquete " + paquetes + " (0, 1 o 2): ");
			prioridad=entrada.nextInt();
		
			System.out.println("introdusca el numero de referencia del paquete " + paquetes + " :");
			numeroReferencia=entrada.nextInt();
			
			Ejercicio_v43ClasePaquete paquete= new Ejercicio_v43ClasePaquete(peso, dni_remitente, prioridad, numeroReferencia);
			
			paquetes--;
			
			
		}while(paquetes!=0);*/
		
		/*System.out.println("Datos de la sucursal /n" +
							sucursal_1.getNumeroSucursal() +"/n"+
							sucursal_1.getDireccion() + "/n" +
							sucursal_1.getCiudad() + "/n");
		
		System.out.println("Datos paquetes /n" 
							);*/
		

	}

}
