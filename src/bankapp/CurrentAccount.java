package bankapp;

public class CurrentAccount extends Account {

	private double balance;
	
	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void setBalance(double value) {
		balance = value;
	}

	@Override
	public double getInterest() {
		return 0;
	}

}
