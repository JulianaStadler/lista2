import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        // 14. Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
        // o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
        // apagado ou duplicado. Apresente o vetor atualizado na tela.

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            vetor[i] = scanner.nextInt();
        }

        int copo;
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                copo = vetor[i + 1];
                vetor[i + 1] = vetor[i];
                vetor[i] = copo;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }

}