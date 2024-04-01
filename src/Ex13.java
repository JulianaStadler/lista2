import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // 13. Elabore um algoritmo que receba um número n e retorne um vetor com os n
        // primeiros termos da sequência de Fibonacci. Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8,
        // 13, 21}
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quandotos N: ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        vetor[0] = 1;
        vetor[1] = 1;
        System.out.print(vetor[0] + " " + vetor[1]);
        for (int i = 2; i < n; i++) {
            vetor[i] = vetor[i - 1] + vetor[i - 2];

            System.out.print(" " + vetor[i]);
        }

        scanner.close();
    }

}