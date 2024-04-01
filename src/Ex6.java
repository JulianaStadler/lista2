import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor
        // com 5 pesos e calcule a média ponderada do aluno.
        Scanner scanner = new Scanner(System.in);
        float[] nota = new float[3];
        float[] peso = new float[nota.length];
        float mediaC = 0;
        float mediaB = 0;

        for(int i = 0; i < nota.length; i++){
            System.out.println("Digite a "+(i + 1)+"ª nota: ");
            nota[i] = scanner.nextFloat();

            System.out.println("Digite o peso da "+(i + 1)+"ª nota: ");
            peso[i] = scanner.nextFloat();

            mediaC = mediaC + (nota[i] * peso[i]);
            mediaB = mediaB + peso[i];
        }
        
        System.out.println("A media é "+(mediaC / mediaB));

        scanner.close();
        
    }
}