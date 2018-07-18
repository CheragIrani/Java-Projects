package passwordapp;

public class NoSpace extends PasswordChecker{

	@Override
	public boolean isValid(String userName, String password) {
		return !password.contains(" ");
	}

}
