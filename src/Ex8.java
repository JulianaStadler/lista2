import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a
        // concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos
        // de B.
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        int metade = (c.length / 2);

        for (int i = 0; i < a.length; i++) {
            System.out.println("VETOR A: Digite o "+(i + 1)+"º numero: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("VETOR B: Digite o "+(i + 1)+"º numero: ");
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            c[i+metade] = b[i];
        }
        System.out.println("==================================");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }

        scanner.close();

    }
    
}
