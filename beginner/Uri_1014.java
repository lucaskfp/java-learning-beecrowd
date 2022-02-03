import java.util.Scanner;

public class Uri_1014 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int distancia;
        double consumo, consumoMedio;

        distancia = teclado.nextInt();
        consumo = teclado.nextDouble();

        consumoMedio = distancia / consumo;

        System.out.printf("%.3f km/l\n", consumoMedio);

        teclado.close();
    }
}