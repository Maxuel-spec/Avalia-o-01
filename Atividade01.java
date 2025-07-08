import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = input.nextDouble();
        }

        double media1Semestre = (notas[0] + notas[1]) / 2;
        double media2Semestre = (notas[2] + notas[3]) / 2;
        double media3Semestre = (notas[4] + notas[5]) / 2;
        double media4Semestre = (notas[6] + notas[7]) / 2;
        double mediaFinal = (media1Semestre + media2Semestre + media3Semestre + media4Semestre) / 4;

        System.out.printf("\nMédia Final: %.1f\n", mediaFinal);

        input.close();
    }
}
