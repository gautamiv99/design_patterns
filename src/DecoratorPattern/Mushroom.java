package DecoratorPattern;

public class Mushroom extends ToppingsDecorator {
	
	BasePizza pizza;
	
	public Mushroom(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public int cost() {
		return pizza.cost() + 15;
	}

}
