package domain;

import java.util.Scanner;

public class Operations extends Array   {
	
public void newArray(){
	
	System.out.println("������� ���������� ��������� �������: ");
	Scanner sc = new Scanner(System.in);
	count = sc.nextInt();
	numbers = new int[count];
	
	for(int i = 0; i < numbers.length; i++){
		System.out.println("������� " + c + " ������� ������� ");
		Scanner a = new Scanner(System.in);
		numbers[i] = a.nextInt();
		c++;
	
	}
}

public void bubbleSortUp() {
	
	for(int b = 1; b < count; b++)
	      for(int d = count - 1; d >= b; d--) {
	        if(numbers[d - 1] > numbers[d]) { 
	                                          
	          int t = numbers[d - 1];
	          numbers[d - 1] = numbers[d];
	          numbers[d] = t;
	      }
	    }
	
	System.out.print("���������� ������� �� �����������: ");
    for(int i = 0; i < count; i++)
      System.out.print(" " + numbers[i]);
    System.out.println();
}	

public void bubbleSortDn() {
	
	for(int b = 1; b < count; b++)
	      for(int d = count - 1; d >= b; d--) {
	        if(numbers[d - 1] < numbers[d]) { 
	                                          
	          int t = numbers[d - 1];
	          numbers[d - 1] = numbers[d];
	          numbers[d] = t;
	      }
	    }
	
	System.out.print("���������� ������� �� ��������: ");
    for(int i = 0; i < count; i++)
      System.out.print(" " + numbers[i]);
    System.out.println();
}	

public void getMax(){
	
int max = numbers[0];

for(int i = 1; i < count; i++){
    if(numbers[i] > max){
        max = numbers[i];
    }
}
    System.out.println("������������ ������� � �������: " + max);
}

public void getMin(){
	
int min = numbers[0];

for(int i = 1; i < count; i++){
    if(numbers[i] < min){ 
        min = numbers[i];
    }
}
    System.out.println("����������� ������� � �������: " + min);
}
}

