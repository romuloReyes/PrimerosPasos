package reyes.rom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ActualizarBaseDatos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.- CREAR CONEXION
		
		try {
			Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_youtube", "root", "");
			
			//2.- CREAR OBJETO DE TIPO STATEMENT
			Statement objetoStatement= miConexion.createStatement();
			
			//3.- CREAR LA INSTRUCCION SQL QUE SE QUIERA USAR PARA MODIFICAR LA BASE DE DATOS
		//	String instruccionSQL= "INSERT INTO PRODUCTOS (CÓDIGOARTÍCULO, NOMBREARTÍCULO, PRECIO) VALUES ('AR42', 'CAMISA FLORES', '50')";
		//	String instruccionSQL= "UPDATE PRODUCTOS SET PRECIO='70' WHERE CÓDIGOARTÍCULO='AR42'";
			String instruccionSQL= "DELETE FROM PRODUCTOS WHERE CÓDIGOARTÍCULO='AR42'";
			
			//4.- EJECUTAR LA ISNTRUCCION SQL
			objetoStatement.executeUpdate(instruccionSQL);
			
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
