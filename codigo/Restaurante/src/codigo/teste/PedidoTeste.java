package codigo.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codigo.Pedido;
import codigo.Pizza;
/**
 * 
 * @author Ana Flavia
 * TDD criado para classe Pedido 
 */
class PedidoTeste {
	
	public Pedido pedido;
	public Pizza pizza;
	
    @BeforeEach
    public void init(){
        pizza = new Pizza(4);
        pedido = new Pedido();
    }
    
	@Test
	void testantoValidacaoDoPedido() {
		Assertions.assertTrue(pedido.validarPedido());
	}
	
	@Test
	void testandoValorDoPedido() {
		pedido.adicionarPizza(pizza);
		Assertions.assertEquals(41, pedido.valorPedido());
	}
	
	@Test
	void testantoNotaGerada() {
		pedido.adicionarPizza(pizza);
        String relatorio = pedido.gerarNota();
    
        Assertions.assertTrue(relatorio.contains("Pizza"));
	}

}
