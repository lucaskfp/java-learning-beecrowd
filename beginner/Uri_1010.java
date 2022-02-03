import java.util.Scanner;

public class Uri_1010 {
    public static void main(String args[]) {
        int codigo1, quantidade1, codigo2, quantidade2;
        double valor1, valor2, total;

        Scanner teclado = new Scanner(System.in);

        codigo1 = teclado.nextInt();
        quantidade1 = teclado.nextInt();
        valor1 = teclado.nextDouble();

        codigo2 = teclado.nextInt();
        quantidade2 = teclado.nextInt();
        valor2 = teclado.nextDouble();

        total = valor1 * quantidade1 + valor2 * quantidade2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        teclado.close();
    }
}