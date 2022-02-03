import java.util.Scanner;

public class Uri_1019 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int tempo, horas, minutos, segundos;

        tempo = teclado.nextInt();

        horas = tempo / 3600;
        minutos = (tempo / 60) % 60;
        segundos = tempo % 60;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

        teclado.close();
    }
}