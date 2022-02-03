import java.util.Scanner;

public class Uri_1008 {
    public static void main(String args[]) {
        double funcionario, horas, valor, salario;

        Scanner teclado = new Scanner(System.in);

        funcionario = teclado.nextDouble();
        horas = teclado.nextDouble();
        valor = teclado.nextDouble();

        salario = valor * horas;

        System.out.printf("NUMBER = %.0f\nSALARY = U$ %.2f\n", funcionario, salario);

        teclado.close();
    }
}