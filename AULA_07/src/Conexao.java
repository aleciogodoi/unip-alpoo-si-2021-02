import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conectar() {
		try {
			Connection conn;  // objeto para conex�o
			Class.forName("org.sqlite.JDBC"); 
			System.out.println("Driver JDBC encontrado! ");
			
			String pathBD = System.getProperty("user.dir").replace("\\", "/");
			String bdUrl = "jdbc:sqlite:"+pathBD + "/bd/ALPOO.db";
			
			conn  = DriverManager.getConnection(bdUrl);

			System.out.println("Conex�o realizada! "+conn);
			return conn;
		} catch(ClassNotFoundException ex) {
			System.out.println("Driver JDBC n�o encontrado! "+ ex);
			System.exit(0);
			return null;
		} catch (SQLException ex) {
			System.out.println("Problemas na conex�o com a base de dados! "+ ex);
			System.exit(0);	
			return null;
		} 
	}
	
	public void fecharConexao(Connection conn) {
		try {
			conn.close();
			System.out.println("Conex�o Fechada! "+ conn);
		} catch (SQLException e) {
			System.out.println("Problemas na conex�o com a base de dados! "+ e);
		}
	}
}
