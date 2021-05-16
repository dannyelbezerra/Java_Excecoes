
public abstract class Funcionario { // Abstract está relacionado com herança; Não pode mais criar objetos dessa class, porque é abstrada;

	private String nome;
	private String cpf;
	private double salario;
	//protected double salario; - O protected fica entre o public e private, e somente as classes filhas poderão enxergá-lo ;
	
	public Funcionario() {
		
	}
	
	//Método sem corpo, não há implementação; As classes filhas concretas, tem que fazer a implementação do método;
	
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


