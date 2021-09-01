import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ExemploJCheckBox extends JFrame{
	JCheckBox chkProgramacao, chkBancoDados, chkAnalise;
	JButton btn;
	ExemploJCheckBox(){
		chkProgramacao = new JCheckBox("Programação");
		chkBancoDados = new JCheckBox("Banco de Dados");
		chkAnalise = new JCheckBox("Análise de Sistemas");
		btn = new JButton("Ok");
		JPanel p = new JPanel(new GridLayout(3,1));
		TitledBorder titulo = BorderFactory.createTitledBorder("Assunto");
		p.setBorder(titulo);
		p.add(chkProgramacao);
		p.add(chkBancoDados);
		p.add(chkAnalise);
		add(p, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ExemploJCheckBox();
	}

}
