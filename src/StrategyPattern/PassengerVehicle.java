package StrategyPattern;

public class PassengerVehicle extends Vehicle{
	
	public PassengerVehicle() {
		super(new NormalDriveStrategy());
		// TODO Auto-generated constructor stub
	}

}
