/*Em Interfaces, quando est� assinando um contrato, utiliza o implements;
 * 
 * Quando o Cliente chamar a senha, quem guardar� esta informa��o n�o ser� diretamente a pr�pria classe, 
 * e sim a AutenticacaoUtil. No autenticador, chamaremos o util, desta forma, utilizamos o seu setSenha. 
 * Isso significa que delegamos a chamada - o m�todo n�o foi embora, 
 * mas a implementa��o, que era concreta, agora foi delegada;
 */

public class Cliente implements Autenticavel { 
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
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
