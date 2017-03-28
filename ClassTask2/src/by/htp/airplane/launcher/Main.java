package by.htp.airplane.launcher;

import by.htp.airplane.entity.Chassis;
import by.htp.airplane.entity.Engine;
import by.htp.airplane.entity.Plane;
import by.htp.airplane.entity.Wing;

public class Main {

	public static void main(String[] args){
		
		
		Wing wing = new Wing();
		wing.setWingSize(5);
		wing.setWingSquare(200);
		
		Engine engine = new Engine();
		engine.setEnginePower(200);
		engine.setFuelConsumption(20000);
		
		Chassis chassis = new Chassis();
		chassis.setChassisSize(60);
		chassis.setChassisType("");
		chassis.setChassisWeight(50);
		
		Plane boing = new Plane(wing,chassis,engine);
		boing.setName("Boing 747");
		boing.setCountOfSeat(180);
		boing.setPlaneSize(20);
		
		boing.addRoute();
		boing.showRoute();
		boing.fly();
		
	}
}
