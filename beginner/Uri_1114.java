import java.util.Scanner;

public class Uri_1114 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int senha;

        while (1 < 10) {
            senha = teclado.nextInt();
            if (senha == 2002) {
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");

        teclado.close();
    }
}
