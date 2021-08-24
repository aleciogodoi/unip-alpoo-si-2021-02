import java.awt.*;
import javax.swing.*;

public class ExemploJFrame extends JFrame {
	public ExemploJFrame() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		setSize(d);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
	public static void main(String[] args) {
		ExemploJFrame tela = new ExemploJFrame();
		tela.getContentPane().setBackground(Color.blue);
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ExemploJFrame tela2 = new ExemploJFrame();
		tela2.getContentPane().setBackground(Color.black);
		tela2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
}