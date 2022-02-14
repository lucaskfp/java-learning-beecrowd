import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Bomba bombas[];
		bombas = new Bomba[3];

		Combustivel gasolina = new Combustivel("Gasolina", 6.90);
		Combustivel alcool = new Combustivel("Alcool", 4.85);
		Combustivel diesel = new Combustivel("Diesel", 4.25);

		bombas[0] = new Bomba(gasolina);
		bombas[1] = new Bomba(alcool);
		bombas[2] = new Bomba(diesel);

		System.out.println("===================");
		System.out.println("       POSTO       ");
		System.out.println("===================");
		System.out.println();
		System.out.println("Opções:");

		int count = 1;
		for (Bomba bomba : bombas) {

			System.out.println(count + ": " + bomba.display(bomba));

			count++;
		}

		int opcaoCombustivel = teclado.nextInt();

		System.out.println("** Opção escolhida: " + opcaoCombustivel + " - "
				+ bombas[opcaoCombustivel - 1].getCombustivel().getNome());
		System.out.println();

		System.out.println("Tipo de abastecimento:");
		System.out.print("1: Quantidade \n2: Valor\n");

		int tipoAbastecimento = teclado.nextInt();

		System.out.println("Você escolheu a opção: " + tipoAbastecimento);

		if (tipoAbastecimento == 1) {
			double quantidade = teclado.nextDouble();
			bombas[opcaoCombustivel - 1].abastecerPorLitros(quantidade);
			bombas[opcaoCombustivel - 1].imprimirRecibo();
		}

		if (tipoAbastecimento == 2) {
			double valor = teclado.nextDouble();
			bombas[opcaoCombustivel - 1].abastecerPorValor(valor);
			bombas[opcaoCombustivel - 1].imprimirRecibo();
		}

		teclado.close();
	}
}
