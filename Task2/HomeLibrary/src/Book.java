
public class Book {

	private String name;
	private String author;
	private int year;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void addBook(String name,String author,int year){
		this.name = name;
		this.author = author;
		this.year = year;
	}
	
}

