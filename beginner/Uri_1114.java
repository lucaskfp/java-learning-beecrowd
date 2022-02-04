import java.util.Scanner;

public class Uri_1114 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int senha = teclado.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");

            senha = teclado.nextInt();
        }

        System.out.println("Acesso Permitido");

        teclado.close();
    }
}
