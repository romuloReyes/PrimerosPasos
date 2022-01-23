package reyes.rom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.- CREAR CONEXION
		
				try {
					Connection miConexion= DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java_youtube", "root", "");
					
					//2.- CREAR OBJETO DE TIPO STATEMENT
				//	Statement objetoStatement= miConexion.createStatement();
					
					//Ejemplo para crear statements preparados. Se usa un objeto de tipo PREPARESTATEMENT
					String sentencia= "SELECT NOMBREARTÍCULO, SECCIÓN, PRECIO, PAÍSDEORIGEN FROM PRODUCTOS"+
					" WHERE SECCIÓN=? AND PAÍSDEORIGEN=?";
					PreparedStatement objPrepareStatement= miConexion.prepareStatement(sentencia);
					
					objPrepareStatement.setString(1, "CONFECCIÓN");
					objPrepareStatement.setString(2, "ESPAÑA");
					
					
					//3.- EJECUTAR INSTRUCCION SQL
					ResultSet objetoResultSet= objPrepareStatement.executeQuery();
					
					//4.- LEER EL RESULTSET
					while(objetoResultSet.next()) {
						System.out.println(objetoResultSet.getString(1)+" "+objetoResultSet.getString(2)+" "+objetoResultSet.getString(3)+" "+objetoResultSet.getString(4) );
					}
					objetoResultSet.close();
					
					//REUTILIZACION DE CONSULTA PREPARADA INICIO
					System.out.println();
					System.out.println();
					
					objPrepareStatement.setString(1, "DEPORTES");
					objPrepareStatement.setString(2, "USA");
					
					ResultSet objetoResultSet2= objPrepareStatement.executeQuery();
					
					while(objetoResultSet2.next()) {
						System.out.println(objetoResultSet2.getString(1)+" "+objetoResultSet2.getString(2)+" "+objetoResultSet2.getString(3)+" "+objetoResultSet2.getString(4) );
					}
					
					objetoResultSet2.close();
					//REUTILIZACION DE CONSULTA PREPARADA FIN
					
					miConexion.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
