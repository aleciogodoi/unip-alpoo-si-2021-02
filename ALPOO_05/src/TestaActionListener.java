import java.awt.FlowLayout;

import javax.swing.JButton;

public class TestaActionListener extends TelaBase {

	JButton btVermelho = new JButton("Vermelho");
	JButton btAzul = new JButton("Azul");
	JButton btVerde = new JButton("Verde");
	JButton btAmarelo = new JButton("Amarelo");
	JButton btSair = new JButton("Sair");

	TestaActionListener(){
		this.setLayout(new FlowLayout());
		this.add(btVermelho);
		this.add(btAzul);
		this.add(btVerde);
		this.add(btAmarelo);
		this.add(btSair);
	}
	public static void main(String[] args) {
		TestaActionListener t01 = new TestaActionListener();
		t01.setVisible(true);
	}
}
