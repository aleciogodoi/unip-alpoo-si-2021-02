import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculaMedia extends TelaBase {
	float nota1, nota2, media;
	JButton btCalcular;
	JButton btSair;

	JLabel lblNota1;
	JLabel lblNota2;
	JLabel lblMedia;
	JLabel lblValorMedia;
	
	JTextField txtNota1;
	JTextField txtNota2;
	static CalculaMedia t01;
	
	CalculaMedia(){
		this.setLayout(new GridLayout(4,2,10,10));  // Definindo um Layout do Tipo GridLayout 4 linhas, 2 colunas
		this.setTitle("Cálculo de Médias"); // Titulo do Frame
		this.setSize(300, 150); // Tamanho do Frame/Janela
		this.setResizable(false); // A Janela não pode ter o tamanho alterado
		
		btCalcular = new JButton("Calcular"); // instanciando botão calcular
		btSair = new JButton("Sair"); // instanciando botão sair
		lblNota1 = new JLabel("Nota 1"); // instanciando label "Nota 1"
		lblNota2 = new JLabel("Nota 2"); // instanciando label "Nota 2"
		lblMedia = new JLabel("Média"); // instanciando label "Média"
		lblValorMedia = new JLabel(); // instanciando label "Valor Média"
		txtNota1 = new JTextField(); // caixa de texto para Nota 1
		txtNota2 = new JTextField(); // caixa de texto para Nota 2

		this.add(lblNota1);
		this.add(txtNota1);
		this.add(lblNota2);
		this.add(txtNota2);
		this.add(lblMedia);
		this.add(lblValorMedia);
		this.add(btCalcular);
		this.add(btSair);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		t01 = new CalculaMedia();
	}
	
	
}
