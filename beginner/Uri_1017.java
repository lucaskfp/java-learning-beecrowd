import java.util.Scanner;

public class Uri_1017 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double tempo, velocidade, distancia, totalLitros;

        tempo = teclado.nextDouble();
        velocidade = teclado.nextDouble();

        distancia = tempo * velocidade;
        totalLitros = distancia / 12;

        System.out.printf("%.3f\n", totalLitros);

        teclado.close();
    }
}