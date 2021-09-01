import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ExemploJComboBox extends JFrame {
	ExemploJComboBox() {
		setTitle("Exemplo JComboBox");
		String paises[] = {"Brasil","India","Estados Unidos","Chile","Japão"};
		JComboBox cb = new JComboBox(paises);
		cb.setBounds(50, 50, 90, 20);
		add(cb);
		setLayout(null);
		setVisible(true);
		setSize(200, 300);
	}

	public static void main(String[] args) {
		new ExemploJComboBox();
	}
}
