import java.util.Scanner;

public class Uri_1009 {
    public static void main(String args[]) {
        String vendedor;
        double salario, salarioFinal, totalVendas;

        Scanner teclado = new Scanner(System.in);

        vendedor = teclado.next();
        salario = teclado.nextDouble();
        totalVendas = teclado.nextDouble();

        salarioFinal = salario + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        teclado.close();
    }
}