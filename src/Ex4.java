import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // 4. Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma
        // variável de um número n qualquer, depois mostre na tela o índice dos elementos que
        // são inferiores a n.
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int n;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Digite o numero N: ");
        n = scanner.nextInt();

        System.out.println("=========================\nINDICE dos numeros menores que "+n+": ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < n) {
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
    
}
