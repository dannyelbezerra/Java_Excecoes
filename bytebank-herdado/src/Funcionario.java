
public abstract class Funcionario { // Abstract est� relacionado com heran�a; N�o pode mais criar objetos dessa class, porque � abstrada;

	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; - O protected fica entre o public e private, e somente as classes filhas poder�o enxerg�-lo ;
	
	public Funcionario() {
		
	}
	
	//M�todo sem corpo, n�o h� implementa��o; As classes filhas concretas, tem que fazer a implementa��o do m�todo;
	
	public abstract double getbonificacao(); 
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
		
}


