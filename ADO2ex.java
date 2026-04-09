import java.util.Scanner;

public class ADO2ex {

    public static void main(String[] args) {

        System.out.println("^^^^^^^^^^^^^^^^^^^^");
        System.out.println("  BEM VINDO AO RPG  ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^");

        System.out.println("\nCARREGANDO....");

        Scanner leia = new Scanner(System.in);

        int hp = 100;
        int xp = 0;
        int opcao;
        int subOpcao;

        do {

            System.out.println("\n======MENU======");
            System.out.println("(1) - Instruções");
            System.out.println("(2) - Jogar");
            System.out.println("(3) - Créditos");
            System.out.println("(4) - Sair");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n======INSTRUÇÕES======");
                    System.out.println("Explorando vai conseguir adquirir pontos = XP++");
                    System.out.println("Caso o personagem morrer e chegar a HP = 0, O JOGO SE ENCERRA!");
                    break;

                case 2:
                    do {

                        System.out.println("\n======JOGAR======");
                        System.out.println("HP: " + hp + " XP: " + xp);
                        System.out.println("(1) - Explorar");
                        System.out.println("(2) - Descansar");
                        System.out.println("(3) - Voltar ao menu principal");
                        subOpcao = leia.nextInt();

                        if (subOpcao == 1) {
                            hp -= 10;
                            xp += 20;
                            System.out.println("Você explorou!");
                            
                        } else if (subOpcao == 2) {
                            hp += 5;
                            System.out.println("Você descansou!");

                        } if (hp <= 0) {
                            System.out.println("Você morreu!");
                        }

                    } while (!(subOpcao == 3 || hp <= 0));
                    break;

                case 3:
                    System.out.println("\n======CRÉDITOS======");
                    System.out.println("Direção: Higor Gabriel");
                    System.out.println("Legendas: Higor Gabriel");
                    System.out.println("Artes: Higor Gabriel");
                    System.out.println("Jogo feito por: Higor Gabriel");
                    break;

                case 4:
                    System.out.println("Saindo do jogo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

        } while (!(opcao == 4 || hp <= 0));

        leia.close();
    }

}
