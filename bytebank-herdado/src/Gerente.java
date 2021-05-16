//o gerente herda da class Funcionario e assina o contrato autenticavel e � um Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {//construtor
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getbonificacao() {//Super - tem que olhar pra cima, para a super class; Reescreveu, aproveitou, o m�todo da class m�e, na class filha;
		System.out.println("Chamando o m�todo de bonificacao do GERENTE");
		return super.getSalario(); // o super significa que, esse atributo n�o est� definido nessa class e que vem da super class ou class m�e, class base;
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
		



