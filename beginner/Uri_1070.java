import java.util.Scanner;

public class Uri_1070 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, i;

        x = teclado.nextInt();
        i = x;

        while (i < x + 12) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

            i += 1;
        }

        teclado.close();
    }
}
