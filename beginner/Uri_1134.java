import java.util.Scanner;

public class Uri_1134 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0, codigo;

        while (1 < 10) {
            codigo = teclado.nextInt();

            if (codigo == 4) {
                break;
            }

            if (codigo == 1) {
                alcool += 1;
            } else if (codigo == 2) {
                gasolina += 1;
            } else if (codigo == 3) {
                diesel += 1;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        teclado.close();
    }
}
