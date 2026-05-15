import java.util.Scanner;
import java.util.Random;
public class campoMinado {

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Informe o número de linhas da matriz: ");
        int n = entrada.nextInt();
        System.out.println("Informe o número de colunas da matriz: ");
        int m = entrada.nextInt();

        
        if (n < 2 || m < 2) {
            System.out.println("Dimensão mínima deve ser 2x2.");
            return;
        }

        int matriz[][] = new int[n][m];

        System.out.println("Informe a quantidade de bombas: ");
        int qtdBombas = entrada.nextInt();

        
        inicializarBombas(matriz, qtdBombas);

        int pontos = 0;
        int maxPontos = (n * m) - qtdBombas;
        boolean perdeu = false;

        
        while (pontos < maxPontos && !perdeu) {
            impressao(matriz);
            
            System.out.println("\nEscolha uma linha: ");
            int linha = entrada.nextInt();
            System.out.println("Escolha uma coluna: ");
            int coluna = entrada.nextInt();

            
            if (matriz[linha][coluna] == 1) {
                System.out.println("Você já escolheu essa posição!");
                continue;
            }

            
            if (matriz[linha][coluna] == -1) {
                perdeu = true;
            } else {
                matriz[linha][coluna] = 1; // Posição livre vira 'x'
                pontos++;
                
                if (temBombaAoRedor(matriz, linha, coluna)) {
                    System.out.println("Cuidado: bomba próxima!");
                }
            }
        }

        
        if (perdeu) {
            System.out.println("Game Over!");
        } else {
            System.out.println("Parabéns, você ganhou o jogo!");
        }

        System.out.println("Pontuação final: " + pontos);
        impressaoFinal(matriz);
    }

    private static void inicializarBombas(int[][] matriz, int qtd) {
        Random random = new Random();
        int espalhadas = 0;
        while (espalhadas < qtd) {
            int rL = random.nextInt(matriz.length);
            int rC = random.nextInt(matriz[0].length);
            if (matriz[rL][rC] != -1) {
                matriz[rL][rC] = -1;
                espalhadas++;
            }
        }
    }

    private static void impressao(int[][] matriz) {
        System.out.println("\nMatriz Atual:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("x\t");
                } else {
                    System.out.print("_\t");
                }
            }
            System.out.println();
        }
    }

    private static boolean temBombaAoRedor(int[][] matriz, int l, int c) {
        for (int i = l - 1; i <= l + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
                    if (matriz[i][j] == -1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static void impressaoFinal(int[][] matriz) {
        System.out.println("\nRevelando Matriz:");
        for (int[] linha : matriz) {
            for (int item : linha) {
                if (item == -1) System.out.print("b\t");
                else if (item == 1) System.out.print("x\t");
                else System.out.print("_\t");
            }
            System.out.println();
        }
    }
}

