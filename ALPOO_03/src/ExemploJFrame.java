import java.awt.*;
import javax.swing.*;


// Criando a classe ExemploJFrame que herdeira de JFrame
public class ExemploJFrame extends JFrame {
	public ExemploJFrame() {
		// criando um objeto da classe Toolkit
		Toolkit tk = Toolkit.getDefaultToolkit();
		
		// descobrir qual é o tamanho da nossa tela
		Dimension d = tk.getScreenSize();
		setSize(d);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		// criando a primeira tela
		ExemploJFrame tela = new ExemploJFrame();
		// tela com fundo azul
		tela.getContentPane().setBackground(Color.blue);
		// Quando clicar no botão de fechar Automaticamente esconde e elimina o frame.
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		// criando a primeira tela
		ExemploJFrame tela2 = new ExemploJFrame();
		// tela com fundo preto
		tela2.getContentPane().setBackground(Color.black);
		// Quando clicar no botão de fechar Automaticamente esconde e elimina o frame.
		tela2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
}