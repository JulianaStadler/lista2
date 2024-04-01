import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // 1. Construa um programa que leia em um vetor uma sequência de 5 números digitados
        // pelo usuário, calcule a média e apresente na tela quais valores são menores, iguais
        // ou superiores à média.
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        float media = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            vetor[i] = scanner.nextInt();
            media = media + vetor[i];
        }
        media = media / vetor.length;

        System.out.println("A media é: "+media+"\nNumeros maiores que a media:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println("\nNumeros menores que a media: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.print(vetor[i]+" ");
            }
        }
        System.out.println("\nNumeros iguais a media: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == media) {
                System.out.print(vetor[i]+" ");
            }
        }
        scanner.close();

    }
    
}
