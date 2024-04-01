import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // 5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
        // Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes
        // que o número n aparece no vetor.
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int n, quantidade = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            vetor[i] = scanner.nextInt();
        }
        
        System.out.println("Digite o numero N: ");
        n = scanner.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }

        System.out.println("=========================\nO numero "+n+" aparece "+quantidade+" vez(es) nos numeros digitados");

        scanner.close();
    }
    
}
