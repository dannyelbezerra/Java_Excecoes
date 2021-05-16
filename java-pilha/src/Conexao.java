
/*Essa � uma interface, e a ideia das interfaces � definir um contrato e, 
 * caso voc� "assine" um contrato, ser� obrigado a implementar o m�todo; 
 * Nesse caso, o m�todo que somos obrigados a implementar da interface, � o m�todo close();
 * O AutoCloseable exige que tenhamos o m�todo close(), mas podemos deixar o m�todo menos perigoso, retirando o throws Exception. 
 * Assim, simplificaremos um pouco o c�digo e n�o ser� necess�rio mais um tratamento de erro para quem faz a chamada.
 */


public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();	
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

	@Override
	public void close() {
		System.out.println("Fechando conexao");		
	}
}