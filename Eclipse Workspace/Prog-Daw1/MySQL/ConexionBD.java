import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	public static void main(String[] args) {
		String conector="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/gerardo";
		String user="root";
		String pass="";
		String consulta;
		String actualizacion;
	
		/***Conexion***/
		try {
			//Class.forName("conector").newInstance();
			Connection conexion=DriverManager.getConnection(url, user, pass);
			Statement stmt=conexion.createStatement();
			
			//actualizacion="insert asignatura values(100, 'Fregar platos', 6,'Basica',1,1,3,4)";
			//stmt.executeUpdate(actualizacion);
			consulta="SELECT * FROM asignatura where id=100";
			ResultSet result=stmt.executeQuery(consulta);
			while(result.next()) {
				System.out.println(result.getString(2));
			}
		}catch(SQLException e) {
			System.err.println("Error de conexion");
			e.printStackTrace();
		}
		
	}
}
