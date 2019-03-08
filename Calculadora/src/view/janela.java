package view;

import javax.swing.JFrame;

import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;

import javax.swing.JTextField;

import vieww.FuncoesMatematicas;



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
	JButton lbl1 = new JButton("1");
	JButton lbl2 = new JButton("2");
	JButton lbl3 = new JButton("3");
	JButton lbl4 = new JButton("4");
	JButton lbl5 = new JButton("5");
	JButton lbl6 = new JButton("6");
	JButton lbl7 = new JButton("7");
	JButton lbl8 = new JButton("8");
	JButton lbl9 = new JButton("9");
	JButton lblmm = new JButton("+");
	JButton lblmee = new JButton("-");
	JButton lblx = new JButton("X");
	JButton lbldiv = new JButton("/");
	JButton lblv = new JButton(",");
	JButton lbli = new JButton("=");
	JButton lblum = new JButton("1/x");


	FuncoesMatematicas mat = new FuncoesMatematicas();
  	String sinal = null;
  			double valor1 = 0, valor2 = 0;
	
	
	
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
	    lbl0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("0");
				}else {
					lblbranco.setText(lblbranco.getText() + "0");
				}
				
				
			}
		});
	    
	    paine.add(lbl1);
	    lbl1.setBounds(10,133,55,25);
	    lbl1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("1");
				}else {
					lblbranco.setText(lblbranco.getText() + "1");
				}
				
				
			}
		});
	    
	    paine.add(lbl2);
	    lbl2.setBounds(70, 133, 55, 25);
	    lbl2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("2");
				}else {
					lblbranco.setText(lblbranco.getText() + "2");
				}
				
				
			}
		});
	    
	    paine.add(lbl3);
	    lbl3.setBounds(130, 133, 55, 25);
	    lbl3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("3");
				}else {
					lblbranco.setText(lblbranco.getText() + "3");
				}
				
				
			}
		});
	    
	    paine.add(lbl4);
	    lbl4.setBounds(10, 160,55 , 25);
	    lbl4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("4");
				}else {
					lblbranco.setText(lblbranco.getText() + "4");
				}
				
				
			}
		});
	    
	    paine.add(lbl5);
	    lbl5.setBounds(70, 160, 55, 25);
	    lbl5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("5");
				}else {
					lblbranco.setText(lblbranco.getText() + "5");
				}
				
				
			}
		});
	    
	    paine.add(lbl6);
	    lbl6.setBounds(130, 160, 55, 25);
	    lbl6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("6");
				}else {
					lblbranco.setText(lblbranco.getText() + "6");
				}
				
				
			}
		});
	
	    paine.add(lbl7);
	    lbl7.setBounds(10, 190, 55, 25);
	    lbl7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("7");
				}else {
					lblbranco.setText(lblbranco.getText() + "7");
				}
				
				
			}
		});
	    paine.add(lbl8);
	    lbl8.setBounds(70, 190, 55, 25);
	    lbl8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("8")) {
					lblbranco.setText("7");
				}else {
					lblbranco.setText(lblbranco.getText() + "8");
				}
				
				
			}
		});
	    
	    paine.add(lbl9);
	    lbl9.setBounds(130, 190, 55, 25);
	    lbl9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(lblbranco.getText().equals("0")) {
					lblbranco.setText("9");
				}else {
					lblbranco.setText(lblbranco.getText() + "9");
				}
				
				
			}
		});
	
	    paine.add(lblmn);
	    lblmn.setBounds(188, 107, 55, 25);
	
	    paine.add(lblmm);
	    lblmm.setBounds(188, 220, 55, 25);
	    lblmm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblbranco.getText());
				sinal = "soma";
				lblbranco.setText("0");
			}
		});
	    
	    paine.add(lblmee);
	    lblmee.setBounds(189, 190, 55, 25);
	    lblmee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(lblbranco.getText());
				sinal = "menos";
				lblbranco.setText("0");
			}
		});
	    
	
	    paine.add(lblx);
	    lblx.setBounds(189, 160, 55, 25);
	
	    paine.add(lbldiv);
	    lbldiv.setBounds(188, 133, 55, 25);
	    
	    paine.add(lblmc);
	    lblmc.setBounds(10, 80, 55, 25);
	    
	    paine.add(lblmr);
	    lblmr.setBounds(70, 80, 55, 25);
	    
	    paine.add(lblms);
	    lblms.setBounds(130, 80, 55, 25);
	    
	    paine.add(lblma);
	    lblma.setBounds(188, 80, 55, 25);
	    lblma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = "soma";
			}
		});
	    
	    paine.add(lblme);
	    lblme.setBounds(247, 80, 55, 25);
	 
	    
	    paine.add(lblv);
	    lblv.setBounds(130, 220, 55, 25);
	    paine.add(lblra);
	    lblra.setBounds(247, 107, 55, 25);
	    paine.add(lbli);
	    lbli.setBounds(247, 190, 55, 55);
	    lbli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(lblbranco.getText());

				if(sinal.equals("soma")) {
					lblbranco.setText(mat.soma(valor1, valor2) + "");
				}
				else if (sinal.equals("menos")) {
					lblbranco.setText(mat.menos(valor1, valor2)  );
				}
				
			}
		});
	    paine.add(lblse);
	    lblse.setBounds(10, 107, 55, 25);
	
	    paine.add(lblc);
	    lblc.setBounds(130, 107, 55, 25);
		lblc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblbranco.setText("0");
				
			}
		});
	    paine.add(lblce);
	    lblce.setBounds(70, 107, 55, 25);
	    
	  
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


