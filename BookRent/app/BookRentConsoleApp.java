package app;

import java.util.ArrayList;
import java.util.Scanner;
import book.Book;
import book.BookService;

public class BookRentConsoleApp {
    private BookService bs = new BookService();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BookRentConsoleApp app = new BookRentConsoleApp();
        app.displayWelcome();
        app.controlMenu();
    }

    private void displayWelcome() {
        System.out.println("*************************************");
        System.out.println("*     도서 대여점에 오신 걸 환영합니다.     *");
        System.out.println("*************************************");
    }

    private void controlMenu() {
        int menu;
        do {
            menu = getMenu();
            switch (menu) {
                case 1: menuBookList(); break;
                case 2: menuBookRent(); break;
                case 3: menuBookRentList(); break;
                case 4: menuBookReturn(); break;
                case 5: menuBookRegist(); break;
                case 6: menuBookUpdate(); break;
                case 7: menuBookRemove(); break;
                case 8: allBookList(); break;
                case 0: menuExit(); break;
                default: System.out.println("[오류] 존재하지 않는 메뉴입니다.");
            }
        } while (menu != 0);
    }

    private int getMenu() {
        System.out.println("=================================");
        System.out.println("1. 도서 목록 보기");
        System.out.println("2. 도서 대여");
        System.out.println("3. 도서 대여 현황 보기");
        System.out.println("4. 도서 반납");
        System.out.println("5. 도서 등록");
        System.out.println("6. 도서 정보 수정");
        System.out.println("7. 도서 삭제");
        System.out.println("8. 전체 도서 목록 보기");
        System.out.println("0. 종료");
        System.out.println("=================================");
        System.out.print(">> 메뉴 선택 : ");
        return sc.nextInt();
    }

    private void menuBookList() {
        displayBookList(bs.listInstockBooks());
    }

    private void menuBookRentList() {
        displayBookList(bs.listRentBooks());
    }

    private void allBookList() {
        System.out.println("전체 도서 목록");
        displayBookList(bs.allBookList());
    }

    private void menuBookRent() {
        displayBookList(bs.listInstockBooks());
        System.out.print(">> 대여할 도서 번호: ");
        int bookNo = sc.nextInt();
        if (bs.rentBook(bookNo)) {
            System.out.println("[알림] 도서가 대여되었습니다.");
            displayBookList(bs.listRentBooks());
        } else {
            System.out.println("[오류] 존재하지 않거나 이미 대여 중인 도서입니다.");
        }
    }

    private void menuBookReturn() {
        displayBookList(bs.listRentBooks());
        System.out.print(">> 반납할 도서 번호: ");
        int bookNo = sc.nextInt();
        if (bs.returnBook(bookNo)) {
            System.out.println("[알림] 도서가 반납되었습니다.");
        } else {
            System.out.println("[오류] 존재하지 않거나 이미 반납된 도서입니다.");
        }
    }

    private void menuBookRegist() {
        sc.nextLine(); // 버퍼 비우기
        System.out.print(">> 제목: ");
        String title = sc.nextLine();
        System.out.print(">> 저자: ");
        String author = sc.nextLine();
        System.out.print(">> 출판사: ");
        String publisher = sc.nextLine();
        System.out.print(">> 가격: ");
        int price = sc.nextInt();

        Book book = new Book(0, title, author, publisher, price, true);
        bs.registBook(book);
        System.out.println("[알림] 도서가 등록되었습니다.");
    }

    private void menuBookUpdate() {
        allBookList();
        System.out.print(">> 수정할 도서 번호: ");
        int bookNo = sc.nextInt();
        System.out.print(">> 새로운 가격: ");
        int price = sc.nextInt();
        bs.updateBook(bookNo, price);
    }

    private void menuBookRemove() {
        allBookList();
        System.out.print(">> 삭제할 도서 번호: ");
        int bookNo = sc.nextInt();
        bs.removeBook(bookNo);
    }

    private void displayBookList(ArrayList<Book> bookList) {
        System.out.println("=================================");
        if (bookList.isEmpty()) {
            System.out.println("도서가 없습니다.");
        } else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
        System.out.println("=================================");
    }

    private void menuExit() {
        System.out.println("*** 도서 대여점 프로그램을 종료합니다. ***");
    }
}
