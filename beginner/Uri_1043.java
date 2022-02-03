import java.util.Scanner;

public class Uri_1043 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        float a, b, c, perimetro, area;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if (b - c < a && a < b + c) {
            if (a - c < b && b < a + c) {
                if (a - b < c && c < a + b) {
                    perimetro = a + b + c;
                    System.out.println("Perimetro = " + perimetro);
                }
            }
        } else {
            area = ((a + b) / 2) * c;
            System.out.println("Area = " + area);
        }

        teclado.close();
    }
}
