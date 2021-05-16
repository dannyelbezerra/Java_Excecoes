
/*A interface tem todos os m�todos abstratos e n�o pode ter implementa��o, por esse motivo;
 * Contrato Autenticavel;
 * Quem assina esse contrato, precisa implementar;
 * M�todos setSenha e autentica;
 */

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
