import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles
        // são iguais ou não. Para serem iguais, todos os elementos dos dois vetores devem
        // coincidir.
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[vetor1.length];
        String resp = "iguais";

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Vetor 1: Digite o "+(i + 1)+"º numero: ");
            vetor1[i] = scanner.nextInt();
        }
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Vetor 2: Digite o "+(i + 1)+"º numero: ");
            vetor2[i] = scanner.nextInt();

            if (vetor1[i] != vetor2[i]) {
                resp = "diferentes";
            }
        }

        System.out.println("Os vetores são "+resp);

        scanner.close();

    }
    
}
