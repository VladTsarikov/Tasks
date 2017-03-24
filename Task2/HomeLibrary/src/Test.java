import java.util.Scanner;


public class Test {

	public static void main(String[] args){
		
		Book books[] = new Book[4];
		books[0] = new Book();
		books[1] = new Book();
		books[2] = new Book();
		books[3] = new Book();
		books[0].addBook("Book1","author1",1999);
		books[1].addBook("Book2","author2",1995);
		books[2].addBook("Book3","author3",2016);
		books[3].addBook("Book4","author4",2013);
	
		Library m = new Library(books);
		System.out.println("1.Посмотреть список всех книг " );
		System.out.println("2.Вывести книги по году издания " );
		System.out.println("3.Поиск книги по автору " );
		Scanner s1 = new Scanner(System.in);
		int w = s1.nextInt();
		if(w == 1){
			for(int i = 0; i < books.length; i++){
			System.out.println(books[i].getName());
			}
		
		}
		
		if(w == 2){
			m.SortBooks();
		}

		if(w == 3){
			m.findBook();
		}
		
		
	
		
		
		
		
	}
}
