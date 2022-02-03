import java.util.Scanner;

public class Uri_1006 {
    public static void main(String args[]) {

        double a, b, c, media;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        teclado.close();
    }
}