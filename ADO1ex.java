import java.util.Scanner;

public class ADO1ex {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        float valorCompra;
        float valorDesconto;
        float valorFinal;

        System.out.println("------------------------------");
        System.out.println("      DESCONTOS DE ATÉ 20%    ");
        System.out.println("------------------------------");

        System.out.print("Informe o valor da sua compra: ");
        valorCompra = leia.nextFloat();

        if (valorCompra >= 300) {

            valorDesconto = valorCompra * 0.20f;
            valorFinal = valorCompra - valorDesconto;

            System.out.println("\nDesconto de 20% concedido!");

        } else {

            valorDesconto = valorCompra * 0.15f;
            valorFinal = valorCompra - valorDesconto;

            System.out.println("\nDesconto de 15% concedido!");

        }

        System.out.println("\nValor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final a pagar: R$ " + valorFinal);

        leia.close();
    }
}
