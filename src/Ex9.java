import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
        // de acordo com as seguintes regras:
        // a. Os elementos das posições pares de C são os elementos das posições pares de A;
        // b. Os elementos das posições ímpares de C são os elementos das posições ímpares de B;
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("VETOR A: Digite o "+(i + 1)+"º numero: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("VETOR B: Digite o "+(i + 1)+"º numero: ");
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = (i%2 != 0) ? a[i] : b[i] ;
        }
        System.out.println("==================================");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }

        scanner.close();
    }
    
}
