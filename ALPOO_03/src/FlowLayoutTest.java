import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	FlowLayoutTest(){
		setSize(400, 350);           // Tamanho da Tela
		setLayout(new FlowLayout(FlowLayout.RIGHT)); // Tipo de Layout da Tela
		add(new JButton("Um"));      // Botão
		add(new JButton("Dois"));    
		add(new JButton("Três"));	
		add(new JButton("Quatro"));    
		add(new JButton("Cinco"));	
		add(new JButton("Seis"));    
		add(new JButton("Sete"));	
	}
	
	public static void main(String[] args) {
		FlowLayoutTest tela01 = new FlowLayoutTest();
		tela01.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tela01.setVisible(true);
	}
}
