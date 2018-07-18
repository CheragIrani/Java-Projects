package bankapp;

public class SavingAccount extends CurrentAccount {

	@Override 
	public double getInterest() {
		return 0.1;
	}
}
