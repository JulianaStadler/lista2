import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // 12. Elabore um programa que leia um vetor de 12 elementos apresente na tela o
        // produto dos elementos pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -
        // 6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[12];
        int[] resposta = new int[vetor.length];
        int produto, j = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            vetor[i] = scanner.nextInt();

            if ((vetor[i] != 0) && (vetor[i] % 2 == 0) && (vetor[i] > 0)) {
                resposta[j] = vetor[i];
                j++;
            }
        }

        produto = resposta[0];
        for (int i = 1; i < resposta.length; i++) {
            if (resposta[i] != 0) {
                produto = produto * resposta[i];
            }
        }

        System.out.println("Produto: " + produto);

        scanner.close();
    }

}
        