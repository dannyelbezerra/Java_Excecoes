//o gerente herda da class Funcionario e assina o contrato autenticavel e é um Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {//construtor
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getbonificacao() {//Super - tem que olhar pra cima, para a super class; Reescreveu, aproveitou, o método da class mãe, na class filha;
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario(); // o super significa que, esse atributo não está definido nessa class e que vem da super class ou class mãe, class base;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
		



