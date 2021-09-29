import java.sql.Connection;

public class Conexao {
	public Connection conectar() {
		try {
			Connection conn;  // objeto para conexão
			Class.forName("org.sqlite.JDBC"); 
			System.out.println("Driver JDBC encontrado! ");

		} catch(ClassNotFoundException ex) {
			System.out.println("Driver JDBC não encontrado! "+ ex);
			System.exit(0);
		}
		return null;
	}
	
	public void fecharConexao(Connection conn) {
		
	}
}
