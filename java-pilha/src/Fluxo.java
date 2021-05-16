
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		/*
		 * A vari�vel ex � uma refer�ncia e, com isso, podemos dizer que exce��es tamb�m
		 * s�o objetos. Ent�o, podemos usar a refer�ncia para chamar algum m�todo
		 * p�blico da classe. Pegaremos o m�todo getMessage(), com o qual conseguiremos
		 * pegar a informa��o apresentada no console, por exemplo, a mensagem / by zero.
		 * Depois de peg�-la, iremos guard�-la em uma String e mostr�-la ap�s
		 * "ArithmeticException". Qualquer exce��o tem o m�todo getMessage();
		 * catch (Exception ex); - pode colocar no lugar das exce��es;
		 */

		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) { // ao inv�s de colocar o nome das exce��es, pode colocar a classe m�e EXCEPTION, que vai capturar qualquer exce��o;
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace(); // Pra mostrar o rastro por onde passou a exce��o, usa-se o printStackTrace();
		} // A refer�ncia ex declarada no bloco catch, � um objeto onde podemos chamar
			// m�todos como o getMessage() para receber a mensagem, e o printStackTrace()
			// para mostrar o rastro da pilha.

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}


		/* A exce��o exige que fique expl�cito na assinatura do m�todo que estamos jogando a exce��o;
		 * Dessa forma, dizemos que o m�todo joga uma exce��o do tipo MinhaExcecao; 
		 * Agora, o m�todo volta a compilar. Quando usamos throw new de uma exce��o que estende diretamente da classe Exception, 
		 * o compilador exige que coloquemos, explicitamente, throws na assinatura do m�todo; 
		 * A ideia � que o "perigo" � a exce��o � fique expl�cita na assinatura do m�todo; 
		 * Com isso, temos duas categorias novas de Exception; 
		 * A primeira � a que estende de RuntimeException e se chama Unchecked (N�O S�O VERIFICADAS PELO COMPILADOR); 
		 * A segunda categoria � a que estende diretamente de Exception, chamada de Checked (S�O VERIFICADAS PELO COMPILADOR);
		 */
	
	private static void metodo2() throws MinhaExcecao{ 
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("deu errado");
	}
}
		
		//throw new ArithmeticException(); Normalmente, quando queremos jogar uma exce��o, fazemos isso de maneira mais enxuta, sem guardar a refer�ncia.
		
		//		ArithmeticException exception = new ArithmeticException("deu errado");
		//		throw exception; //S� consegue jogar um objeto na pilha, se for uma exce��o;
		
		//System.out.println("Fim do metodo2");


/*
 * Para tratarmos uma exce��o, � preciso sinalizar para a m�quina virtual que
 * isso pode acontecer, por meio de um c�digo espec�fico (try). Assim, ela
 * entender� que deve tentar executar esse c�digo, entre chaves ({}) e com mais
 * cautela. Ainda dessa forma, o c�digo nem compila, porque precisamos avisar
 * para a m�quina virtual qual exce��o pode acontecer. Para isso, utilizaremos
 * um novo bloco de c�digo, por meio de catch, sinalizando que queremos capturar
 * um problema. No caso, ArithmeticException.
 */

//try {
//	int a = i / 0;
//}
//catch (ArithmeticException ex){
//	System.out.println("ArithmeticException");
//}
