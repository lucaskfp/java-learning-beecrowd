import java.util.Scanner;

public class Uri_1012 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        double triangulo, circulo, trapezio, quadrado, retangulo;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        // area = b * h / 2 = a * c / 2
        triangulo = (a * c) / 2;

        // area = pi * rˆ2 = 3.14159 * (c * c)
        circulo = 3.14159 * (c * c);

        // area = (B+b) * h / 2 = ((a+b) * c) / 2
        trapezio = ((a + b) * c) / 2;

        // area = lado * lado = b * b
        quadrado = b * b;

        // area = b * h = a * b3
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

        teclado.close();
    }
}