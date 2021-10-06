import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame implements ActionListener{

	JLabel lblCodigo, lblNome, lblEmail, lblTelefone, lblEndereco;
	JTextField txtCodigo, txtNome, txtEmail, txtTelefone, txtEndereco;
	JPanel painel2, painel3;
	JButton btSalvar, btPesquisar, btLimpar, btSair;
	static Cadastro t01;
	
	
	private static Statement comandoSQL;
	Conexao conexao = new Conexao();
	Cadastro(){
		this.setTitle("Cadastro Usuários");
		this.setSize(500,200);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLayout(new BorderLayout(5,10));

		this.btPesquisar = new JButton("Pesquisar");
		this.btLimpar = new JButton("Limpar");
		this.btSalvar = new JButton("Salvar");
		this.btSair = new JButton("Sair");
		
		painel2 = new JPanel( new FlowLayout(FlowLayout.RIGHT));
		painel2.add(btPesquisar);
		painel2.add(btLimpar);
		painel2.add(btSalvar);
		painel2.add(btSair);
		
		painel3 = new JPanel(new GridLayout(5,2,10,5));
		lblCodigo = new JLabel("Código");
		lblNome = new JLabel("Nome");
		lblEmail = new JLabel("Email");
		lblTelefone = new JLabel("Telefone");
		lblEndereco = new JLabel("Endereço");

		txtCodigo = new JTextField();
		txtNome = new JTextField();
		txtEmail = new JTextField();
		txtTelefone = new JTextField();
		txtEndereco = new JTextField();

		painel3.add(lblCodigo);
		painel3.add(txtCodigo);

		painel3.add(lblNome);
		painel3.add(txtNome);

		painel3.add(lblEmail);
		painel3.add(txtEmail);

		painel3.add(lblTelefone);
		painel3.add(txtTelefone);

		painel3.add(lblEndereco);
		painel3.add(txtEndereco);
		painel3.setBackground(Color.WHITE);
		
		this.add(painel2, BorderLayout.SOUTH);
		this.add(painel3, BorderLayout.CENTER);
		this.setVisible(true);
		
		btSalvar.addActionListener(this);
		btLimpar.addActionListener(this);
		btPesquisar.addActionListener(this);
		btSair.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		t01 = new Cadastro();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btSair) {
			System.exit(0);
		} else if (e.getSource() == btLimpar) {
			limpar();
		} else if (e.getSource() == btPesquisar) {
			if (!(txtCodigo.getText().isEmpty())) {
				pesquisar(txtCodigo.getText(), "IdUsuario",true);
			} else if (!(txtNome.getText().isEmpty())) {
				pesquisar(txtNome.getText(), "nome",true);				
			} else if (!(txtEmail.getText().isEmpty())) {
				pesquisar(txtEmail.getText(), "email",true);				
			}
		} else if (e.getSource() == btSalvar) {
			salvar();
		}	
	}
	
	public boolean pesquisar(String texto, String campo, boolean atualizaTela) {
		String sql="";
		boolean flagEncontrado=false;
		Connection conn = null;
		conn = conexao.conectar();
		try {
			if (campo.equalsIgnoreCase("IdUsuario")) {
				sql = "Select * from Usuario Where "+campo+" = "+texto;
			} else {
				sql = "Select * from Usuario Where "+campo+" like '"+texto+"'";				
			}
			comandoSQL = conn.createStatement();
			ResultSet rs = comandoSQL.executeQuery(sql);
			
			if (rs.next()) {
				if (atualizaTela) {
					txtCodigo.setText(String.valueOf(rs.getInt("IdUsuario")));
					txtNome.setText(rs.getString("nome"));
					txtEmail.setText(rs.getString("email"));
					txtTelefone.setText(rs.getString("telefone"));
					txtEndereco.setText(rs.getString("endereco"));
				}
				flagEncontrado = true;
			} else if (atualizaTela) {
				JOptionPane.showMessageDialog(null, "Usuário Não Econtrado!");
			}
			
			conexao.fecharConexao(conn);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro execução comando \n" + comandoSQL+"\n"+e);
		}
		return flagEncontrado;
	}

	public void salvar() {
		String sql;
		String operacao;
		
		if (this.pesquisar(txtCodigo.getText(),"IdUsuario" , false)) {
			sql = " Update Usuario";
			sql+= " Set";
			sql+= "  nome ='"+txtNome.getText()+"'";
			sql+= " ,email ='"+txtEmail.getText()+"'";
			sql+= " ,telefone ='"+txtTelefone.getText()+"'";
			sql+= " ,endereco ='"+txtEndereco.getText()+"'";
			sql+= " Where idUsuario ="+txtCodigo.getText();
			operacao = "Alteração";
		} else  {
			sql = " Insert Into Usuario";
			sql+= " Values (";
			sql+= txtCodigo.getText();
			sql+= " ,'"+txtNome.getText()+"'";
			sql+= " ,'"+txtEmail.getText()+"'";
			sql+= " ,'"+txtTelefone.getText()+"'";
			sql+= " ,'"+txtEndereco.getText()+"'";
			sql+= " )";
			operacao = "Inclusão";			
		}
		Connection conn = null;
		conn = conexao.conectar();
		try {
			comandoSQL = conn.createStatement();
			comandoSQL.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, operacao+" realizada com sucesso!");			
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro execução comando \n" + comandoSQL+"\n"+e);			
		} finally {
			conexao.fecharConexao(conn);
		}
			
	}
	
	public void limpar() {
		txtCodigo.setText(null);
		txtNome.setText(null);
		txtEmail.setText(null);
		txtTelefone.setText(null);
		txtEndereco.setText(null);
		txtCodigo.requestFocus();
	}

}
