package book;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private String publisher;
    private int price;
    private boolean instock;

    public Book(int bookNo, String title, String author, String publisher, int price, boolean instock) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.instock = instock;
    }

    // Getter
    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInstock() {
        return instock;
    }

    // Setter
    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInstock(boolean instock) {
        this.instock = instock;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s / %s / %s / %d원 / %s",
            bookNo, title, author, publisher, price, (instock ? "대여 가능" : "대여 중"));
    }
}
