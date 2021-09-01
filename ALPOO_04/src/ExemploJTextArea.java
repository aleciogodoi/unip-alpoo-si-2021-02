import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ExemploJTextArea extends JFrame {
	ExemploJTextArea(){
		JTextArea txtDescricao = new JTextArea();
		JScrollPane painelScroll = new JScrollPane(txtDescricao);
		painelScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		painelScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		add(painelScroll);
		setSize(400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExemploJTextArea();

	}
}
