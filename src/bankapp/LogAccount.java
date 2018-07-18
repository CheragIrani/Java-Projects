package bankapp;

/** Print statements when balances are changed. */
public class LogAccount extends Account {
	
	private Account _account;
	
	public LogAccount(Account account) {
		_account = account;
	}

	@Override
	public double getBalance() {
		double balance = _account.getBalance();
		System.out.println("Get balance from " + this + " returns " + balance);
		return balance;
	}

	@Override
	public void setBalance(double value) {
		System.out.println("Set balance from " + this + " with " + value);
		_account.setBalance(value);
	}

	@Override
	public double getInterest() {
		return _account.getInterest();
	}
}
