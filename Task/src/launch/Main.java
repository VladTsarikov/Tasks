package launch;

import domain.Operations;
import domain.Array;

public class Main  {

	
	public static void main(String[] args){
		
		Operations operation  = new Operations();
		operation.newArray();
		operation.bubbleSortUp();
		operation.bubbleSortDn();
		operation.getMax();
		operation.getMin();
	}
}
