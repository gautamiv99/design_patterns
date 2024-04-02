package StrategyPattern;

public class MotoVehicle extends Vehicle {
	
	public MotoVehicle() {
		super(new NormalDriveStrategy());
	}

}
