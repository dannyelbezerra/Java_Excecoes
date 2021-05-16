
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		/*
		 * A variável ex é uma referência e, com isso, podemos dizer que exceções também
		 * são objetos. Então, podemos usar a referência para chamar algum método
		 * público da classe. Pegaremos o método getMessage(), com o qual conseguiremos
		 * pegar a informação apresentada no console, por exemplo, a mensagem / by zero.
		 * Depois de pegá-la, iremos guardá-la em uma String e mostrá-la após
		 * "ArithmeticException". Qualquer exceção tem o método getMessage();
		 * catch (Exception ex); - pode colocar no lugar das exceções;
		 */

		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) { // ao invés de colocar o nome das exceções, pode colocar a classe mãe EXCEPTION, que vai capturar qualquer exceção;
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace(); // Pra mostrar o rastro por onde passou a exceção, usa-se o printStackTrace();
		} // A referência ex declarada no bloco catch, é um objeto onde podemos chamar
			// métodos como o getMessage() para receber a mensagem, e o printStackTrace()
			// para mostrar o rastro da pilha.

		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}


		/* A exceção exige que fique explícito na assinatura do método que estamos jogando a exceção;
		 * Dessa forma, dizemos que o método joga uma exceção do tipo MinhaExcecao; 
		 * Agora, o método volta a compilar. Quando usamos throw new de uma exceção que estende diretamente da classe Exception, 
		 * o compilador exige que coloquemos, explicitamente, throws na assinatura do método; 
		 * A ideia é que o "perigo" — a exceção — fique explícita na assinatura do método; 
		 * Com isso, temos duas categorias novas de Exception; 
		 * A primeira é a que estende de RuntimeException e se chama Unchecked (NÃO SÃO VERIFICADAS PELO COMPILADOR); 
		 * A segunda categoria é a que estende diretamente de Exception, chamada de Checked (SÃO VERIFICADAS PELO COMPILADOR);
		 */
	
	private static void metodo2() throws MinhaExcecao{ 
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("deu errado");
	}
}
		
		//throw new ArithmeticException(); Normalmente, quando queremos jogar uma exceção, fazemos isso de maneira mais enxuta, sem guardar a referência.
		
		//		ArithmeticException exception = new ArithmeticException("deu errado");
		//		throw exception; //Só consegue jogar um objeto na pilha, se for uma exceção;
		
		//System.out.println("Fim do metodo2");


/*
 * Para tratarmos uma exceção, é preciso sinalizar para a máquina virtual que
 * isso pode acontecer, por meio de um código específico (try). Assim, ela
 * entenderá que deve tentar executar esse código, entre chaves ({}) e com mais
 * cautela. Ainda dessa forma, o código nem compila, porque precisamos avisar
 * para a máquina virtual qual exceção pode acontecer. Para isso, utilizaremos
 * um novo bloco de código, por meio de catch, sinalizando que queremos capturar
 * um problema. No caso, ArithmeticException.
 */

//try {
//	int a = i / 0;
//}
//catch (ArithmeticException ex){
//	System.out.println("ArithmeticException");
//}
