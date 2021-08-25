import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayoutTest extends JFrame{
	GridLayoutTest(){
		setSize(170,270);
		setLayout(new GridLayout(4,3));
		add( new JButton("7"));
		add( new JButton("8"));
		add( new JButton("9"));
		add( new JButton("4"));
		add( new JButton("5"));
		add( new JButton("6"));
		add( new JButton("1"));
		add( new JButton("2"));
		add( new JButton("3"));
		add( new JButton("+/-"));
		add( new JButton("0"));
		add( new JButton(","));
	}
	public static void main(String[] args) {
		GridLayoutTest tela = new GridLayoutTest();
		tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		tela.setVisible(true);
	}
}
