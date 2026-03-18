
import java.util.Scanner;

public class RPG1 {

    public static void main(String[] args){
        Scanner leitor =  new Scanner(System.in);

        //Variáveis para armazenar características do personagem
        int forca = 0;
        int magia = 0;

        System.out.println("Escolha uma das opções a seguir:");
        System.out.println("1 - Mago\n2 - Guerreiro");
        int escolha = leitor.nextInt();

        if(escolha == 1){
            System.out.println("Você escolheu: 'Mago' ");
            System.out.println("Atributos: ");
            forca = 3;
            magia = 10;
            System.out.println("Magia: " + magia);
            System.out.println("Força: " + forca);
        }else if( escolha == 2){
            System.out.println("Você escolheu: 'Guerreiro' ");
            System.out.println("Atributos: ");
            forca = 10;
            magia = 2;
            System.out.println("Magia: " + magia);
            System.out.println("Força: " + forca);
        }else{
            System.out.println("Opção inválida!");
        }

        leitor.close();
        
    } //Fim do main

} // Fim da classe
