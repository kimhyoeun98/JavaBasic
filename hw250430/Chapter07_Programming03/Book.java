package Chapter07_Programming03;

public class Book implements Comparable<Book> {
	int price;
	
	public Book(int price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(Book other) {
		return this.price - other.price;
		
	}
	
	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}

}
