package ro.ase.cts.SimpleFactory.s05;

public class Main {

	public static void main(String[] args) {
		
		PizzaFactory.createPizza("Cheese");
		PizzaFactory.createPizza("Pepperoni");
		PizzaFactory.createPizza("Prosciuto e Funghi");	
	}
}
