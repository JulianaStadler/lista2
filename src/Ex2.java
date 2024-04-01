import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // 2. Escreva um algoritmo que leia em um vetor uma sequência finita de números
        // digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se
        // ele é positivo, negativo ou zero.
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("========================");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1)+"º numero "+vetor[i]+" ele é "+negativo(vetor[i]));
        }

        scanner.close();
    }

    private static String negativo(int i) {
        String resp = (i >= 0) ? "positivo" : "negativo";
        return resp;
    }
    
}
