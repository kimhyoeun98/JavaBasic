package Bank;

public class Account {
	

	private String accountNo;
	private String accountOwner;
	private int money;

	public Account(String accountNo, String accountOwner, int money) {
	    this.accountNo = accountNo;
	    this.accountOwner = accountOwner;
		this.money = money;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public int getMoney() {
		return money;
	}
	 public void deposit(int amount) {
	        this.money += amount;
	    }
	 public boolean withdraw(int amount) {
	        if (money >= amount) {
	            this.money -= amount;
	            return true;
	        }
	        return false;
	    }
	
	@Override
	public String toString() {
		return "[" + accountNo + "," + accountOwner + "," + money + "]";
	}


}
