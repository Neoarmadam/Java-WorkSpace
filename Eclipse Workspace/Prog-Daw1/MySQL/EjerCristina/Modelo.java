package EjerCristina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Modelo {
	static String CONECTOR="com.mysql.jdbc.Driver";
	static String URL="jdbc:mysql://localhost:3306/jardineria";
	static String USER="root";
	static String PASS="admin";
	Statement stmt;
	
	
	void conectarBD() throws SQLException {
		Connection conexion=DriverManager.getConnection(URL, USER, PASS);
		stmt=conexion.createStatement();
	}
	
	ResultSet consultar(String consulta) throws SQLException {
		return stmt.executeQuery(consulta);
	}
}