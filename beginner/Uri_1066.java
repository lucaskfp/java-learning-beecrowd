import java.util.Scanner;

public class Uri_1066 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int valor,
                qtdPositivos = 0,
                qtdNegativos = 0,
                qtdPares = 0,
                qtdImpares = 0;

        for (int i = 0; i < 5; i++) {
            valor = teclado.nextInt();

            if (valor % 2 == 0) {
                qtdPares += 1;
            } else {
                qtdImpares += 1;
            }

            if (valor > 0) {
                qtdPositivos += 1;
            } else if (valor != 0) {
                qtdNegativos += 1;
            }
        }

        System.out.println(qtdPares + " valor(es) par(es)");
        System.out.println(qtdImpares + " valor(es) impar(es)");
        System.out.println(qtdPositivos + " valor(es) positivo(s)");
        System.out.println(qtdNegativos + " valor(es) negativo(s)");
    }
}
