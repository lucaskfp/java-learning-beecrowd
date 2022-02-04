import java.util.Scanner;

public class Uri_1065 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valor, count = 0;

        for (int i = 0; i < 5; i++) {
            valor = teclado.nextInt();

            if (valor % 2 == 0) {
                count += 1;
            }
        }

        System.out.println(count + " valores pares");

        teclado.close();
    }
}
