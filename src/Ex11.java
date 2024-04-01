import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // 11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros
        // de tamanho igual a 5. 
        // Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int pscalar = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("VETOR A: Digite o "+(i + 1)+"º numero: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("VETOR B: Digite o "+(i + 1)+"º numero: ");
            b[i] = scanner.nextInt();
            
            pscalar = pscalar + (a[i] * b[i]);
        }
        System.out.print("==================================\nPoder escalar = "+pscalar);

        scanner.close();
    }
    
}
