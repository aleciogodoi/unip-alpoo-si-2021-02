import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	public static void main(String[] args) {
		Conexao conexao = new Conexao();
		Connection conn = conexao.conectar();  // Objeto para manipular a conexao
		
		String sql = "Select idDepto, NomeDepto From Departamento"; // string com código SQL
		
		try {
			Statement comandoSQL = conn.createStatement();  // Objeto para comando SQL
			ResultSet rs = comandoSQL.executeQuery(sql);    // Objeto para resultados de consultas
			
			while(rs.next()) {
				System.out.println("Id Depto:"+rs.getInt("IdDepto")+ ", Nome: "+rs.getString("NomeDepto"));
			}
		} catch (SQLException e) {
			System.out.println("Erro SQL! "+e);
		}
		
		conexao.fecharConexao(conn);
	}
}
