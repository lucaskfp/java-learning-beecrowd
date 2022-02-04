import java.util.Scanner;

public class Uri_1067 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt(),
                i = 1;

        while (i < x) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

            i += 1;
        }

        if (x % 2 != 0) {
            System.out.println(x);
        }

        teclado.close();
    }
}
