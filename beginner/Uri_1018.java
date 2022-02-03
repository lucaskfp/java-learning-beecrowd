import java.util.Scanner;

public class Uri_1018 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valor, resto;
        valor = teclado.nextInt();

        System.out.println(valor);

        System.out.printf("%d nota(s) de R$ 100,00\n", valor / 100);

        resto = valor % 100;

        System.out.printf("%d nota(s) de R$ 50,00\n", resto / 50);

        resto = resto % 50;

        System.out.printf("%d nota(s) de R$ 20,00\n", resto / 20);

        resto = resto % 20;

        System.out.printf("%d nota(s) de R$ 10,00\n", resto / 10);

        resto = resto % 10;

        System.out.printf("%d nota(s) de R$ 5,00\n", resto / 5);

        resto = resto % 5;

        System.out.printf("%d nota(s) de R$ 2,00\n", resto / 2);

        resto = resto % 2;

        System.out.printf("%d nota(s) de R$ 1,00\n", resto / 1);

        teclado.close();
    }
}