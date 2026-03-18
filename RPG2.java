import java.util.Scanner;

public class RPG2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo do personagem (mago ou guerreiro): ");
        String tipo = leitor.nextLine();

        System.out.println("Digite o nível do personagem: ");
        int nivel = leitor.nextInt();

        System.out.println("Digite a quantidade de magia: ");
        int magia = leitor.nextInt();

        System.out.println("Digite a quantidade de força: ");
        int forca = leitor.nextInt();

        if (tipo.equalsIgnoreCase("mago") && nivel >= 10 && magia >= 8) {
            System.out.println("Você pode entrar como Mago da Guilda");

        } else if (tipo.equalsIgnoreCase("guerreiro") && nivel >= 10 && forca >= 8) {
            System.out.println("Você pode entrar como Guerreiro da Guilda");

        } else if ((magia >= 8 || forca >= 8) && nivel < 10) {
            System.out.println("Você tem talento, mas precisa evoluir seu nível");

        } else {
            System.out.println("Treine mais antes de entrar na guilda");
        }

        leitor.close();
    }
}