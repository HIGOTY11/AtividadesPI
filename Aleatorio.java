import java.util.Random;

public class Aleatorio {
    
	public static void main(String[] args) {
		
		Random geradorNumeroAleatorio = new Random();
		//int numero = geradorNumeroAleatorio.nextInt(11);

        int contador = 1;

        do {
            int numero = geradorNumeroAleatorio.nextInt(11);
            System.out.println("Numero aleatório: " + numero);
            contador++;


        } while (contador<=10); //condição de saída

	}

}
