import java.util.Scanner;

public class Uri_1064 {
    public static void main(String args[]) {
        float valor, count = 0;
        int qtdPositivos = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            valor = teclado.nextFloat();

            if (valor > 0) {
                qtdPositivos += 1;
                count = count + valor;
            }
        }

        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n", count / qtdPositivos);

        teclado.close();
    }
}
