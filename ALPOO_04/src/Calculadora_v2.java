import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Calculadora_v2 extends TelaBase {

	Calculadora_v2() {
		JPanel painelBotoes = new JPanel();
		painelBotoes.setLayout(new GridLayout(6,4));
		
		painelBotoes.add(new JButton ("%"));
		painelBotoes.add(new JButton ("CE"));
		painelBotoes.add(new JButton ("C"));
		painelBotoes.add(new JButton ("Back"));

		painelBotoes.add(new JButton ("1/2"));
		painelBotoes.add(new JButton ("x^2"));
		painelBotoes.add(new JButton ("Raiz"));
		painelBotoes.add(new JButton ("/"));

		painelBotoes.add(new JButton ("7"));
		painelBotoes.add(new JButton ("8"));
		painelBotoes.add(new JButton ("9"));
		painelBotoes.add(new JButton ("X"));

		painelBotoes.add(new JButton ("4"));
		painelBotoes.add(new JButton ("5"));
		painelBotoes.add(new JButton ("6"));
		painelBotoes.add(new JButton ("-"));

		painelBotoes.add(new JButton ("1"));
		painelBotoes.add(new JButton ("2"));
		painelBotoes.add(new JButton ("3"));
		painelBotoes.add(new JButton ("+"));
		
		painelBotoes.add(new JButton ("+/-"));
		painelBotoes.add(new JButton ("0"));
		painelBotoes.add(new JButton (","));
		painelBotoes.add(new JButton ("="));
		
	}
	
	public static void main(String[] args) {

	}

}
