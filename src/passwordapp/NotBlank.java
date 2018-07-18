package passwordapp;

public class NotBlank extends PasswordChecker{

	@Override
	public boolean isValid(String userName, String password) {
		return !password.isEmpty();
	}

}
