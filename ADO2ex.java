
import java.util.Scanner;


public class ADO2ex {
	
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = leia.nextInt();

        if (ano > 0) {
            if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                System.out.println("Ano bissexto");
            } else {
                System.out.println("Não é bissexto");
            }
        } else {
            System.out.println("Ano inválido");
        }

        leia.close();
    }
}
