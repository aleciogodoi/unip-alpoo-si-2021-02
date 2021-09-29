import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cadastro extends JFrame{

	JLabel lblCodigo, lblNome, lblEmail, lblTelefone, lblEndereco;
	JTextField txtCodigo, txtNome, txtEmail, txtTelefone, txtEndereco;
	JPanel painel2, painel3;
	JButton btSalvar, btPesquisar, btLimpar, btSair;
	static Cadastro t01;
	
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
	}
	
	public static void main(String[] args) {
	

	}

}
