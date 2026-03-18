
//Proposta do exercício
//Uma loja oferece para seus clientes um desconto de acordo com o valor da compra. 
//Este desconto é de 20% se o valor da compra for maior ou igual a R$ 300,00 e 15% se for menor. 
//De acordo com o valor do produto, mostre o valor(descontado) da compra do cliente e o valor do desconto obtido;

import java.util.Scanner;

public class ADOex1 {

     public static void main(String[] args) {
          
          Scanner leia = new Scanner(System.in);
          float valorCompra = 0;

          System.out.print("------------------------------");
          System.out.print("\n   DESCONTOS DE ATÉ 20%     ");
          System.out.print("\n------------------------------");
          System.out.print("\nInforme o valor final da sua compra: ");
          valorCompra = leia.nextFloat();

          if (valorCompra >= 300) {

              valorCompra = (float) (valorCompra - (valorCompra*0.2));
              System.out.println("Desconto de 20% concedido \nO valor final da sua compra é de R$"+valorCompra);
          } else {
              valorCompra = (float) (valorCompra - (valorCompra*0.15));
              System.out.println("Desconto de 15% concedido \nO valor final da sua compra é de R$"+valorCompra);
          }          
          
  }
     

}
