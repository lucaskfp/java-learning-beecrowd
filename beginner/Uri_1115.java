import java.util.Scanner;

public class Uri_1115 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int x, y;

        while (1 < 10) {
            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

        }

        teclado.close();
    }
}
