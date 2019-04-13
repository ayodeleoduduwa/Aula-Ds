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
	
	
	
	JTextField txtNome = new JTextField();
	JTextField txtend = new JTextField();
	JTextField txtci = new JTextField();
	JTextField txtbai = new JTextField();
	JTextField txttel = new JTextField();
	JTextField txtRG = new JTextField();
	JRadioButton[] rdbSEX = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{
	rdbSEX[0] = new JRadioButton("Feminino");
	rdbSEX[1] = new JRadioButton("Masculino");}
	JTextField txtCEP = new JTextField();
	JComboBox cmbUF = new JComboBox();
	JTextField txtCEL = new JTextField();
	JTextField txtCPF = new JTextField();
	
	
	JLabel lblnome = new JLabel("NOME:");
	JLabel lblend = new JLabel("ENDEREÇO:");
	JLabel lblci = new JLabel("CIDADE:");
	JLabel lblba = new JLabel("BAIRRO:");
	JLabel lbltel = new JLabel("TELEFONE:");
	JLabel lblRg = new JLabel("RG:");
	JLabel lblSEX = new JLabel("SEXO:");
	JLabel lblCEP = new JLabel("CEP:");
	JLabel lblEST = new JLabel("ESTADO:");
	JLabel lblCEL = new JLabel("CELULAR:");
	JLabel lblCPF = new JLabel("CPF:");
	
	JButton btnSALV = new JButton("Salvar");
	JButton btnIMPRI = new JButton("Imprimir");
	
	MaskFormatter formTEL = null; 
	MaskFormatter formCEL = null;
	MaskFormatter formCPF = null;
	MaskFormatter formCEP = null;
	MaskFormatter formRG = null;
	
	
	public TelaDeCadastro() {
		super("Tela cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		txtNome.setBounds(90, 20, 200, 30);
		paine.add(txtNome);
		lblnome.setBounds(10, 20, 200, 30);
		paine.add(lblnome);
		
		txtend.setBounds(90, 60, 200, 30);
		paine.add(txtend);
		lblend.setBounds(10, 60, 200, 30);
		paine.add(lblend);
		
		txtci.setBounds(90, 100, 200, 30);
		paine.add(txtci);
		lblci.setBounds(10, 100, 200, 30);
		paine.add(lblci);
		
		txtbai.setBounds(90, 140, 200, 30);
		paine.add(txtbai);
		lblba.setBounds(10, 140, 200, 30);
		paine.add(lblba);
		
		
		try {
			formTEL = new MaskFormatter("(##)####-####");
			txttel = new JFormattedTextField(formTEL);
		} catch (Exception ext) {
			ext.printStackTrace();
		}
		txttel.setBounds(90, 180, 200, 30);
		paine.add(txttel);
		
		lbltel.setBounds(10, 180, 200, 30);
		paine.add(lbltel);
		
		try {
			formRG = new MaskFormatter("##.###.###-A");
			txtRG = new JFormattedTextField(formRG);
		} catch (Exception exr) {
			exr.printStackTrace();
		}
		txtRG.setBounds(90, 220, 200, 30);
		paine.add(txtRG);
		lblRg.setBounds(10, 220, 200, 30);
		paine.add(lblRg);
		
		grupo.add(rdbSEX[0]); 
		grupo.add(rdbSEX[1]);
		paine.add(rdbSEX[0]); 
		rdbSEX[0].setBounds(400, 20, 85, 30);
		paine.add(rdbSEX[1]);
		rdbSEX[1].setBounds(500, 20, 90, 30);
		lblSEX.setBounds(320, 20, 200, 30);
		paine.add(lblSEX);
		
		try { 
			formCEP = new MaskFormatter("###-#####");
			txtCEP = new JFormattedTextField(formCEP);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		txtCEP.setBounds(400, 60, 185, 30);
		paine.add(txtCEP);
		lblCEP.setBounds(320, 60, 200, 30);
		paine.add(lblCEP);
		paine.add(cmbUF);
		cmbUF.setBounds(400, 100, 185, 30);
		cmbUF.addItem("AC");		cmbUF.addItem("AL");
		cmbUF.addItem("AP");		cmbUF.addItem("AM");
		cmbUF.addItem("BA");		cmbUF.addItem("CE");
		cmbUF.addItem("DF");		cmbUF.addItem("ES");
		cmbUF.addItem("GO");		cmbUF.addItem("MA");
		cmbUF.addItem("MT");		cmbUF.addItem("MS");
		cmbUF.addItem("MG");		cmbUF.addItem("PA");
		cmbUF.addItem("PB");		cmbUF.addItem("PR");
		cmbUF.addItem("PE");		cmbUF.addItem("PI");
		cmbUF.addItem("RJ");		cmbUF.addItem("RN");
		cmbUF.addItem("RS");		cmbUF.addItem("RO");
		cmbUF.addItem("RR");		cmbUF.addItem("SC");
		cmbUF.addItem("SP");		cmbUF.addItem("SE");
		cmbUF.addItem("TO");	
		
		lblEST.setBounds(320, 100, 200, 30);
		paine.add(lblEST);
		try {
			formCEL = new MaskFormatter("(##)#####-####");
			txtCEL = new JFormattedTextField(formCEL);
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		txtCEL.setBounds(400, 140, 185, 30);
		paine.add(txtCEL);
		lblCEL.setBounds(320, 140, 200, 30);
		paine.add(lblCEL);
		
		
		try {
			formCPF = new MaskFormatter("###.###.###-##");
			txtCPF = new JFormattedTextField(formCPF);
		} catch (Exception exf) {
			exf.printStackTrace();
		}
		txtCPF.setBounds(400, 180, 185, 30);
		paine.add(txtCPF);
		lblCPF.setBounds(320, 180, 200, 30);
		paine.add(lblCPF);
		
		paine.add(btnSALV);
		btnSALV.setBounds(450, 250, 140, 30);
		
		paine.add(btnIMPRI);
		btnIMPRI.setBounds(300, 250, 140, 30);
		
			
		this.setVisible(true);
		this.setSize(615, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}
		
	
	public static void main(String args[]) {
		TelaDeCadastro tela = new TelaDeCadastro();
	}
	}
	
