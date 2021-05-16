
public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		
		/*A variável ex é uma referência e, com isso, podemos dizer que exceções também são objetos.
		 * Então, podemos usar a referência para chamar algum método público da classe. 
		 * Pegaremos o método getMessage(), com o qual conseguiremos pegar a informação apresentada no console, por exemplo, a mensagem / by zero. 
		 * Depois de pegá-la, iremos guardá-la em uma String e mostrá-la após "ArithmeticException".
		 * Qualquer exceção tem o método getMessage(); 
		 */

		try {
			metodo1();
		}
		catch (ArithmeticException | NullPointerException ex){ //o pipe | significa que vai capturar um ou outro;
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace(); //Pra mostrar o rastro por onde passou a exceção, usa-se o printStackTrace();
		}//A referência ex declarada no bloco catch, é um objeto onde podemos chamar métodos como o getMessage() para receber a mensagem, e o printStackTrace() para mostrar o rastro da pilha.
		
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
			
			
			
			/*Para tratarmos uma exceção, é preciso sinalizar para a máquina virtual que isso pode acontecer, 
			 * por meio de um código específico (try). 
			 * Assim, ela entenderá que deve tentar executar esse código, entre chaves ({}) e com mais cautela.
			 * Ainda dessa forma, o código nem compila, porque precisamos avisar para a máquina virtual qual exceção pode acontecer. 
			 * Para isso, utilizaremos um novo bloco de código, por meio de catch, sinalizando que queremos capturar um problema. 
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