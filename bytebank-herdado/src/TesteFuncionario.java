
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente(); //cria uma refer�ncia � class Funcionario e inicializa o objeto, chamando o construtor Funcion�rio();
		nico.setNome("Nico Steppat");
		nico.setCpf("222222222-22");
		nico.setSalario(2600.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getbonificacao());
		
		//nico.salario = 300.0;
		
	}

}
