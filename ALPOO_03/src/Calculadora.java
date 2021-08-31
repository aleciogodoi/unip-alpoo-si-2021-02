import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends TelaBase {
	JLabel lblResultado;
	JTextField txtNumero1;
	JTextField txtNumero2;
	JPanel painel;
	JButton btSomar;
	JButton btSubtrair;
	JButton btMultiplicar;
	JButton btDividir;
	
	Calculadora(){
		lblResultado = new JLabel("123");
		
		txtNumero1 = new JTextField();
		txtNumero2 = new JTextField();
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(1,4));
		btSomar = new JButton("+");
		btSubtrair = new JButton("-");
		btMultiplicar = new JButton("*");
		btDividir = new JButton("/");
		
		painel.add(btSomar);
		painel.add(btSubtrair);
		painel.add(btMultiplicar);
		painel.add(btDividir);
		
		add(lblResultado);
		add(txtNumero1);
		add(txtNumero2);
		add(painel);
		
		setLayout(new GridLayout(4,1,5,5));
		setSize(250,150);
		setResizable(false);
		setTitle("Calculadora");
		
	}
	
	public static void main(String[] args) {
		Calculadora t01 = new Calculadora();
		
		t01.setVisible(true);
	}

}
