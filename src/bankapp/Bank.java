package bankapp;

public class Bank {

	public void payInterest(Account a){
		double money = a.getBalance();
		double next = money * a.getInterest();
		a.setBalance(next);
	}
	
	public static void transfer(Account from, Account to, double amount) {
		if (from.getBalance() < amount) {} // problem!;
		if (from == to) {} // problem!;
		
		from.setBalance(from.getBalance() - amount);
		to.setBalance(to.getBalance() + amount);
	}
	
	public static void main(String[] args) {
		Account c1 = new LogAccount(new CurrentAccount());
		
		c1.setBalance(1000);
		
		
		Account c2 = new LogAccount(new CurrentAccount());
		c2.setBalance(10);
		
		transfer(c1, c2, 400);
		
	}
}
