import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
							//1
		/*System.out.println("Hello world!");*/
		
							//2
		/*System.out.println("Tsarikov");
		System.out.println("Vladislav");
		System.out.println("Olegovich");*/
		
							//3
		/*int a = 4;
		int b = 6;
		System.out.println(a+b);*/
		
							//4
		/*System.out.println("Vvedite pervoe chislo");
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        System.out.println("Vvedite vtoroe chislo");
        Scanner b1 = new Scanner(System.in);
        int b = b1.nextInt();
        System.out.println("Vvedite znak");
        Scanner c1 = new Scanner(System.in);
        String c = c1.nextLine();
        int r = 0;
        if(c.equals("+")){
            r=a+b;
        }
        if(c.equals("-")){
            r=a-b;
        }
        if(c.equals("*")){
            r=a*b;
        }
        if(c.equals("/")){
            r=a/b;
        }
        System.out.println(r);*/
		
							//5
		/*System.out.println("Vvedite chislo");
		Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
		if(a==0){
			System.out.println("zero");
		}
		if(a==1){
			System.out.println("one");
		}
		if(a==2){
			System.out.println("two");
		}
		if(a==3){
			System.out.println("three");
		}
		if(a==4){
			System.out.println("four");
		}
		if(a==5){
			System.out.println("five");
		}
		if(a==6){
			System.out.println("six");
		}
		if(a==7){
			System.out.println("seven");
		}
		if(a==8){
			System.out.println("eight");
		}
		if(a==9){
			System.out.println("nine");
		}*/
		
							//6
		/*System.out.println("Vvedite chislo");
		Scanner a1 = new Scanner(System.in);
		int a = a1.nextInt();
		while(a>=0 && a<10){
		if(a%2==0){
			System.out.println("Chislo chotnoe");
		}else 
			System.out.println("Chislo ne chotnoe");
		break;
		}*/
		
							//7
		/*System.out.println("Vvedite chislo");
		Scanner a1 = new Scanner(System.in);
		int a = a1.nextInt();
		while(a>=-9 && a<10){
		if(a%2==0 && a>=0){
			System.out.println("Chislo chotnoe polojitelnoe");
		}else{
			System.out.println("Chislo ne javlyaetsa chotnym polojitelnym");
		}
		break;
		}*/
		
							//8
		/*System.out.println("Enter the name of the month");
		Scanner s1 = new Scanner(System.in);
		String s = s1.nextLine();
		if(s.equals("December") || s.equals("January") || s.equals("February")){
			System.out.println("It's winter");
		}
		else if(s.equals("March") || s.equals("April") || s.equals("May")){
			System.out.println("It's spring");
		}
		else if(s.equals("June") || s.equals("July") || s.equals("August")){
			System.out.println("It's summer");
		}
		else if(s.equals("September") || s.equals("October") || s.equals("November")){
			System.out.println("It's autumn");
		}*/
		
							//9
		/*int result=0;
		for(int i = 0; i<=100; i++){
			result = result + i;
		}
		System.out.println("The sum is: " + result);*/
		
							//10
		/*System.out.println("Enter the first number");
        Scanner a1 = new Scanner(System.in);
        int a = a1.nextInt();
        System.out.println("Enter the seccond number");
        Scanner b1 = new Scanner(System.in);
        int b = b1.nextInt();
        System.out.println("Enter the third number");
        Scanner c1 = new Scanner(System.in);
        int c = c1.nextInt();
		if(a==b && a==c && b==c){
		System.out.println("All numbers must be different");}
		int max=0;
		int min=0;
		int sum=0;
		if(a>b && a>c && c>b){
			max = a;
			min = b;
			sum = max + min;
		} else if(a>b && a>c && b>c){
			max = a;
			min = c;
			sum = max + min;
		}
		else if(b>a && b>c && a>c){
			max = b;
			min = c;
			sum = max + min;
		}
		else if(b>a && b>c && c>a){
			max = b;
			min = a;
			sum = max + min;
		}
		else if(c>b && c>a && a>b){
			max = c;
			min = b;
			sum = max + min;
		}
		else if(c>b && c>a && b>a){
			max = c;
			min = a;
			sum = max + min;
		}
		System.out.println("The sum is " + sum);*/
		
							//11
		/*char c;
		do{
			System.out.println("Enter the symbol");
			Scanner c1 = new Scanner(System.in);
			c = c1.next().charAt(0);
		}while(c != 'q');			
		System.out.println("You have entered the symbol q");*/
		
							//12
		/*String s;
		do{
			System.out.println("Enter the strings");
			Scanner s1 = new Scanner(System.in);
			s = s1.nextLine();
		}while(!s.equals("stop"));			
		System.out.println("You have entered the word stop");*/
		
							//13
		
    }
}
