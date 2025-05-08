package book;

import java.util.ArrayList;

public class BookService {
    private int nextBookNo = 401;
    private ArrayList<Book> bookList = new ArrayList<>();

    public BookService() {
        loadBookList();
    }

    public void registBook(Book book) {
        book.setBookNo(nextBookNo);
        bookList.add(book);
        nextBookNo += 100;
    }

    public void removeBook(int bookNo) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookNo() == bookNo) { //get(i)는 배열의 i번째꺼 가져옴
                bookList.remove(i);
                System.out.println("[알림] 도서가 삭제되었습니다.");
                break;
            }
        }
    }

    public void updateBook(int bookNo, int price) {
        for (Book book : bookList) {
            if (book.getBookNo() == bookNo) {
                book.setPrice(price);
                System.out.println("[알림] 가격이 수정되었습니다.");
                return;
            }
        }
        System.out.println("[오류] 해당하는 책을 찾을 수 없습니다.");
    }

    public ArrayList<Book> listInstockBooks() {
        return listBooks(true);
    }

    public ArrayList<Book> listRentBooks() {
        return listBooks(false);
    }

    public ArrayList<Book> allBookList() {
        return bookList;
    }

    public boolean rentBook(int bookNo) {
        return changeBookStatus(bookNo, false);
    }

    public boolean returnBook(int bookNo) {
        return changeBookStatus(bookNo, true);
    }

    // ----------------- 내부 메서드 ------------------

    private ArrayList<Book> listBooks(boolean isInstock) {
        ArrayList<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if (book.isInstock() == isInstock) {
                books.add(book);
            }
        }
        return books;
    }

    private boolean changeBookStatus(int bookNo, boolean toInstock) {
        for (Book book : bookList) {
            if (book.getBookNo() == bookNo && book.isInstock() != toInstock) {
                book.setInstock(toInstock);
                return true;
            }
        }
        return false;
    }

    private void loadBookList() {
        bookList.add(new Book(101, "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", 20000, true));
        bookList.add(new Book(201, "나의 첫 알고리즘 + 자료구조", "코리 알트호프", "한빛미디어", 21000, true));
        bookList.add(new Book(301, "Do It! HTML+CSS+자바스크립트", "고경희", "이지스퍼블리싱", 32000, true));
    }
}
