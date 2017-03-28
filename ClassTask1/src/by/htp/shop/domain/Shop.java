package by.htp.shop.domain;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Shop {

	public static int count;
	Customer customers[];
	public Shop(Customer customers[]) {
		this.customers=customers;
		}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Shop.count = count;
	}

	public void findCustomer(){

			System.out.println("Введите интервал кредитной карточки: ");
			Scanner s1 = new Scanner(System.in);
			int f = s1.nextInt();
			Scanner s2 = new Scanner(System.in);
			int l = s2.nextInt();
			for(int i = 0; i < customers.length; i++){
				if(customers[i].getCreditCard()>=f && customers[i].getCreditCard()<=l){
					System.out.println(customers[i].getSecondName() + ", " + customers[i].getFirstName()+ ", " + customers[i].getMiddleName());
				}
			}

	}
		
	}
	


