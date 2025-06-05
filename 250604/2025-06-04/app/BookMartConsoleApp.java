package app;

import java.util.List;

import book.BookService;
import book.BookVO;
import book.HJBookService;
import book.file.ObjFileHashMapBookDAO;
import member.HJMemberService;
import member.MemberService;
import member.MemberVO;
import member.ObjFileHashMapMemberDAO;

public class BookMartConsoleApp {

	String[] startMenuList = {"종료", "도서 목록", "로그인", "회원 가입"};
	String[] adminMenuList = {"로그아웃", "도서 목록", "도서 등록", "도서 정보 수정", "도서 삭제", "회원 목록", "주문 목록"};
	String[] memberMenuList = {"로그아웃", "도서 목록", "도서 주문", "장바바구니 도서 담기", "장바구니 보기", "내 정보"};
	String[] cartMenuList = {"돌아가기", "도서 주문", "도서 삭제", "장바구니 비우기"};
	String[] myInfoMenuList = {"돌아가기", "비밀번호 변경", "회원 탈퇴"};
	
	final String ADMIN_ID = "admin";
	final String ADMIN_PWD = "1234";
	final String ADMIN_NAME = "관리자";
	
	BookService bs = new HJBookService(new ObjFileHashMapBookDAO());
	MemberService ms = new HJMemberService(new ObjFileHashMapMemberDAO());
	MemberVO loggedMember;
	
	MyAppReader input = new MyAppReader();
	
	public static void main(String[] args) {
		BookMartConsoleApp app = new BookMartConsoleApp();
		app.displayWelcome();
		app.controlStartMenu();
	}

	private void displayWelcome() {
		System.out.println("***********************************");
		System.out.println("*  Welcome to Hyejeong Book Mart  *");
		System.out.println("***********************************");
	}

	private void controlStartMenu() {
		int menu;
		do {
			menu = selectMenu(startMenuList);
			
			switch (menu) {
			case 1: menuBookList(); break;
			case 2: menuLogin(); break;
			case 3: menuSignUp(); break;
			case 0: menuExit(); break;
			default : menuWrongNumber();
			}
			
		} while (menu != 0);
		
	}

	private void menuWrongNumber() {
		System.out.println("없는 메뉴입니다.");
		
	}

	private void menuExit() {
		System.out.println("Hyejeong Book Mart 서비스를 종료합니다.");
		
	}

	private void menuBookList() {
		System.out.println("*** 도서 목록 ***");
		displayBookList();
	}
	
	private void displayBookList() {
		List<BookVO> bookList = bs.listBooks();
		System.out.println("---------------------------------------");
		if (bookList.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			for (BookVO book : bookList) {
				System.out.println(book);
			}
		}
		System.out.println("---------------------------------------");	
	}

	private void menuLogin() {
		System.out.println("*** 로그인 ***");
		String id = input.readString(">> id : ");
		String password = input.readString(">> password : ");
		
		// 관리자 -> 관리자 메뉴
		if (id.equals(ADMIN_ID) && password.equals(ADMIN_PWD)) {
			loggedMember = new MemberVO(ADMIN_ID, ADMIN_PWD, ADMIN_NAME);
			System.out.println("관리자 모드로 변경합니다.");
			controlAdminMenu();
		} else {
			// 회원 -> 회원 메뉴
			loggedMember = ms.login(id, password);
			
			if (loggedMember != null) {
				System.out.println("[로그인] " + loggedMember.getUsername() + "님 안녕하세요.");
				controlMemberMenu();
			} else {
				// 아니면
				System.out.println("로그인을 하지 못했습니다.");
			}
		}
		
	}

	private void controlMemberMenu() {

	}

	private void controlAdminMenu() {
		int menu;
		do {
			menu = selectMenu(adminMenuList);
			// "로그아웃", "도서 목록", "도서 등록", "도서 정보 수정", "도서 삭제", "회원 목록", "주문 목록"
			switch (menu) {
			case 1: menuBookList(); break;
			case 2: menuBookRegist(); break;
			case 3: menuBookUpdate(); break;
			case 4: menuBookRemove(); break;
			case 5: menuMemberList(); break;
			case 6: menuOrderList(); break;
			case 0: menuLogout(); break;
			default : menuWrongNumber();
			}
			
		} while (menu != 0 && loggedMember != null);
		
	}

	private void menuBookRegist() {
		
		System.out.println("*** 도서 등록 ***");
		String title = input.readString(">> 도서 제목 : ");
		String author = input.readString(">> 저자 : ");
		String publisher = input.readString(">> 출판사 : ");
		int price = input.readInt(">> 가격 : ");
		int instock = input.readInt(">> 재고량 : ");
		
		if (bs.registBook(new BookVO(title, author, publisher, price, instock))) {
			System.out.println("도서를 등록했습니다.");
			displayBookList();
		} else {
			System.out.println("도서 등록에 실패했습니다.");
		}
		
	}

	private void menuBookUpdate() {
		// TODO Auto-generated method stub
		
	}

	private void menuBookRemove() {
		// TODO Auto-generated method stub
		
	}

	private void menuMemberList() {
		// TODO Auto-generated method stub
		
	}

	private void menuOrderList() {
		// TODO Auto-generated method stub
		
	}

	private void menuLogout() {
		
		System.out.println("[로그아웃] " + loggedMember.getUsername() + "님, 안녕히 가십시오.");
		loggedMember = null;
		
	}

	private void menuSignUp() {
		System.out.println("*** 회원 가입 ***");
		String id = input.readString(">> id : ");
		String password = input.readString(">> password : ");
		String username = input.readString(">> username : ");
		
		if (ms.registMember(new MemberVO(id, password, username))) {
			System.out.println("회원 가입이 완료되었습니다. 서비스 이용을 위한 로그인 해주세요.");
		} else {
			System.out.println("회원 가입에 실패하였습니다.");
		}
		
	}

	private int selectMenu(String[] menuList) {

		System.out.println("-------------------------------");
		for (int i = 1; i < menuList.length; i++) {
			System.out.println(i + ". " + menuList[i]);
		}
		System.out.println("0. " + menuList[0]);
		System.out.println("-------------------------------");
		return input.readInt(">> 메뉴 선택 : ");
	}
}
