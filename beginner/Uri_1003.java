import java.util.Scanner;

public class Uri_1003 {
    public static void main(String args[]) {
        int a, b, SOMA;

        Scanner teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();
        SOMA = a + b;

        System.out.println("SOMA = " + SOMA);

        teclado.close();
    }
}