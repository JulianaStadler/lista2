import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        // 10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie
        // os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o
        // último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim
        // por diante.
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int j = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            System.out.println("VETOR A: Digite o "+(i + 1)+"º numero: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = a[j];
            j--;
        }

        System.out.println("==================================");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

        scanner.close();
    }
    
}
