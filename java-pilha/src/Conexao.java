
/*Essa é uma interface, e a ideia das interfaces é definir um contrato e, 
 * caso você "assine" um contrato, será obrigado a implementar o método; 
 * Nesse caso, o método que somos obrigados a implementar da interface, é o método close();
 * O AutoCloseable exige que tenhamos o método close(), mas podemos deixar o método menos perigoso, retirando o throws Exception. 
 * Assim, simplificaremos um pouco o código e não será necessário mais um tratamento de erro para quem faz a chamada.
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