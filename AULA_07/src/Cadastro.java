import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
		
	}
	
	public static void main(String[] args) {
		t01 = new Cadastro();
	}

}
