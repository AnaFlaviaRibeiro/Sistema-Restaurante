package codigo.teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codigo.Pizza;

public class PizzaTeste {

	private Pizza pizza;

	@BeforeEach
	public void init() {
		pizza = new Pizza(4);
	}

	@Test
	public void testandoValidacaoDeAdicionais() {
		Assertions.assertTrue(pizza.validarQuantidadeAdicionais(4));
	}

	@Test
	public void testatandoAdiconaisNPizza() {
		Assertions.assertTrue(pizza.adicionarIngredientes(4));
	}

	@Test
	public void testCalcularPreco() {
		Assertions.assertEquals(41, pizza.calcularPreco());
	}

	@Test
	public void testRelatorio() {
		pizza.adicionarIngredientes(3);
		String relatorio = pizza.relatorio();
		Assertions.assertTrue(relatorio.contains("Pizza"));
	}
}