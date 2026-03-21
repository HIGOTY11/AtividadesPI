package ExercícioPI;

import java.util.*;

public class RPG {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int op = 1, hp = 100, nível = 1, xp = 0;
		
		do {
			System.out.println("(1) Explorar");
			System.out.println("(2) Descansar");
			System.out.println("(3) Exibir Status");
			System.out.println("(4) Sair");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
			break;
				
			case 2:
			break;
			
			case 3:
			System.out.println("STATUS DO PERSONAGEM:");
			System.out.println("HP - " + hp);
			System.out.println("NÍVEL - " + nível);
			System.out.println("XP - " + xp);
			break;
			
			}
			
		}while(op>4);
		
	}

}
