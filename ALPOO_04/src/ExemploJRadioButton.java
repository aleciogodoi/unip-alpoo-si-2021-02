import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class ExemploJRadioButton extends JFrame {
	JRadioButton rbMasc, rbFem;
	JButton btn;
	ButtonGroup bgSexo;
	ExemploJRadioButton(){
		rbMasc = new JRadioButton("Masc.", true);
		rbFem = new JRadioButton("Fem.");
		bgSexo = new ButtonGroup();
		bgSexo.add(rbMasc);
		bgSexo.add(rbFem);
		
		btn = new JButton("Ok");
		JPanel p = new JPanel(new GridLayout(3,1));
		TitledBorder titulo = BorderFactory.createTitledBorder("Sexo");
		p.setBorder(titulo);
		p.add(rbMasc);
		p.add(rbFem);
		add(p, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ExemploJRadioButton();
	}
}
