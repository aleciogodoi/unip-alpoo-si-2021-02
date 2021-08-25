import java.awt.FlowLayout;

import javax.swing.JButton;

public class Exercicio01 extends TelaBase {

	Exercicio01(){
		setTitle("Lab 03 - Exercicio 01");
		setLayout(new FlowLayout());
		add(new JButton("Vermelho"));
		add(new JButton("Azul"));
		add(new JButton("Verde"));
		add(new JButton("Amarelo"));
		add(new JButton("Sair"));
		setVisible(true);
	}
	public static void main(String[] args) {
		Exercicio01 tela = new Exercicio01();

	}
}
