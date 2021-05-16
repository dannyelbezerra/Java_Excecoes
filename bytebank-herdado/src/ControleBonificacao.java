
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) { // O método que vai ser chamado, sempre será o específico; Tem referência genérica Funcionario, que aponta pra tipos de objetos diferente, desde que esteja em uma hierarquia definida;
		double boni = f.getbonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
