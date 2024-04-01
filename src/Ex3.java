import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // 3. Faça um programa que leia em um vetor uma sequência finita de números digitados
        // pelo usuário. Crie um segundo vetor que armazene o dobro de cada número do
        // primeiro vetor e depois apresente os valores deste vetor.
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o "+(i + 1)+"º numero: ");
            vetor1[i] = scanner.nextInt();
            vetor2[i] = vetor1[i]*2;
        }
        System.out.println("========================");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println((i + 1)+"º numero "+vetor2[i]);
        }


        scanner.close();
    }
    
}
