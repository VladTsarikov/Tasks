package by.htp.airplane.logic;

import java.util.Scanner;

public class Fly {

	private String route;
	
	public void fly(){
		System.out.println("—амолЄт вылетел по заданному маршруту ");
	}
	
	public void addRoute(){
		System.out.println("¬ведите пункт назначени€: ");
		Scanner sc = new Scanner(System.in);
		String route = sc.nextLine();
		this.route = route;
				
	}
	
	public void showRoute(){
		System.out.println(route);
	}
}
