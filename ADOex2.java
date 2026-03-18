
//Proposta do Exercício:
//Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. 
//(Lembre-se que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e não por 100.)


import java.util.Scanner;

public class ADOex2 {
  public static void main(String[] args){

      int ano = 0;
      Scanner leia = new Scanner(System.in);

      System.out.print("----------------------------------------------");
      System.out.print("\nVAMOS DESCOBRIR SE VOCÊ NASCEU EM ANO BISSEXTO");
      System.out.print("\n----------------------------------------------");
      System.out.print("\nInforme o ano que você nasceu: ");
      ano = leia.nextInt();
      
      if (ano % 400 == 0 || (ano % 4==0 && ano % 100 != 0)) {
          System.out.print("\nO ano "+ano+" é bissexto");
      } else {
          System.out.print("\nO ano "+ano+" não é bissexto");
      }
  }
}
