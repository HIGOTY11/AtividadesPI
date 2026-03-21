package ExercícioPI;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		
		String usuario = "Enzo";
		String senha = "1234";
		
		Scanner leitor = new Scanner(System.in);
		
		boolean flagDadosCorretos = false;
	
		do{
			//Executar a solicitação de login e senha
			System.out.println("\nDigite o login");
			String login = leitor.next();
			
			System.out.println("\nDigite a senha");
			String pwd = leitor.next();
			
			if(login.equalsIgnoreCase(usuario) && senha.equals(pwd)) {
				flagDadosCorretos = true;
			}
			
		}while( ! flagDadosCorretos);
		 
		System.out.println("Bem-vindo Enzo!");
	}

}
