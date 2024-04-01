import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        // 15. Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
        // acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
        // um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
        // valor lido só poderá ser maior que 5.
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite o 1º numero: ");
        vetor[0] = scanner.nextInt();

        for (int i = 1; i < vetor.length; i++) {
            do {
                System.out.println("Digite o " + (i + 1) + "º numero: ");
                vetor[i] = scanner.nextInt();

                if (vetor[i] < vetor[i - 1]) {
                    System.out.println("Número invalido, digite novamente.");
                }
            } while (vetor[i] < vetor[i - 1]);
        }

        System.out.print("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }

        scanner.close();
    }

}