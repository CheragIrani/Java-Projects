package passwordapp;

import java.util.ArrayList;

public class Composite extends PasswordChecker {
	
	private ArrayList<PasswordChecker> checkers;
	
	public Composite(ArrayList<PasswordChecker> passwordCheckers) {
		checkers = passwordCheckers;
	}

	@Override
	public boolean isValid(String userName, String password) {
		for (PasswordChecker checker: checkers) {
			if (!checker.isValid(userName, password)) return false;
		}
		return true;
	}
}
