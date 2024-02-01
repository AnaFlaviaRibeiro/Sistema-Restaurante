package codigo;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Ana Flavia
 * Classe Pedido
 */
public class Pedido {

	private static long id;
	private static final int QUANTMAX = 10;
	private List<Pizza> pizza;
	
	/**
	 * COntrutor que cria uma pizza e faz a icrementação do id para cada Pedido
	 */
	public Pedido() {
		this.pizza = new ArrayList<Pizza>();
		id ++;
	}
	/**
	 * Método que válida Pedido a partir do tamanho da Lista de pizzas
	 */
	public boolean validarPedido() {
		return pizza.size() <= QUANTMAX;
	}
	/**
	 * Método que faz a soma de todos os valores das pizzas do pedido
	 */
	public double valorPedido() {
		double valor = 0;
		for(Pizza valorPizza : pizza) {
			valor += valorPizza.calcularPreco();
		}
		return valor;
	}
	/**
	 * Método que verifica se o pedido está válido e adiciona a pizza passada por parametro. Caso já tenha atingido o limite
	 * de pizzas no pedido, será exibido um erro sem adicionar a nova pizza. 
	 * @param item
	 */
	public void adicionarPizza(Pizza item) {
		if(this.validarPedido()){
			pizza.add(item);
		} else {
			System.out.println("Não foi possível adicionar mais pizzas no seu pedido!\n");
		}
		
	}
	/**
	 * Relatório do Pedido
	 */
	public String gerarNota() {
        StringBuilder notaPedido = new StringBuilder("Pedido nº "+id+"\n");
        for (Pizza itemPedido : pizza) {
            notaPedido.append("\n"+itemPedido.relatorio());    
        }
        notaPedido.append("\nTOTAL DO PEDIDO: R$ "+String.format("%.2f", this.valorPedido())+"\n");
        notaPedido.append("x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x.x");
        return notaPedido.toString();
	}
}
