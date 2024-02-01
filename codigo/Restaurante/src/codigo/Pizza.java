package codigo;

/**
 * 
 * @author Ana Flavia Classe Pizza criada
 */
public class Pizza {
	private static final int VALOR_BASICA = 25;
	private static final int MAXIMO_INGREDIENTES = 8;
	private static final int PRECO_INGREDIENTES = 4;
	private String descricao = "Pizza";
	private int quantidadeIngredientes;
	private boolean vendaFechada;
	private boolean isInvalida;

	public Pizza() {
	}

	/**
	 * Construtor que verifica a quantidade de adicionais na pizza e se for válida, a quantidade ingredientes é adicionado na Pizza.
	 * Caso contrário, a varievel isInvalida é acionada 
	 * 
	 * @param quantidadeIngredientes
	 */
	public Pizza(int quantidadeIngredientes) {
		if (this.validarQuantidadeAdicionais(quantidadeIngredientes)) {
			this.quantidadeIngredientes = quantidadeIngredientes;
		} else {
			this.isInvalida = true;
		}
		this.vendaFechada = false;

	}

	/*
	 * Método que verifica se a quanatidade de adicionai é válida
	 */
	public boolean validarQuantidadeAdicionais(int value) {
		if (!this.vendaFechada && value <= MAXIMO_INGREDIENTES) {
			return true;
		} else
			return false;
	}

	/*
	 * Método que adiciona ingredientes na pizza se a quantidade de adicionais for
	 * válida
	 */
	public boolean adicionarIngredientes(int value) {
		if (this.validarQuantidadeAdicionais(value + this.quantidadeIngredientes)) {
			this.quantidadeIngredientes += value;
			return true;
		} else
			return false;
	}

	/*
	 * Método que calcula preço final da pizza
	 */
	public double calcularPreco() {
		return VALOR_BASICA + (this.quantidadeIngredientes * PRECO_INGREDIENTES);
	}

	/*
	 * Relatório da pizza pedida
	 */
	public String relatorio() {
		StringBuilder registroPizza = new StringBuilder("");
		if (this.isInvalida) {
			registroPizza.append("Quantidade de adicionais na pizza é inválido!\n");
			registroPizza.append("A "+ this.descricao+ " ficou em R$ " + String.format("%.2f", this.calcularPreco()));
		} else {
			registroPizza.append(this.descricao + " criada com " + this.quantidadeIngredientes + " ingredientes");
			registroPizza.append("\n");
			registroPizza.append("R$ " + String.format("%.2f", this.calcularPreco()));
		}
		registroPizza.append("\n");
		registroPizza.append("---------------------------------------------");
		return registroPizza.toString();
	}
}
