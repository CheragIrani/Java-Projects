package passwordapp;

public class NotUserName extends PasswordChecker {

	@Override
	public boolean isValid(String userName, String password) {
		if (!userName.equals(password)){
			return true;
		}
		return false;
	}
}
