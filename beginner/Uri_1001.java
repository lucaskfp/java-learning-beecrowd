package beginner;
import java.util.Scanner;

public class Uri_1001 {
    public static void main(String args[]) {
        int a, b, x;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();

        x = a + b;

        System.out.println("X = " + x);

        teclado.close();
    }
}