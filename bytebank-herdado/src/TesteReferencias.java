
public class TesteReferencias {

	public static void main(String[] args) {

		/*Criou um objeto do tipo gerente, 
		 * declarando uma variável G1 do tipo gerente,
		 * e atribuindo uma referência a essa variável;
		 * A referência pode ser mais genérica,
		 * trocando Gerente por Funcionario, pois Gerente HERDA de Funcionario;
		 */
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");// Altera o nome do gerente;
		g1.setSalario(5000.0); // Altera o salário do gerente;
				
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());

	}

}
