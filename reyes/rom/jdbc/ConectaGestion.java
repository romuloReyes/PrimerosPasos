package reyes.rom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConectaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.- CREAR CONEXION
		
		try {
			Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_youtube", "root", "");
			
			//2.- CREAR OBJETO DE TIPO STATEMENT
			Statement objetoStatement= miConexion.createStatement();
			
			//3.- EJECUTAR INSTRUCCION SQL
			ResultSet objetoResultSet= objetoStatement.executeQuery("SELECT * FROM PRODUCTOS");
			
			//4.- LEER EL RESULTSET
			while(objetoResultSet.next()) {
				System.out.println(objetoResultSet.getString(1)+" "+objetoResultSet.getString(3));
			}
			objetoResultSet.close();
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
