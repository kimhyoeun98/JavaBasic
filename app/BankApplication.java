package app;

import java.util.LinkedList;
import java.util.Scanner;

import Bank.Account;
import Bank.AccountService;

public class BankApplication {

	Scanner sc = new Scanner(System.in);

	AccountService as = new AccountService();

	public static void main(String[] args) {

		BankApplication app = new BankApplication();

		app.controlmenu();

	}

	public void controlmenu() {

		int menu;
		do {

			menu = selectMenu();

			switch (menu) {
			case 1:
				newAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				menuDeposit();
				break;
			case 4:
				menuWithdraw();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
			}

		} while (menu != 0);
	}

	private void newAccount() {
		System.out.println("계좌생성");
		System.out.print("계좌번호: ");
		String AccountNo = sc.next();
		System.out.print("계좌주: ");
		String accountOwner = sc.next();
		System.out.print("초기입금액: ");
		int money = sc.nextInt();

		if (as.newAccount(AccountNo, accountOwner, money)) {
			System.out.println("결과: 계좌가 생성되었습니다.");
		} else {
			System.out.println("이미 존재하는 계좌번호입니다.");
		}

	}

	private void accountList() {
		System.out.println("계좌 목록");
		LinkedList<Account> list = as.listAccounts();
		System.out.println("-----------------------------");
		if (list.isEmpty()) {
			System.out.println("등록된 계좌가 없습니다.");
		} else {
			for (Account acc : list) {
				System.out.println(acc.toString());
			}

		}
		System.out.println("-----------------------------");

	}

	private void menuDeposit() {
		System.out.println("예금");
		System.out.print("계좌번호: ");
		String accountNo = sc.next();
		System.out.print("예금액:");
		int money = sc.nextInt();

		if (as.deposit(accountNo, money)) {
			System.out.println();
		} else {
			System.out.println("계좌를 찾을 수 없습니다.");
		}
	}

	private void menuWithdraw() {
		System.out.println("출금");
		System.out.print("계좌번호: ");
		String accountNo = sc.next();
		System.out.print("출금액: ");
		int money = sc.nextInt();

		if (as.withdraw(accountNo, money)) {
			System.out.println("출금이 성공되었습니다.");
		} else {
			System.out.println("잔액 부족 또는 계좌를 찾을 수 없습니다.");
		}
	}

	public int selectMenu() {
		String[] menuList = { "종료", "계좌생성","계좌목록", "예금", "출금" };

		System.out.println("----------------------------------");
		for (int i = 1; i < menuList.length; i++) {
			System.out.println(i + "." + menuList[i]);
		}
		System.out.println("0." + menuList[0]);
		System.out.println("----------------------------------");
		System.out.print("선택> ");
		return sc.nextInt();
	}

}
