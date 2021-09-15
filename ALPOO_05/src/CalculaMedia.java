import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculaMedia extends TelaBase implements ActionListener {
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
		this.setTitle("C�lculo de M�dias"); // Titulo do Frame
		this.setSize(300, 150); // Tamanho do Frame/Janela
		this.setResizable(false); // A Janela n�o pode ter o tamanho alterado
		
		btCalcular = new JButton("Calcular"); // instanciando bot�o calcular
		btSair = new JButton("Sair"); // instanciando bot�o sair
		lblNota1 = new JLabel("Nota 1"); // instanciando label "Nota 1"
		lblNota2 = new JLabel("Nota 2"); // instanciando label "Nota 2"
		lblMedia = new JLabel("M�dia"); // instanciando label "M�dia"
		lblValorMedia = new JLabel(); // instanciando label "Valor M�dia"
		txtNota1 = new JTextField(); // caixa de texto para Nota 1
		txtNota2 = new JTextField(); // caixa de texto para Nota 2

		this.add(lblNota1); // adicionando label Nota 1 na Janela
		this.add(txtNota1); // adicionando caixa de texto Nota 1 na Janela
		this.add(lblNota2); // adicionando label Nota 2 na Janela
		this.add(txtNota2); // adicionando caixa de texto Nota 2 na Janela
		this.add(lblMedia); // adicionando label M�dia na Janela
		this.add(lblValorMedia);  // adicionando label Valor M�dia na Janela
		this.add(btCalcular);  // adicionando bot�o calcular na Janela
		this.add(btSair); // adicionando bot�o sair na Janela
		this.setVisible(true); // tornando Janela visivel

		this.btCalcular.addActionListener(this); // setando o bot�o Calcular para responder ao click
		this.btSair.addActionListener(this); // setando o bot�o Sair para responder ao click
	}
	
	public static void main(String[] args) {
		t01 = new CalculaMedia();  // criando um objeto do tipo CalculaMedia
	}

	// trantando o eventos de click dos bot�es
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btSair) {   // bot�o sair pressionado
			System.exit(0);
		} else if (e.getSource() == btCalcular) { // bot�o calcular pressionado
			lblValorMedia.setText(null);
			try {
				nota1 = Float.valueOf(txtNota1.getText());
				nota2 = Float.valueOf(txtNota2.getText());
				if ( (nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)) {
					lblValorMedia.setText("Valor(es) Inv�lido(s)!");
				}
				else {
					media = (nota1 + nota2) / 2;
					lblValorMedia.setText(String.valueOf(media));
				}
				
			} catch (NumberFormatException erro) {
				lblValorMedia.setText("Somente N�meros!");			
			}
			
			if (media >= 7.0f) {
				lblValorMedia.setForeground(Color.blue);
			} else {
				lblValorMedia.setForeground(Color.red);
			}
		}
	}
		
}
