import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tela01 {
	public static void main(String[] args) {
		Frame t01 = new Frame(); // cria objeto Frame (janela)
		t01.setTitle("Tela 01 - Utilizando AWT"); // titulo da janela
		t01.setSize(500, 300); // tamanho da janela horizontal x vertical
		t01.setVisible(true);  // janela visivel 
		// Fechamento da Janela
		t01.addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				System.exit(0);
			}  
		});  

	}
}
