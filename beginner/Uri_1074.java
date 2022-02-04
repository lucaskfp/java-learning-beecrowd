import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Uri_1074 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt(), i = 0, valor;

        while (i < n) {
            valor = teclado.nextInt();

            if (valor == 0) {
                System.out.println("NULL");
            } else if (valor % 2 == 0) {
                if (valor > 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("EVEN NEGATIVE");
                }
            } else {
                if (valor > 0) {
                    System.out.println("ODD POSITIVE");
                } else {
                    System.out.println("ODD NEGATIVE");
                }
            }

            i += 1;
        }

        teclado.close();
    }
}
