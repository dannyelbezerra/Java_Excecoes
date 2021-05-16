
public class TesteConexao {
	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("deu erro na conexao");
		}
		
	}
}		
		
//		Conexao con = null;
//		
//		try {
//			con = new Conexao();
//			con.leDados();
//			
//		}catch(IllegalStateException ex) {
//			System.out.println("deu erro na conexao");
//			
//		}finally { //Dando erro ou não, o finnaly sempre será executado;
//			con.close();
//		}


