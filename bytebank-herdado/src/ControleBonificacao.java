
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) { // O m�todo que vai ser chamado, sempre ser� o espec�fico; Tem refer�ncia gen�rica Funcionario, que aponta pra tipos de objetos diferente, desde que esteja em uma hierarquia definida;
		double boni = f.getbonificacao();
		this.soma += boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
