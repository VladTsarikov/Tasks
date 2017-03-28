package by.htp.airplane.entity;

import by.htp.airplane.logic.Fly;

public class Plane extends Fly {

	private String name;
	private int planeSize;
	private int countOfSeat;
	Object wing = new Wing();
	Object chassis = new Chassis();
	Object engine = new Engine();
	
	
	public Plane(Object wing,Object chassis,Object engine){
		this.wing = wing;
		this.chassis = chassis;
		this.engine = engine;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPlaneSize() {
		return planeSize;
	}


	public void setPlaneSize(int planeSize) {
		this.planeSize = planeSize;
	}


	public int getCountOfSeat() {
		return countOfSeat;
	}


	public void setCountOfSeat(int countOfSeat) {
		this.countOfSeat = countOfSeat;
	}
	
	}


