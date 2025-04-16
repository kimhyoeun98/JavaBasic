package Bank;

import java.util.LinkedList;

public class AccountService {

	private LinkedList<Account> accountList = new LinkedList<>();
	
	
	public boolean newAccount(String accountNo, String accountOwner, int money) {
		
		accountList.add(new Account(accountNo, accountOwner, money));
		return true;
	}
	
	public LinkedList<Account> listAccounts(){
		
		return accountList;
	}
	
	private Account getAccount(String accountNo) {
		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo)) {
				return account;
		}
	}
		return null;
	}
	public Account detailAccount(String accountNo) {
		return getAccount(accountNo);
	}
	public boolean deposit(String accountNo, int amount) {
		Account account =  getAccount(accountNo);
		if (account == null) return false;
		account.deposit(amount);
		return true;
	}

	public boolean withdraw(String accountNo, int amount) {
		 Account account = getAccount(accountNo);
		 if (account == null) return false;
		 return account.withdraw(amount);
	
		
	}
	public boolean isAccountNumberValid(String accountNo) {
		for (Account account : accountList) {
			if (account.getAccountNo().equals(accountNo))
				return false;
		}
		return true;
	}
}


