import java.util.Scanner;

public class Uri_1142 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt(), i = 0, j = 1, count = 4;
        String str = "";

        while (i < n) {

            while (j < count) {
                str = str + j + " ";
                j += 1;
            }

            if (j == count) {
                str = str + "PUM";
                System.out.println(str);
                str = "";
                j = count + 1;
                count += 4;
            }

            i += 1;
        }

        teclado.close();
    }
}
