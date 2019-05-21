package VIEW;

public class Pessoa extends Usuario{
    //cadastros de pessoas objetos privados
	/* private String nome, endereco, bairro;
	private int cpf, rg, idade, cep;
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	
	public String getbairro() {
		return bairro;
	}
	public int getCpf() {
		return cpf;
	}
	public int getRG() {
		return rg;
	}
	public int getIdade() {
		return idade;
	}
	
	public int getCep() {
		return cep;
	}
 	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void setRG (int rg) {
		this.rg = rg;
	}
	
	public void Cep (int cep) {
		this.cep = cep;
	}*/
	
	Pessoa (String nkn, String passw) {
		super(nkn, passw);
	}
	Pessoa p = new Pessoa("Ayodele", "123");{

	System.out.println(p.nickname);
	
}
}