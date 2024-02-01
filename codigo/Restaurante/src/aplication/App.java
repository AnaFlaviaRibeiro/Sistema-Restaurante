package aplication;

import codigo.Pedido;
import codigo.Pizza;

/**
 * Main ilustrativo do sistema
 * 
 * @author Ana Flavia
 *
 */
public class App {

	public static void main(String[] args) {		
		Pizza p1 = new Pizza(2);
		Pizza p2 = new Pizza(2);
		Pizza p3 = new Pizza(10);
		Pizza p4 = new Pizza(1);
		Pizza p5 = new Pizza(2);
		Pizza p6 = new Pizza(1);
		Pizza p7 = new Pizza(5);
		Pizza p8 = new Pizza(10);
		Pizza p9 = new Pizza(5);
		Pizza p10 = new Pizza(2);
		Pizza p11 = new Pizza(1);

		Pedido pedido = new Pedido();

		pedido.adicionarPizza(p2);
		pedido.adicionarPizza(p3);
		pedido.adicionarPizza(p6);
		pedido.adicionarPizza(p7);
		pedido.adicionarPizza(p5);
		pedido.adicionarPizza(p6);
		pedido.adicionarPizza(p1);
		pedido.adicionarPizza(p8);
		pedido.adicionarPizza(p9);
		pedido.adicionarPizza(p10);
		pedido.adicionarPizza(p4);
		pedido.adicionarPizza(p11);
		System.out.println(pedido.gerarNota());

	}

}
