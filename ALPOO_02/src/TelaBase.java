import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaBase extends Frame {
	
	// Construtor
	TelaBase() {
		Dimension d01 = new Dimension(300, 300);
		this.setTitle("Tela Base - Utilizando AWT");
		this.setSize(d01);
		// Fechamento da Janela
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

	}
}
