package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class janela extends JFrame {

	JTextField lblbranco = new JTextField();
	
	JButton lblex = new JButton("Exibir");
	JButton lbled = new JButton("Editar");
	JButton lblaju  = new JButton("Ajuda");
	JButton lblmc  = new JButton("mc");
	JButton lblms  = new JButton("ms");
	JButton lblmr  = new JButton("mr");
	JButton lbla  = new JButton("Ajuda");
	JButton lblse  = new JButton("<-");
	JButton lblce  = new JButton("ce");
	JButton lblc  = new JButton("c");
	JButton lblmn  = new JButton("+-");
	JButton lblra  = new JButton("_/-");
	JButton lblme  = new JButton("m-");
	JButton lblma  = new JButton("m+");
	JButton lblpo = new JButton("%");
	
	
	
	
	JButton lbl0 = new JButton("0");
	JButton lbl1 = new JButton("4");
	JButton lbl2 = new JButton("5");
	JButton lbl3 = new JButton("6");
	JButton lbl4 = new JButton("7");
	JButton lbl5 = new JButton("8");
	JButton lbl6 = new JButton("9");
	JButton lbl7 = new JButton("1");
	JButton lbl8 = new JButton("2");
	JButton lbl9 = new JButton("3");
	
	JButton lblmm = new JButton("+");
	JButton lblmee = new JButton("-");
	JButton lblx = new JButton("X");
	JButton lbldiv = new JButton("/");
	JButton lblv = new JButton(",");
	JButton lbli = new JButton("=");
	JButton lblum = new JButton("1/x");

	
	

	
	
	public janela() {
		super();
		
		Container paine = this.getContentPane();
		
		paine.setLayout(null);
		
		paine.add(lblbranco);
	    lblbranco.setBounds(10, 30, 293, 50);
	    
	    paine.add(lblex);
	    lblex.setBounds(10, 2, 75, 25);
	    
	    paine.add(lbled);
	    lbled.setBounds(85, 2, 75, 25);
	    
	    paine.add(lblaju);
	    lblaju.setBounds(160, 2, 75, 25);
	    
	    paine.add(lbl0);
	    lbl0.setBounds(10, 220, 115, 25);
	    
	    
	    paine.add(lbl1);
	    lbl1.setBounds(10, 160,55 , 25);
	    
	    paine.add(lbl2);
	    lbl2.setBounds(70, 160, 55, 25);
	    
	    paine.add(lbl3);
	    lbl3.setBounds(130, 160, 55, 25);
	    
	    paine.add(lbl4);
	    lbl4.setBounds(10,130,55,25);
	    
	    paine.add(lbl5);
	    lbl5.setBounds(70, 130, 55, 25);
	    
	    paine.add(lbl6);
	    lbl6.setBounds(130, 130, 55, 25);
	    
	    paine.add(lbl7);
	    lbl7.setBounds(10, 190, 55, 25);
	    
	    paine.add(lbl8);
	    lbl8.setBounds(70, 190, 55, 25);
	    
	    paine.add(lbl9);
	    lbl9.setBounds(130, 190, 55, 25);
	
	    paine.add(lblmn);
	    lblmn.setBounds(188, 107, 55, 25);
	
	    paine.add(lblmm);
	    lblmm.setBounds(188, 220, 55, 25);
	    paine.add(lblmee);
	    lblmee.setBounds(189, 190, 55, 25);
	
	    paine.add(lblx);
	    lblx.setBounds(189, 160, 55, 25);
	
	    paine.add(lbldiv);
	    lbldiv.setBounds(188, 133, 55, 25);
	    
	    paine.add(lblmc);
	    lblmc.setBounds(10, 80, 55, 25);
	    
	    paine.add(lblmr);
	    lblmr.setBounds(70, 80, 55, 25);
	    
	    paine.add(lblms);
	    lblms.setBounds(129, 80, 55, 25);
	    
	    paine.add(lblma);
	    lblma.setBounds(188, 80, 55, 25);
	    
	    paine.add(lblme);
	    lblme.setBounds(247, 80, 55, 25);
	    
	    paine.add(lblv);
	    lblv.setBounds(130, 220, 55, 25);
	    paine.add(lblra);
	    lblra.setBounds(247, 107, 55, 25);
	    paine.add(lbli);
	    lbli.setBounds(247, 190, 55, 55);
	    paine.add(lblse);
	    lblse.setBounds(10, 105, 55, 25);
	
	    paine.add(lblc);
	    lblc.setBounds(129, 105, 55, 25);
	
	    paine.add(lblce);
	    lblce.setBounds(70, 105, 55, 25);
	    paine.add(lblpo);
	    lblpo.setBounds(247, 160, 55, 25);
	
	    paine.add(lblum);
	    lblum.setBounds(247, 133, 55, 25);
	
	
	
	
		this.setSize(320,280); 
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
public static void main(String Args[]) {
	janela Janela = new janela();
}

	
	

}


