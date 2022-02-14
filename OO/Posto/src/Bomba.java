
public class Bomba {
	private Combustivel combustivel;
	private double quantidade;
	private double valorTotal;

	public Bomba(Combustivel combustivel) {
		super();
		this.combustivel = combustivel;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public String display(Bomba bomba) {
		return bomba.getCombustivel().getNome() + " - R$ " + bomba.getCombustivel().getPreco();
	}

	public void abastecerPorLitros(double quantidade) {
		this.quantidade = quantidade;
		this.valorTotal = this.quantidade * this.combustivel.getPreco();
	}

	public void abastecerPorValor(double valor) {
		this.quantidade = valor / this.combustivel.getPreco();
		this.valorTotal = valor;
	}

	public void imprimirRecibo() {
		System.out.println("==================== Recibo ===================");
		System.out.println("Combustivel: " + combustivel.getNome());
		System.out.printf("Preço litro: R$ %.3f \n", combustivel.getPreco());
		System.out.printf("Total abastecido: %.2f litros \n", quantidade);
		System.out.printf("Valor total: R$ %.3f", valorTotal);
	}

}
