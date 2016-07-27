package factory;

import org.junit.Test;

public class PizzTest {

	@Test
	public void PizzTestDrive() {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan order a " + pizza.name + "\n");

		pizza = chicagoStore.orderPizza("cheese");

		System.out.println("Joel order a " + pizza.name + "\n");
	}
}
