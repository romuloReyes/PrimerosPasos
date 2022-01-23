package reyes.romulo.poo;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		//Primer objeto o instancia perteneciente a la clase Vehiculos.
		Vehiculos miCoche= new Vehiculos(4);/*Para crear un objeto perteneciente a una clase primero escribimos el nombre de la 
		clase (Vehiculos), despues un nombre para el objeto perteneciente a la clase (miCoche), despues signo 
		igual "=", despues se llama al constructor de la clase vehiculos ulitizando la palabra reservada "new" y a continuacion 
		el nombre del constructor (Vehiculos), por ultimo los parentesis del constructor y el punto y coma*/
		
		/*al llamar al constructor implicitamente le hemos dado un estado inicial al objeto "miCoche", y ese estado inicial 
		consiste en que tiene 4 ruedas, 2 metros de largo, 1 metro de ancho, y las demas propiedades establecidas en el 
		constructor.*/
		
		miCoche.setColor("amarillo"); /*Mediante la nomenclatura del punto podemos acceder a los metodos que hemos creado en nuestra 
		clase "Vehiculos", y aunque no pertenecen a esta clase podemos acceder a ellos porque los hicimos con el modificador de 
		acceso "public". Aplicando el metodo "setColor" al objeto "miCoche" hemos cambiado su estado inicial, especificamente
		su color.*/
		
		System.out.println(miCoche.getColor());
		
		//segundo objeto o instancia
		Vehiculos miCoche2= new Vehiculos(4);
		
		miCoche2.setColor("rojo");
		
		miCoche2.setExtra(true);
		
		System.out.println(miCoche2.getExtra());
		
		System.out.println(miCoche2.getColor());
		
		//tercer objeto o instancia
		Vehiculos moto1= new Vehiculos(2);	
		
		System.out.println(miCoche.getDatosVehiculo());
		System.out.println(moto1.getDatosVehiculo());
		
		Vehiculos miMoto= new Vehiculos(2,1,0.3,200);
		
		miMoto.setColor("gris");
		
		Vehiculos miCamion= new Vehiculos(6,3,1.5,3500);
		
		miCamion.setColor("azul");
		
		miCamion.setExtra(true, true, true);
		
		System.out.println(miCamion.getExtra());
		
		System.out.println(miCamion.getDatosVehiculo());
				
	}

}
