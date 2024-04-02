package FactoryPattern;

public class ShapeFactory {
	
	public Shape getShape(String shape) {
		switch (shape) {
		case "circle": 
			return new Circle();
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		default:
			throw new IllegalArgumentException("Unexpected value: " + shape);
		}
	}

}
