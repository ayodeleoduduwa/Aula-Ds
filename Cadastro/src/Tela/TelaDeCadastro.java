package Tela;

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

public class TelaDeCadastro extends JFrame{
	JTextField txtnome = new JTextField();
	JTextField txtendereco = new JTextField();
	JTextField txtcep= new JTextField();
	JTextField txtcel = new JTextField();
	JTextField txtCPF = new JTextField();
	JTextField txtTel = new JTextField();
	JTextField txtRG = new JTextField();
    JTextField txtcidade = new JTextField();
	JTextField txtbairro = new JTextField();
	
	

	JLabel lblcRG = new JLabel("RG:");
	JLabel lblcSex = new JLabel("Sexo:");
	JLabel lblcCPF = new JLabel("CPF:");
	JLabel lblcbairro = new JLabel("Bairro:");
    JLabel lblcnome = new JLabel("Nome:");
	JLabel lblcendereco = new JLabel("Endereço:");
	JLabel lblccep = new JLabel("CEP:");
	JLabel lblcUF = new JLabel("Estado:");
	JLabel lblccel = new JLabel("Celular:");
	JLabel lblccidade = new JLabel("Cidade:");
	JLabel lblctel = new JLabel("Telefone:");
	JLabel lblsexo = new JLabel ("Sexo:");
	
	JButton btnSALV = new JButton("Salvar");
	JButton btnIMPRI = new JButton("Imprimir");
	
	JRadioButton[] rdbsexo = new JRadioButton[2]; 
	ButtonGroup grupo = new  ButtonGroup();{
	rdbsexo[0] = new JRadioButton("Masculino");
	rdbsexo[1] = new JRadioButton("Feminino");}
 
	JComboBox CMUF = new JComboBox();
	
	MaskFormatter tel = null; 
	MaskFormatter cel = null;
	MaskFormatter cpf = null;
	MaskFormatter cep = null;
	MaskFormatter rg = null;
	

	
	
	public TelaDeCadastro() {
		super("Tela cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		

		

        txtRG.setBounds(80, 60, 200, 30);
		paine.add(txtRG);
		lblcRG.setBounds(10, 60, 170, 30);
		paine.add(lblcRG);
		
		paine.add(lblccep);
		lblccep.setBounds(290,60, 170, 30);
		paine.add(txtcep);
		txtcep.setBounds(320,60, 140,30);
		
		txtendereco.setBounds(80, 220, 200, 30);
		paine.add(txtendereco);
		lblcendereco.setBounds(10, 220, 122, 30);
		paine.add(lblcendereco);
		
		
		
		txtnome.setBounds(80, 20, 200, 30);
		paine.add(txtnome);
		lblcnome.setBounds(10, 20, 150, 30);
		paine.add(lblcnome);

		txtcidade.setBounds(80, 100, 200, 30);
		paine.add(txtcidade);
		lblccidade.setBounds(10, 100, 140, 30);
		paine.add(lblccidade);
		
		txtbairro.setBounds(80, 140, 200, 30);
		paine.add(txtbairro);
		lblcbairro.setBounds(10, 140, 140, 30);
		paine.add(lblcbairro);
		
		paine.add(txtcel);
		txtcel.setBounds(335, 140, 125, 30);	
		paine.add(lblccel);
		lblccel.setBounds(290, 140, 90, 30);
		
		
		try {
			tel = new MaskFormatter("(##)####-####"); 
			txtTel= new JFormattedTextField(tel);
		} catch (Exception ext) { 
			ext.printStackTrace();
		
		txtTel.setBounds(80, 180, 200, 30);
		paine.add(txtTel);
		lblctel.setBounds(10, 180, 125, 30);
		paine.add(lblctel);
		
        paine.add(lblsexo);
        lblsexo.setBounds(290, 15, 125, 30);				
		grupo.add(rdbsexo[0]); 
		grupo.add(rdbsexo[1]);
		paine.add(rdbsexo[0]); 
		rdbsexo[0].setBounds(340, 15, 90, 30);
		paine.add(rdbsexo[1]);
		rdbsexo[1].setBounds(430, 15, 90, 30);
	
		
		paine.add(lblcCPF);
		lblcCPF.setBounds(290, 180, 125, 30);
		paine.add(txtCPF);
        txtCPF.setBounds(320, 180, 140, 30);
		
		paine.add(lblcUF);
		lblcUF.setBounds(290, 100, 90, 30);
		
		paine.add(CMUF);
		CMUF.setBounds(340, 100, 90, 30);
		CMUF.addItem("AC");
		CMUF.addItem("AP");
		CMUF.addItem("BA");
		CMUF.addItem("DF");
		CMUF.addItem("GO");
		CMUF.addItem("MT");
		CMUF.addItem("MG");
		CMUF.addItem("PB");
		CMUF.addItem("PE");
		CMUF.addItem("RJ");
		CMUF.addItem("RS");
		CMUF.addItem("SP");
		CMUF.addItem("TO");
		CMUF.addItem("AL");
		CMUF.addItem("AM");
		CMUF.addItem("CE");
		CMUF.addItem("ES");
		CMUF.addItem("MA");
		CMUF.addItem("MS");
		CMUF.addItem("PA");
		CMUF.addItem("PR");
		CMUF.addItem("PI");
		CMUF.addItem("RN");
		CMUF.addItem("RO");
		CMUF.addItem("SC");
		CMUF.addItem("SE");
		
		paine.add(btnSALV);
		btnSALV.setBounds(160, 300, 140, 30);
		
		paine.add(btnIMPRI);
		btnIMPRI.setBounds(10, 300, 140, 30);
		
	
		
				
		
		
		paine.add(btnIMPRI);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}}
	public static void main(String args[]) {
		 TelaDeCadastro tela = new TelaDeCadastro();
	}
}