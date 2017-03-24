import java.util.Scanner;


public  class Library  {

	private Book books[];
	 
	public Library(Book[] books) {
		this.books=books;
		}
	
	public void findBook(){

		System.out.println("Введите автора: ");
		Scanner s2 = new Scanner(System.in);
		String q = s2.nextLine();
		for(int i = 0; i < books.length; i++){
			if(books[i].getAuthor().equals(q)){
				System.out.println(books[i].getName() + ", " + books[i].getAuthor()+ ", " + books[i].getYear());
			}
		}
	}
	
	public void SortBooks() {
		
		for(int b = 1; b < books.length; b++)
		      for(int d = books.length - 1; d >= b; d--) {
		        if(books[d - 1].getYear() > books[d].getYear()) { 
		                                          
		          Book t = books[d - 1];
		          books[d - 1] = books[d];
		          books[d] = t;
		      }
		    }
		
		System.out.print("Сортировка книг по году издания: ");
	    for(int i = 0; i < books.length; i++)
	      System.out.print(" " + books[i].getName());
	    System.out.println();
	}	

	/*public void deleteBook(String sN){

		for(int i = 0; i < books.length; i++){
			if(books[i].getAuthor()==sN){
				System.out.println(books[i].getName() + ", " + books[i].getAuthor()+ ", " + books[i].getYear());
			}
		}
	}*/
	
	
}

