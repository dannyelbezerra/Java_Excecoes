
/*A interface tem todos os métodos abstratos e não pode ter implementação, por esse motivo;
 * Contrato Autenticavel;
 * Quem assina esse contrato, precisa implementar;
 * Métodos setSenha e autentica;
 */

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
