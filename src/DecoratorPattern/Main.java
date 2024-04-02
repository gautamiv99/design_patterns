package DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		BasePizza pizza = new Mushroom(new ExtraCheese(new Margharitta()));
		int cost = pizza.cost();
		System.out.println(cost);
		// TODO Auto-generated method stub

	}

}
