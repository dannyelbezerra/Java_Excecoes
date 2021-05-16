
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		
		/*A vari�vel ex � uma refer�ncia e, com isso, podemos dizer que exce��es tamb�m s�o objetos.
		 * Ent�o, podemos usar a refer�ncia para chamar algum m�todo p�blico da classe. 
		 * Pegaremos o m�todo getMessage(), com o qual conseguiremos pegar a informa��o apresentada no console, por exemplo, a mensagem / by zero. 
		 * Depois de peg�-la, iremos guard�-la em uma String e mostr�-la ap�s "ArithmeticException".
		 * Qualquer exce��o tem o m�todo getMessage(); 
		 */

		try {
			metodo1();
		}
		catch (ArithmeticException | NullPointerException ex){ //o pipe | significa que vai capturar um ou outro;
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //Pra mostrar o rastro por onde passou a exce��o, usa-se o printStackTrace();
		}//A refer�ncia ex declarada no bloco catch, � um objeto onde podemos chamar m�todos como o getMessage() para receber a mensagem, e o printStackTrace() para mostrar o rastro da pilha.
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			//int a = i / 0;
			
			Conta c = null;
			try {
				c.deposita();
			} catch (MinhaExcecao e) {
				
				e.printStackTrace();
			}
			
			
			
			/*Para tratarmos uma exce��o, � preciso sinalizar para a m�quina virtual que isso pode acontecer, 
			 * por meio de um c�digo espec�fico (try). 
			 * Assim, ela entender� que deve tentar executar esse c�digo, entre chaves ({}) e com mais cautela.
			 * Ainda dessa forma, o c�digo nem compila, porque precisamos avisar para a m�quina virtual qual exce��o pode acontecer. 
			 * Para isso, utilizaremos um novo bloco de c�digo, por meio de catch, sinalizando que queremos capturar um problema. 
			 * No caso, ArithmeticException.
			 */
			
//			try {
//				int a = i / 0;
//			}
//			catch (ArithmeticException ex){
//				System.out.println("ArithmeticException");
//			}
			
			
			
		}
		System.out.println("Fim do metodo2");
	}
}