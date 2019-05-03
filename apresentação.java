import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class apresentação extends JFrame{
	
	
	
	JLabel clogo = new JLabel("INFOTAG");

	
	JButton voltar= new JButton("Voltar");
	JButton caminhoneiro = new JButton("Caminhoneiro");
	JButton caminhões= new JButton("caminhões");
	JButton cargas = new JButton("cargas");
	
	
	
	
	public TelaDeCadastro() {
		super("Tela de Apresentação");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		
		
		
			
		this.setVisible(true);
		this.setSize(615, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
		
	
	public static void main(String args[]) {
		TelaDeCadastro tela = new TelaDeCadastro();
	}
	}
