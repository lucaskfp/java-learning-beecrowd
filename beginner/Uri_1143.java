import java.util.Scanner;

public class Uri_1143 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt(), i = 1;

        while (i <= n) {

            System.out.println(i + " " + i * i + " " + i * i * i);

            i += 1;
        }

        teclado.close();
    }
}
