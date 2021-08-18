import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tela01_v02 {
	public static void main(String[] args) {
		
		Frame t01 = new Frame(); // cria objeto Frame (janela)
		t01.setTitle("Tela 01 - Utilizando AWT - Versao 2.0"); // titulo da janela
		t01.setSize(700, 400); // tamanho da janela horizontal x vertical
		t01.setLocation(100, 100); // posicionamento inicial
		//t01.setBackground(new Color(100,200,9));
		t01.setBackground(Color.blue);  // muda a cor de fundo
		t01.setResizable(false); // não deixa a janela ser redimensionada
		
		t01.setVisible(true);  // janela visivel 
		// Fechamento da Janela
		t01.addWindowListener(new WindowAdapter(){  
			public void windowClosing(WindowEvent e) {  
				System.exit(0);
			}  
		});  
	}
}
