package by.htp.shop.launch;
import java.util.Arrays;

import by.htp.shop.domain.Customer;
import by.htp.shop.domain.Shop;


public class Test {

	public static void main(String[] args){
	
		Shop.setCount(4);
		Customer customers[] = new Customer[Shop.count];
		
		customers[0] = new Customer(1,"������","����","��������","SomeAdress1",10,11);
		customers[1] = new Customer(2,"�������","����","��������","SomeAdress3",20,22);
		customers[2] = new Customer(3,"������","ϸ��","��������","SomeAdress2",30,33);
		customers[3] = new Customer(4,"�������","ϸ��","��������","SomeAdress4",40,44);
		
		Shop m = new Shop(customers);
		m.findCustomer();
		
	   
	
	
		
		
		
	}
}
