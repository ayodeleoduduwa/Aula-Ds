package VIEW;

public class cadastro {
public static void main (String args []) {

	Pessoafisica pf = new Pessoafisica();
	Pessoajuridica pj = new Pessoajuridica();

      pf.setNome("Nome: Ayodele");
      pf.setEndereco("Endereço: Rua visconde de alzejur");
 	
      pj.setRazaosocial("Nome da Empresa: Empresa AGL");
      pj.setEndereco("Endereço da Empresa: ETEC");
      
	Pessoa pessoa = new Pessoa();
	
	
	pessoa.setBairro("Itaim Paulista");

	pessoa.setIdade(16);
	pessoa.setCpf(108130210);
	pessoa.setRG(41554455);
	pessoa.Cep(51545);
	
	
	
	
	
	
	System.out.println("Cadastro de Cliente");

	System.out.println("PESSOA Fisica -");
	System.out.println(pf.getNome());
	System.out.println(pf.getEndereco());
	System.out.print("Bairro: ");
	System.out.println(pessoa.getbairro());
	System.out.print("RG:");
	System.out.println(pessoa.getRG());
	System.out.print("Cep:");
	System.out.println(pessoa.getCep());
	System.out.print("Cep:");
	System.out.println(pessoa.getCpf());
	System.out.print("Idade:");
	System.out.println(pessoa.getIdade());
	System.out.println("PESSOA Juridica -");
	System.out.println(pj.getRazaosocial());
	System.out.println(pj.getEndereco());
	
	
}
}
