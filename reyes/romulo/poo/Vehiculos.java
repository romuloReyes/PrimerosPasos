package reyes.romulo.poo;

public class Vehiculos {
	
	public Vehiculos (int ruedas) { //Constructor de la clase o metodo constructor de la clase. Debe llevar el mismo nombre de la clase.
		
		//dentro del metodo constructor se crea el estado inicial del vehiculo. 
		this.ruedas=ruedas;
		largo=2;
		ancho=1;
		peso=2; //dos toneladas
		color="sin color";
		//el estado inicial determina las propiedades de todos los vehiculos, pero la propiedad color debe poder cambiar.
		//para poder hacer eso se crea un metodo de acceso.
		
	}
	public Vehiculos (int ruedas, int largo, double ancho, int peso) {
		
		this.ruedas=ruedas;
		this.largo=largo;
		this.ancho=ancho;
		this.peso=peso;
		color="sin color";
		
	}
	
	
	public void setExtra (boolean climatizador) {
		
		this.climatizador=climatizador;
	}
	
	public void setExtra (boolean gps, boolean climatizador, boolean tapiceria_cuero) {
		
		this.gps= gps;
		this.climatizador=climatizador;
		this.tapiceria_cuero=tapiceria_cuero;
		
	}
	
	public String getExtra() {
		
		if(climatizador && gps==false && tapiceria_cuero==false) return "tu vehiculo lleva el pack 1 de extras";
		else if(climatizador && gps && tapiceria_cuero) return "tu vehiculo lleva el pack 2 de extras";
		else return "La combinacion de extras escogida no se admite";
	}
	
	//los metodos de acceso se denominan de tipo setter, es un metodo que establece un valor para una propiedad y se escriben de la sig forma:
	public void setColor (String color){/*"public" porque es necesario poder acceder a el desde otras clases. "void" quiere decir 
	que el metodo no nos va a devolver ningun valor despues de hacer su trabajo (va a cambiar el color del vehiculo 
	pero no nos va a devolver el color)."setColor" el nombre del metodo por convencion inicia con "set" haciendo 
	referencia a "setter" y despues el nombre de la propiedad que va a cambiar.*/
		
		this.color=color; /*Se suele nombrar al argumento que el metodo espera recibir de la misma forma que la propiedad a la que hace 
		referencia el metodo, para distinguir entre la propiedad y el argumento se usa la palabra reservada "this".*/
		
	} 
	//los metodos que devuelven el valor de una propiedad se denominan metodos getter y se escriben de la sig forma:
	public String getColor() {/*"public" porque es nesesario poder acceder a el desde otras clases. "string" se debe especificar el
	tipo de dato y en este caso es un String. "getColor" el nombre del metodo por convencion inicia con "get" haciendo
	referenca a "getter" y el nombre de la propiedad que va a devolver.*/
		
		return color; //Para espesificar el valor devuelto por un metodo se debe utilizar la sentencia "return".
	
	}
	public String getDatosVehiculo () {
		
		return "Tu vehiculo tiene " + ruedas + " ruedas. Ademas" + 
		" tiene " + largo + " m de largo";
		
	}
	
	//Propiedades de la clase o campos de clase. Se pueden poner al principio o al final de la clase.
	private int ruedas; //"private" para que solo sea accesible desde esta clase. Esto es encapsulacion.
	private String color;
	private int largo;  // Podria ser de tipo double, porque en el largo de un auto puede haber decimales.
	private double ancho;
	private int peso;
	private boolean climatizador;
	private boolean tapiceria_cuero;
	private boolean gps;
	
	
}
